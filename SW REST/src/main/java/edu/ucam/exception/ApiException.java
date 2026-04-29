package edu.ucam.exception;

public class ApiException extends Exception{
	
	private int httpCode;
	
	public ApiException(int codigo, String mensaje) {
		super(mensaje);
		this.httpCode = codigo;
	}
	
	public int getHttpCode() {
		return this.httpCode;
	}

}
