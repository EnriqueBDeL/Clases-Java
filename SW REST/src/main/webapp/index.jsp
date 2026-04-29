<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rest Basico</title>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
	
		//Esta función añade un elemento a la lista de usuarios. 
		function load(id,name,surname){
			//Crea el nuevo elemento 'li' que contendrá los datos del usuario.
			var entry = document.createElement('li');
			
			//Crea un elemento que será el enlace para borrar el usuario creado.
			var a = document.createElement('a');
			
			//Texto del enlace para borrar el usuario
			var linkText = document.createTextNode(" [Borrar]");
			
			//Se añade el texto a la etiqueta <a>
			a.appendChild(linkText);
			
			//Se añade el evento que se ejecutará al hacer clic sobre borrar.
			a.onclick = function () {
				$.ajax({
				    url: 'rest/alumno/' + id, //Url a ejecutar
				    type: 'DELETE', //Método a invocar
				    dataType: "json", //Tipo de dato enviado
				    success: function(result) {
				    	//Función que se ejecuta si todo ha ido bien. En este caso, quitar el <li> que se creó para mostrar
				    	//el usuario insertado.
				    	document.getElementById(id).remove();
				    },
			    	error: function(jqXhr, textStatus, errorMessage){
				    	alert('error');	
				    }
				});
			};
	
			
			//Se identifica el <li> con el id del usuario creado. Así se podrá recuperar en el futuro para eliminarlo.
			entry.id = id;		
			
			//Se añade texto al <li>
			entry.appendChild(document.createTextNode("("+ id + ") " +name + " " + surname));
			
			//Se pone como hijo de <li> el enlace <a> creado anteriormente  
			entry.appendChild(a);
			
			//Se añade el <li> al <ul> que hay en el cuerpo de la página.
			$('#alumnos').append(entry);
			
		}
	
		//Cuando el documento está cargado en el navegador se ejecuta esta función.
		$(document).ready(function(){
			
			
			//Se añade la función que se ejecutará al hacer clic sobre el botón identificado por "crearUsuario"
			$("#crearAlumno").click(function(){
				
				//Se construye el JSON a enviar {"id":"valor","name":"valor","surname":"valor"}
				//no se ponen las comillas porque la función JSON.stringify ya lo hace.
				var personaInfo = {id: $('#id').val(),nombre: $('#nombre').val(),apellido1: $('#apellido1').val()};
				
			    $.ajax({
			    		data: JSON.stringify(personaInfo),
					    url: 'rest/alumno', //URL a la que invocar					    
					    headers: { 
				               'Accept': 'application/json',
				               'Content-Type': 'application/json' 
				           },
					    type: 'POST', //Método del servicio rest a ejecutar
					    dataType: "json", 
					    success: function(result) {
					    	//Esta función se ejecuta si la petición ha ido bien. El cuerpo de la respuesta HTTP
					    	//se recibe en el parámetro 'result'
					    	//Ejemplo JSON respuesta --> {"alumno":{"apellido1":"García","nombre":"Juan","id":"34"}}
					    	
					    	//Se llama a la función que añade el elemento a la lista.
					    	console.log(result);
					    	load(result.alumno.id, result.alumno.nombre, result.alumno.apellido1);
					    },
				    	error: function(jqXhr, textStatus, errorMessage){
					    	alert('Error: ' + jqXhr.responseJSON.resultado);	
					    }
					    
					});
			    });
		
			//Se invoca la petición REST que devuelve todos los usuarios y se cargan dentro del <ul> de la página.
			$.ajax({
			    url: 'rest/alumno/listado',
			    type: 'GET',
			    dataType: "json",
			    success: function(result) {
			    	//Para cada elemento del array de result.personas se ejecuta la función que se pasa como parámetro.
			    	//Esa función tiene dos parámetros, i para la posición y val para el valor del elemento en curso.
			    	jQuery.each(result.alumnos, function(i, val) {
			    		  load(val.id, val.nombre, val.apellido1);
			    	});
			    }
			});
		});
</script>

</head>
<body>
<h1>Ejemplo de Rest</h1>
<br>
	Formulario para insertar un nuevo usuario.<br>
	Id:<input type=text id="id"><br>
	Nombre:<input type=text id="nombre"><br>
	Apellido1:<input type=text id="apellido1"><br>
	<button id="crearAlumno">Crear</button>
	<button id="actualizarAlumno">Actualizar</button>

<br>
	Listado de usuarios creados
	<br>
	<ul id="alumnos">
	</ul>

</body>
</html>

