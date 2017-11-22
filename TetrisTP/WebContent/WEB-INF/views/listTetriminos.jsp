<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection" />
	<title>Tetris - Liste</title>
</head>
<body>
	<header class="col s12" style="background-color: #26a69a; margin-top: -1%; align: center;">
		<div class="col s1">
			<h4>Tetris - Tetriminos</h4>
			<a href="${pageContext.request.contextPath}/home" style="color: black">Accueil</a>
			<a href="${pageContext.request.contextPath}/add" style="color: black">Ajouter</a>
		</div>
	</header>
	<div class="row col s2">
		<table>
			<thead>
	         		<tr>
	           			<th>Id</th>
	            		<th>Nom</th>
	             		<th>Couleur</th>
	             		<th>Actions</th>
	         		</tr>
	        	</thead>
	        	<tbody>
				<c:forEach items="${tetris}" var="forme">
					<tr>
						<td>${forme.id}</td>
						<td>${forme.name}</td>
						<td>${forme.color}</td>
						<td>
							<a class="waves-effect waves-teal btn-flat" href="${pageContext.request.contextPath}/edition?id=${forme.id}">Modifier</a>
							<a class="waves-effect waves-teal btn-flat" href="list" name="delete" value="${forme.id}">Retirer</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	
	
	
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>	