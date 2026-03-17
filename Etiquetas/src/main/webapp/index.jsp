<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="mistags" prefix="dad2" %> 

<%-- Comentarios JSP (también conocidos como comentarios de servidor o comentarios ocultos) --%>

<%-- 
- uri="mistags": Tiene que coincidir EXACTAMENTE con el <uri> de tu archivo .tld

- prefix="dad2": Es el prefijo que te inventas aquí para usar en esta página.

Es como decir: "Todo lo que empiece por <dad2:...> búscalo en el diccionario 'mistags'"
--%>

 
<!DOCTYPE html>
<html>



<head>
<meta charset="UTF-8">
<title>DAD2: Etiquetas propias</title>
</head>




<body>
It works!

<br>

<br>

<dad2:holamundo nombre="Juanje"/>

<%-- 
Llama a HolaMundoTag.java porque en el TLD enlazamos <holamundo> con esa clase.

Le pasamos el atributo nombre="Jesús", lo que ejecutará "setNombre('Jesús')"

Como es empty, la cerramos del tirón con "/>" al final.

--%>

<br>

<br>

<h3>Vamos con otra etiqueta...</h3>



<%--
	Fíjate que se abre, se escribe "El cuerpo" dentro, y luego se cierra </dad2:otraetiqueta>.
   
   	Según el código de AntonioTag, esto imprimirá "El cuerpo" y luego los números del 1 al 4  gracias al bucle EVAL_BODY_AGAIN.
 --%>

<dad2:otraetiqueta>
El cuerpo
</dad2:otraetiqueta>

</body>



</html>