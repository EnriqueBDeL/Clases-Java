package edu.ucam.acciones;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class Accion {
	
	
	public abstract void ejecutar(HttpServletRequest request, HttpServletResponse response)  throws IOException;


	
}
