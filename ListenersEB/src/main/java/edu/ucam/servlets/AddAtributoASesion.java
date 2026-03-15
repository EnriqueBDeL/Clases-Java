package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.domain.Titulacion;

@WebServlet("/AddAtributoASesion")
public class AddAtributoASesion extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    public AddAtributoASesion() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String id = request.getParameter("idTitulacion");
		String nombre = request.getParameter("nombreTitulacion");

	//	request.getSession().setAttribute("xxxx", "yyyy");
		
		Hashtable<String, Titulacion> tabla = (Hashtable<String, Titulacion>) request.getServletContext().getAttribute("TITULACIONES");
		
		if (tabla != null && id != null && !id.isEmpty() && nombre != null && !nombre.isEmpty()) {
			Titulacion nueva = new Titulacion(id, nombre);
		
			if (tabla.containsKey(id)) {
				System.out.println("\n📝 [SERVLET] Se ha MODIFICADO la titulación con ID: " + id);
			} else {
				System.out.println("\n💾 [SERVLET] Se ha AÑADIDO una titulación nueva: " + nombre);
			}
			
			tabla.put(id, nueva);
			request.getSession().setAttribute(id, nueva);
			
		}
		response.sendRedirect(request.getContextPath() + "/index.jsp");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}