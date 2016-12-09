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
	<title>Modificar Personaje</title>
	<link rel="stylesheet" type="text/css" href="estilos.css">
	<script type="text/javascript" src="funciones.js"></script>
       
</head>
<body>

<%
	Personaje[] personajes = Consultas.readPersonaje(Integer.parseInt(request.getParameter("id")));
	pageContext.setAttribute("personajes", personajes);      
%>

<div class="encabezado">
	<h1>Modificar personaje</h1>
</div>

<div class="contenido">
	<c:forEach items="${personajes}" var="personaje">	
		<form class="formUpd" method="POST" action="DelUpServlet">
			<input type="hidden" name ="id" value="${personaje.getIdPersonaje()}">
			<input type="text" name="nombrePersonaje" value="${personaje.getNombre()}" placeholder="Nombre del personaje" required>
			<textarea name="descripcion" placeholder="Notas del personaje" maxlength="500">${personaje.getDescripcion()}</textarea>
			<input type="date" value="${personaje.getFechaNacimiento()}" name ="fechaNacimiento" placeholder="Fecha nacimiento (AAAA-MM-DD)" required>
			<button type="submit" name="opcion" value="1">Modificar</button>
			
		</form>
	</c:forEach>


</div>


</body>
</html>