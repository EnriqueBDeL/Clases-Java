package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import edu.ucam.domain.Usuario;


@WebServlet("/redireccion")
public class Redireccion extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
 
    public Redireccion() {
        super();

    }

//...........................................................................................................................................................|
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("servlet Redireccion ejecutado");
		
		Usuario usuario = new Usuario("Enrique");
		
		
		request.setAttribute("USUARIO", usuario); //Mete el objeto usuario  dentro del paquete peticion HTTP bajo la etiqueta o clave "USUARIO"
		
		
		request.getRequestDispatcher("destino.jsp").forward(request, response);
		
	}
//...........................................................................................................................................................|
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
