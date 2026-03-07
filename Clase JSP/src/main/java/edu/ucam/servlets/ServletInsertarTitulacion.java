package edu.ucam.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.domain.Titulacion;


@WebServlet("/insertartitulacion")
public class ServletInsertarTitulacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	public static final String ATR_TITULACIONES = "TITULACIONES";
	public static final String MSG = "MSG_ERROR";
	
	public static final String PARAM_ID = "ID";
       
   
    public ServletInsertarTitulacion() {
        super();
    }
    
    
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		if ( config.getServletContext().getAttribute(ServletInsertarTitulacion.ATR_TITULACIONES) == null) {
			config.getServletContext().setAttribute(ServletInsertarTitulacion.ATR_TITULACIONES, new Hashtable<String, Titulacion>());
		}
		
		super.init(config);
	}




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Hashtable<String, Titulacion> titulaciones = (Hashtable<String, Titulacion>) this.getServletContext().getAttribute(ServletInsertarTitulacion.ATR_TITULACIONES);
		
		String paramId = request.getParameter("ID");
		String paramNombre = request.getParameter("NOMBRE");
		
		String msg = "";
		if(titulaciones.get(paramId)==null) {
			titulaciones.put(paramId, new Titulacion(paramId, paramNombre));
			msg = "Titulación insertada";		

		}else {
			msg = "La titulación ya existe";
		}
		
		request.setAttribute(ServletInsertarTitulacion.MSG, msg);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
