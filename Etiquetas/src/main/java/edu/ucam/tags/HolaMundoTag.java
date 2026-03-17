package edu.ucam.tags;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class HolaMundoTag extends BodyTagSupport{ // Heredar de BodyTagSupport nos da acceso a herramientas como el "pageContext"
	
	private static final long serialVersionUID = 1L;
	
	private String nombreUsuario;
   
	
	
	
	
	public int doStartTag() throws JspException { //Salta cuando Tomcat lee la etiqueta de APERTURA: <dad2:holamundo>
     
		
		try{
            pageContext.getOut().print("¡Hola Mundo!<br/><br/>"); // pageContext.getOut() es el equivalente a "out.print" en un JSP normal.
         
            if (this.nombreUsuario != null) {
                pageContext.getOut().print("¡Hola " + this.nombreUsuario + "!"); 
            }
        } catch (IOException e) {
            
        }
        return SKIP_BODY; //Todo lo que hay dentro del cuerpo de la etiqueta se ignora. Esquema: <etiqueta>Cuerpo_Etiqueta</etiqueta>
    }
	
	
	
	
	
    public int doEndTag() throws JspException {
        return EVAL_PAGE; // Cuando termina de leer una etiqueta, le dice que siga leyendo el resto de la pagina web.
    }

    
    
    
    
    //El nombre del método se compone de la siguiente forma: 
    // set + el nombre del atributo definido en el TLD con la primera letra en mayúscula
    // ¡¡No confundir con el nombre del atributo de esta clase !!
    //Tomcat buscará automáticamente un método llamado "setNombre".
    public void setNombre(String parametro) {
        this.nombreUsuario = parametro;
    }
}