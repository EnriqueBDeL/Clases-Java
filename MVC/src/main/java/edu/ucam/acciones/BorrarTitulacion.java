package edu.ucam.acciones;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BorrarTitulacion extends Accion {

	@Override
	public void ejecutar(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("Borrar titulacion");

		// "Borrar" sale en blanco porque el Controlador hizo su trabajo en el servidor, pero no le dijimos a qué Vista (pantalla) mandar al usuario después.
		
	}

}
