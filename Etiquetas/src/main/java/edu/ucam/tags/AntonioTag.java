package edu.ucam.tags;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class AntonioTag extends BodyTagSupport{
	
	private static final long serialVersionUID = 1L;
	
	private int contador = 0;
	
    
	
	public int doStartTag() throws JspException { //Salta al leer la etiqueta de APERTURA.
        
        return  EVAL_BODY_INCLUDE;// SKIP_BODY;
    }
	
   
	
	
	@Override
	public int doAfterBody() throws JspException { //Salta DESPUÉS de haber impreso el cuerpo por primera vez.
    	
    	if (contador <= 3) {
    		this.contador++;
    		try {
				pageContext.getOut().print(contador + "<br>");
			} catch (IOException e) {
				e.printStackTrace();
			}
    		return EVAL_BODY_AGAIN; // Vuelve arriba y repite el cuerpo OTRA VEZ.
    	}else
    		return EVAL_PAGE; //Termina el bucle, continúa leyendo el resto del JSP.
	}


}