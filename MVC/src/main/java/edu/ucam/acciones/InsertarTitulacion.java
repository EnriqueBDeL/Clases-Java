package edu.ucam.acciones;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertarTitulacion extends Accion {

	@Override
	public void ejecutar(HttpServletRequest request, HttpServletResponse response) throws IOException {

		System.out.println("Insertar titulacion");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());

		
		// "Insertar"imprime texto crudo porque forzamos al Controlador a imprimirlo.  En un MVC real, el Controlador NO dibuja la pantalla; delega esa tarea redirigiendo a un archivo .jsp.
		
	}

}
