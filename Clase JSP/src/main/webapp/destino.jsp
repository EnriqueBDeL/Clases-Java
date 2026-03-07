<%@page import="edu.ucam.domain.Usuario"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">

<title>DAD2: p&aacute;gina destino</title> <!-- "&aacute;" se utiliza para poner la "a" con acento en página  -->

</head>



<body>
JSP destino: <%= ((Usuario)request.getAttribute("USUARIO")).getNombre() %>
</body>

	<!-- request.getAttribute("USUARIO"): Va al objeto request (la petición HTTP) y saca lo que esté guardado bajo el nombre "USUARIO"  -->

	<!-- (Usuario)...: Como getAttribute siempre devuelve un objeto genérico (Object), hay que hacerle un casting (una conversión forzada)  -->

	<!-- .getNombre(): Una vez convertido al tipo correcto, llama al método de tu clase Usuario que devuelve el nombre  -->

</html>