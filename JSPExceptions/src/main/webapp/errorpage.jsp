<!--  ------------------------------------------------------------------------------------------- -->
<%@ page isErrorPage="true" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  <!-- isErrorPage="true" le dice a java esto es una pagina de control de errores.
 	
 	 Al poner esto en true, Java te regala automáticamente un "objeto implícito" (una variable que no tienes que declarar) llamado exception. 
	 Este objeto contiene toda la información sobre el error que acaba de ocurrir en la otra página. 
	 
----------------------------------------------------------------------------------------------------- -->
   
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>DAD2: error!</title>
</head>



<body>
Se ha producido un error <%= exception.getMessage() %>

<br>
<br>

<%

	out.println(exception.getMessage());

	System.out.println("esto aparce en el servidor");


%>

</body>
</html>