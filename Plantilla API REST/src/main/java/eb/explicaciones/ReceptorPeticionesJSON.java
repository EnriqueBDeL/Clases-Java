// ESTE CODIGO ES EXPLICATIVO Y NO SE PUEDE COMPILAR SIN HABER REALIZADO MODIFICACIONES POSTERIRORMENTE

//Cargar JSON  en Servicio REST

StringBuilder sb = new StringBuilder(); //Crea un objeto StringBuilder
										//En Java, si vas a unir muchos trozos de texto, usar String normal es muy lento y consume mucha memoria. 
										//StringBuilder está diseñado específicamente para ir pegando texto de forma eficiente.

try {

	BufferedReader in = new BufferedReader(new InputStreamReader(incomingData)); //"incomingData" es el flujo de datos (los bytes) que está llegando desde internet.
																				// El InputStreamReader traduce esos bytes a caracteres normales (texto).
	
	String line = null;
	while ((line = in.readLine()) != null) { //Es un bucle que va leyendo el mensaje del cliente línea por línea.
		sb.append(line);
	}
	
} catch (Exception e) {
	System.out.println("Error Parsing: - ");
}


JSONObject jsonRecibido = new JSONObject(sb.toString()); //Saca todo el texto definitivo que acumulamos (sb.toString()) y se lo pasa a la clase JSONObject