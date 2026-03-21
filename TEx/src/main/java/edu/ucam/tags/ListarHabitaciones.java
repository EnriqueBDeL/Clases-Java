package edu.ucam.tags;

import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.domain.Habitacion;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class ListarHabitaciones extends BodyTagSupport {

	private static final long serialVersionUID = 1L;
	

	@Override
	public int doStartTag() throws JspException 
	{
    	try 
    	{
    		Hashtable<String, Habitacion> usuarios = (Hashtable<String,Habitacion>) pageContext.getRequest().getServletContext().getAttribute("HABITACIONES");

    		if(usuarios != null && usuarios.size() > 0){
    			for(Habitacion usuario : usuarios.values())
    			{
    				pageContext.getOut().println(usuario.getNombre() + " " + usuario.getTipo() + " " + usuario.getCamas());
    				pageContext.getOut().println(" <a href=\"servletborrar?ID=" + usuario.getId() + "\">Borrar</a>" );
    				if(usuario.isReservada())
    				{
    					pageContext.getOut().println(" <a href=\"servletcambiarestado?ID=" + usuario.getId() + "\">Liberar</a>" );
    				}
    				else
    				{
    					pageContext.getOut().println(" <a href=\"servletcambiarestado?ID=" + usuario.getId() + "\">Reservar</a>" );
    				}
    		
    				pageContext.getOut().println("<br>");
    			}
    		}else{
    			pageContext.getOut().println("<b>lista vacia</b>");
    		}
    		
		} catch (IOException e) {
			e.printStackTrace();
		}
	      
	    return SKIP_BODY;
	}
	
	public int doEndTag() throws JspException {
	    return EVAL_PAGE;
	}
}
