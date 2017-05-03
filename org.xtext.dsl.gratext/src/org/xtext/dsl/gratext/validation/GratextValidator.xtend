/*
 * generated by Xtext 2.10.0
 */
package org.xtext.dsl.gratext.validation

import org.eclipse.xtext.validation.Check
import org.xtext.dsl.gratext.gratext.Dispositivos
import org.xtext.dsl.gratext.gratext.Granja
import org.xtext.dsl.gratext.gratext.GratextPackage
import org.xtext.dsl.gratext.gratext.accion

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GratextValidator extends AbstractGratextValidator {
public static val INVALID_NAME = 'invalidName'
public static val NAME_LONG = 'Nombre_Largo'
public static val ACCION_INCORRECTA = 'Accion_incorrecta'
public static val TEMPERATURA_INCORRECTA = 'Temperatura_incorrecta'
public static val NUMERO_INCORRECTO = 'Numero_incorrecto'

@Check
def checkGreetingStartsWithCapital(Granja granja) {
	if (!Character.isUpperCase(granja.name.charAt(0))) {
		warning('Nombre de la granja demasiado largo', GratextPackage.Literals.GRANJA__NAME, INVALID_NAME)
	}
}

@Check
def checkDispositvoBarrerar(Dispositivos dispositivo) {
	if (dispositivo.nombre.getName.equals("BARRERA_SEGURIDAD") && !checkBarrera(dispositivo.accion)) {
		error("La accion no es la correcta para este dispositivo", GratextPackage.Literals.DISPOSITIVOS__ACCION,
			ACCION_INCORRECTA)

	}

}

@Check
def checkCodigo(Dispositivos dispositivo) {
	if (dispositivo.codigo.length > 20) {
		warning(
			"No se recomiendan nombres de codigos de mas de 20 carcateres",
			GratextPackage.Literals.DISPOSITIVOS__CODIGO,
			NAME_LONG
		)
	}

}

@Check
def checkDispositivoCamara(Dispositivos dispositivo) {
	if (dispositivo.nombre.getName.equals("CAMARA") && !checkCamara(dispositivo.accion)) {
		error("La accion no es la correcta para este dispositivo", GratextPackage.Literals.DISPOSITIVOS__ACCION,
			ACCION_INCORRECTA)

	}
}

def checkCamara(accion accion) {
	if (accion.nombreAccion.getName.equals("ABRIR") || accion.nombreAccion.getName.equals("CERRAR") ||
		accion.nombreAccion.getName.equals("SACAR") || accion.nombreAccion.getName.equals("GRABAR") ||
		accion.nombreAccion.getName.equals("ACTIVAR") || accion.nombreAccion.getName.equals("DESACTIVAR"))
		true
}

@Check
def checkDispositivoEstado(Dispositivos dispositivo) {
	if ((dispositivo.nombre.getName.equals("DEPOSITO_LECHE") || dispositivo.nombre.getName.equals("EMERGENCIA") ||
		dispositivo.nombre.getName.equals("FUEGO_HUMO") || dispositivo.nombre.getName.equals("INUNDACION") ||
		dispositivo.nombre.getName.equals("VIENTO") || dispositivo.nombre.getName.equals("ROTURA_CRISTAL") ||
		dispositivo.nombre.getName.equals("CO2") || dispositivo.nombre.getName.equals("LLUVIA") ||
		dispositivo.nombre.getName.equals("ESTACION_METEOROLOGICA") ) && !checkEstado(dispositivo.accion)) {
		error("La accion no es la correcta para este dispositivo", GratextPackage.Literals.DISPOSITIVOS__ACCION,
			ACCION_INCORRECTA)

	}
}

def checkEstado(accion accion) {
	if (accion.nombreAccion.getName.equals("ESTADO"))
		true
}

@Check
def checkDispositivoADE(Dispositivos dispositivo) {
	if ((dispositivo.nombre.getName.equals("ROBOT_LIMPIADOR") || dispositivo.nombre.getName.equals("LUMINOSIDAD") ||
		dispositivo.nombre.getName.equals("NEVERAS") || dispositivo.nombre.getName.equals("RADIOFRECUENCIA") ) &&
		!checkADE(dispositivo.accion)) {
		error("La accion no es la correcta para este dispositivo", GratextPackage.Literals.DISPOSITIVOS__ACCION,
			ACCION_INCORRECTA)

	}
}

def checkADE(accion accion) {
	if (checkEstado(accion) || accion.nombreAccion.getName.equals("APAGAR") ||
		accion.nombreAccion.getName.equals("ENCENDER") || accion.nombreAccion.getName.equals("ACTIVAR") ||
		accion.nombreAccion.getName.equals("DESCATIVAR"))
		true
}

def checkBarrera(accion accion) {
	if (accion.nombreAccion.getName.equals("ABRIR") || accion.nombreAccion.getName.equals("CERRAR") ||
		accion.nombreAccion.getName.equals("ESTADO"))
		true
}

@Check
def checkDispositivoTemperatura(Dispositivos dispositivo) {
	if (dispositivo.nombre.getName.equals("TEMPERATURA") && !checkTemperatura(dispositivo.temperatura))
		warning("Recuerde que necesita el lugar AMBIENTE/INTERNA/NEVERA/MECEDORA/DEPOSITO_LECHE",
			GratextPackage.Literals.DISPOSITIVOS__NOMBRE, TEMPERATURA_INCORRECTA)
	else if (!dispositivo.nombre.getName.equals("TEMPERATURA") && checkTemperatura(dispositivo.temperatura)) {
		error("No es posible poner estos valores para " + dispositivo.nombre,
			GratextPackage.Literals.DISPOSITIVOS__TEMPERATURA, TEMPERATURA_INCORRECTA)
	}
}

def checkTemperatura(String estado) {
	if (estado.equalsIgnoreCase("AMBIENTE") || estado.equalsIgnoreCase("INTERNA") ||
		estado.equalsIgnoreCase("NEVERA") || estado.equalsIgnoreCase("MECEDORA") ||
		estado.equalsIgnoreCase("DEPOSITO_LECHE") || estado.equalsIgnoreCase("EXTERNA"))
		return true
}

@Check
def checkDispositivosNumerosEnteros(Dispositivos dispositivo) {
	if ( !comprobarDispositivosNumericos(dispositivo) &&
			!dispositivo.accion.numero.isNullOrEmpty
		){
			error("No se pueden poner valores numericos " + dispositivo.nombre,
			GratextPackage.Literals.DISPOSITIVOS__ACCION, NUMERO_INCORRECTO)
	} else if( dispositivo.nombre.getName.equals("CAMARA") &&
		checkNumeroDouble(dispositivo.accion.numero)
	){
	error("El dispositivo " + dispositivo.nombre+ " no admite valores decimales",
			GratextPackage.Literals.DISPOSITIVOS__ACCION, NUMERO_INCORRECTO)
	}
	
	
	}
	
	def comprobarDispositivosNumericos(Dispositivos dispositivo){
		if( dispositivo.nombre.getName.equals("TEMPERATURA")||
			dispositivo.nombre.getName.equals("CAMARA")||
			dispositivo.nombre.getName.equals("LUMINOSIDAD"))
			true
	}
	
	def checkNumeroDouble (String numero){
		if(Double.parseDouble(numero) != 0.0){
			true
			
		}
	}
@Check
def checkAumentarDisminuir(Dispositivos dispositivo){
		if (( !dispositivo.nombre.getName.equals("TEMPERATURA")||
			!dispositivo.nombre.getName.equals("LUMINOSIDAD") &&
			checkAumentoDisminu(dispositivo.accion)) )
			error("Error al realizar la accion solo es posible para temperatura y luminosidad" + dispositivo.nombre,
			GratextPackage.Literals.ACCION__NOMBRE_ACCION, ACCION_INCORRECTA)
	
			else if( dispositivo.nombre.getName.equals("TEMPERATURA")||
			dispositivo.nombre.getName.equals("LUMINOSIDAD") &&
			checkAumentoDisminu(dispositivo.accion))
			warning("Acuerdese del valor que quiere AUMENTAR/ DISMINUIR" + dispositivo.nombre,
			GratextPackage.Literals.ACCION__NOMBRE_ACCION, ACCION_INCORRECTA)
}

def checkAumentoDisminu(accion accion){
	if(accion.nombreAccion.getName.equals("AUMENTAR")
		|| accion.nombreAccion.getName.equals("DISMINUIR")
	)
	true
}
}