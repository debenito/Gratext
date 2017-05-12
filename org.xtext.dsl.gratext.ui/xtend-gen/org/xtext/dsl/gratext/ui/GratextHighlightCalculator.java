package org.xtext.dsl.gratext.ui;

import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.xtext.dsl.gratext.gratext.Dispositivos;
import org.xtext.dsl.gratext.gratext.Granja;
import org.xtext.dsl.gratext.gratext.accion;

public class GratextHighlightCalculator implements ISemanticHighlightingCalculator {


	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator arg2) {
		if(resource == null || resource.getParseResult() == null) {
	         return;
	      }
	      
	      INode root = resource.getParseResult().getRootNode();
	      for(INode node : root.getAsTreeIterable()){
	         if(node.getGrammarElement() instanceof Granja){
	        	
	            acceptor.addPosition(node.getOffset(), node.getLength(), GratextHighlightConfiguration.METHOD_ID);
	         
	         }else if(node.getGrammarElement() instanceof Dispositivos){
	        	
	 	            acceptor.addPosition(node.getOffset(), node.getLength(), GratextHighlightConfiguration.ENUM);
	         
	      }else if(node.getGrammarElement() instanceof accion){
		 	            acceptor.addPosition(node.getOffset(), node.getLength(), GratextHighlightConfiguration.KEYWORD_ID);
		      
	}
	      
	}
	     
}
}