package org.xtext.dsl.gratext.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class GratextHighlightConfiguration implements IHighlightingConfiguration {
	public static final String DEFAULT_ID = "default";
    public static final String KEYWORD_ID = "keyword";
    public static final String METHOD_ID = "method";
    public static final String NUMBER_ID = "number";
    public static final String ML_COMMENT = "comment";
    public static final String STRING = "string";
    public static final String ENUM = "enum";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
        acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
        acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
        acceptor.acceptDefaultHighlighting(METHOD_ID, "Method", methodTextStyle());
        acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
        acceptor.acceptDefaultHighlighting(ML_COMMENT, "Comment", comentarioTextStyle());
        acceptor.acceptDefaultHighlighting(STRING, "string", ListaTextStyle());
        acceptor.acceptDefaultHighlighting(ENUM, "enum", EnumTextStyle());
        
    }
	
   

	


	protected TextStyle defaultTextStyle() {
        TextStyle textStyle = new TextStyle();
       
        textStyle.setColor(new RGB(255, 0, 128));
        return textStyle;
    }

    protected TextStyle keywordTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(128, 0, 128));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }

    protected TextStyle methodTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(255, 0, 128));
        textStyle.setStyle(SWT.ITALIC);
        return textStyle;
    }
	
    protected TextStyle numberTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(0, 255, 0));
        return textStyle;
    } 

	private TextStyle comentarioTextStyle() {
  	  TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(0, 0, 255));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
	}
    private TextStyle ListaTextStyle() {
    	 TextStyle textStyle = defaultTextStyle().copy();
		 textStyle.setColor(new RGB(255, 0, 128));
	        return textStyle;
	}
    
    private TextStyle EnumTextStyle() {
    	 TextStyle textStyle = defaultTextStyle().copy();
		 textStyle.setColor(new RGB(128, 0, 128));
	       return textStyle;
	}


}
