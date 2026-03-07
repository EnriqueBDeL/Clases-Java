package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.domain.Titulacion;


@WebServlet("/borrartitulacion")
public class ServletBorrarTitulacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletBorrarTitulacion() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Hashtable<String, Titulacion> titulaciones = (Hashtable<String, Titulacion>) this.getServletContext().getAttribute(ServletInsertarTitulacion.ATR_TITULACIONES);
		
		String paramId = request.getParameter("ID");
		
		titulaciones.remove(paramId);
		
		request.setAttribute(ServletInsertarTitulacion.MSG, "Titulación borrada");
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
