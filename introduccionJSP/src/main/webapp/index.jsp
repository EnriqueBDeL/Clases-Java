<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  <!-- Esto es necesario para usar java en los Scriptlets   --> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

El resultado de 5 * 6 es: <h1> <%= 5*6 %> </h1> <!-- Te permiten meter bloques de lógica Java pura (bucles, variables, condicionales) en medio de tu página web.  -->
												<!-- Evalúan un código Java y escupen el resultado directamente en el HTML que verá el usuario. -->
							
<% for (int i=0;i<=4;i++) { %> <!-- Esto es un Scriptlets normal. -->

   <%= i %> * 10 = <%=  i*10 %> <br>

<%}%>


<br>
<br>

<%

// Dentro de un Scriptlets puedes comentar como en Java.

	for (int i = 0 ; i < 5 ; i ++){
		
		System.out.println("hola!!"); //Este mensaje se imprimirá en la consola interna de tu servidor
		
		out.println("<h2>hola desde aqui</h2>" + i); //Esto se inyecta en el código HTML de la página web, por lo que podrá verlo el usuario.
		
	}


%>


</body>
</html>