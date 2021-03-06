<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="mx.com.everis.tallerjava.services.*, 
			mx.com.everis.tallerjava.clases.Consultas, 
			java.util.*"%>    
			
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personajes historicos</title>
<link rel="stylesheet" type="text/css" href="estilos.css">
<script type="text/javascript" src="funciones.js"></script>
       
</head>
<body>

<%
	Personaje[] personajes = Consultas.readPersonaje(-1);
	pageContext.setAttribute("personajes", personajes);      
%>

<div class="vtnModal" id="modalAddPersonaje">
	<form class="formModal" id="frmAddPersonaje" method="POST" action="DelUpServlet">
		
		<button type="button" class="cerrarModal" onclick="closeModal('modalAddPersonaje')">X</button>

		<h4>Nuevo personaje</h4>
		<input type="text" name="nombrePersonaje" placeholder="Nombre del personaje" required>
		<textarea name="descripcion" placeholder="Notas del personaje" maxlength="500"></textarea>
		<input type="date" name ="fechaNacimiento" placeholder="Fecha nacimiento (AAAA-MM-DD)" required>
		<button type="submit" name="opcion" value="2">Agregar</button>
		
	</form>
</div>

<div class="encabezado">
	<h1>CRUD Personajes informáticos</h1>
	<button onclick="openModal('modalAddPersonaje')">Agregar Personaje</button>
</div>

<div class="contenido">

<c:forEach items="${personajes}" var="personaje">
	<div class="campoPersonaje">
		<div class="campoEncabezado">
			<h4>${personaje.getNombre()}</h4>
		</div>	
		<div class="campoContenido">
			<h4>Fecha de nacimiento</h4>
			<h6>${personaje.getFechaNacimiento()}</h6>
			<h4>Datos</h4>
			<h5>${personaje.getDescripcion()}</h5>
		</div>
		<div class="campoBotones">
				<div class="wrapper">
					<button onclick="nav('/FrontOperativo/DelUpServlet?id=${personaje.getIdPersonaje()}&opcion=0')" >Eliminar</button>
					<button onclick="nav('modificarPersonaje.jsp?id=${personaje.getIdPersonaje()}')" >Modificar</button>
				</div>
		</div>			
		</div>
</c:forEach>

	
</div>

<div class="pie">

</div>


</body>
</html>