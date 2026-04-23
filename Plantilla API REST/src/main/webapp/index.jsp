<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Probar API REST</title>
	

	<script type="text/javascript" src="js/jquery-3.7.1.js"></script> <!-- Línea clave. Importa la librería jQuery necesaria para que funcionen las peticiones $.ajax -->
																		<!-- Se incluye la librería JQuery que facilita interacturar con el DOM de la web -->
	
	
	
	<script type="text/javascript">
	 
		function load(x){ //Define la función que recibe un objeto x
			
			var entry = document.createElement('li'); //Crea un nuevo elemento de lista <li> en memoria.
			
			var a = document.createElement('a'); //Crea un enlace <a>.
						
			var linkText = document.createTextNode(" [Borrar]"); //Crea el texto que dirá el botón.
						
	
	//Logica de borrado
		
			a.appendChild(linkText); //Mete el texto dentro del enlace <a>

			a.onclick = function () { //Define qué pasa cuando haces clic en "[Borrar]
				$.ajax({
				    url: '' + id, //La ruta del servidor para borrar (ej: rest/users/5). Ojo: Aquí falta completar la URL base según tu ejercicio
				    type: 'DELETE', //El método HTTP usado para borrar.
				    dataType: "json", //Es lo que tú ESPERAS RECIBIR del servidor
				    success: function(result) { //Si el servidor responde que se borró bien, esta línea elimina el <li> de la pantalla sin recargar la página.
				    	document.getElementById(id).remove();
				    },
			    	error: function(jqXhr, textStatus, errorMessage){
				    	alert('error');	
				    }
				});
			};
	
	
			
			entry.id = id;		//Le asigna un ID al <li> para poder identificarlo luego.
			
			entry.appendChild(document.createTextNode("("+ id + ") " +name + " " + surname)); //Mete el texto con los datos (ID, nombre, apellidos) dentro del <li>
			 
			entry.appendChild(a);	//Mete el botón de borrar al final del <li>		
			
			$('#users').append(entry); //Añade el <li> completo a la lista con ID users que está en el HTML.
			
		}
		
		
	
		$(document).ready(function(){ //Todo lo que esté aquí dentro se ejecutará automáticamente cuando la página termine de cargar.
		
	//Logica de creación			
			$("#sendButton").click(function(){ //Se activa cuando pulsas el botón "Crear"
				
				var sendInfo = {x: $('#x').val()}; //Crea un objeto JavaScript con el valor que el usuario escribió en el input
				
			    $.ajax({
					    url: '', 
					    headers: { //Indica al servidor que le envías JSON y esperas JSON de vuelta
				               'Accept': 'application/json',
				               'Content-Type': 'application/json' 
				           },
					    type: 'POST', //Método HTTP para crear recursos.
					    dataType: "json", 
					    success: function(result) { // Si se crea con éxito, el servidor devuelve el objeto creado y llamamos a load() para que aparezca en la lista.
					    	load(result.x);
					    },
				    	error: function(jqXhr, textStatus, errorMessage){
					    	alert('Error: ' + jqXhr.responseJSON.resultado);	
					    },
					    data:  JSON.stringify(sendInfo) //Convierte el objeto JS en una cadena de texto JSON para poder enviarla por internet
					    
					});
			    });
		
		
		//Carga Inicial
			
			$.ajax({ //Al cargar la página, hace una petición GET para traer todos los datos que ya existen en la base de datos.
			    url: '',
			    type: 'GET',
			    dataType: "json",
			    success: function(result) {
					jQuery.each(result.users, function(i, val) { //Recorre la lista de usuarios que mandó el servidor y llama a load() por cada uno para pintarlos todos.
			    		  load(val.x);
			    		});
			    }
			});
		});
</script>
	
	
	
	
	<!-- Codigo notmal html -->
	
</head>
<body>

	<center><b>Ejemplo API Rest</b></center><br>
	Formulario para insertar X<br>
	X:<input type=text id="X"><br>	
	<button id="sendButton">Crear</button>
	
	<br>
	<br>
	Listado de X creados
	<br>
	<ul id="X"></ul> <!-- Punto crítico: En el script el código busca $('#users'), pero aquí el ID es X. En el examen asegúrate de que ambos coincidan (o los dos X o los dos users) -->
</body>
</html>