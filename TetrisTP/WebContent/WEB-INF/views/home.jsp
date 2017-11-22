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
	<title>Tetris - Bienvenue</title>
</head>
<body>
	<header class="col s12" style="background-color: #26a69a; margin-top: -1%; align: center;">
		<div class="col s1">
			<h4>Tetris - Bienvenue</h4>
			<a href="${pageContext.request.contextPath}/list" style="color: black">Tetriminos</a>
		</div>
	</header>
	<h5>Bienvenue, ${username}</h5>
		
	<h3>Jeu ici</h3>
	
	<button class="btn waves-effect waves-light" type="submit">Déconnexion
		<i class="material-icons right">https</i>
	</button>
	
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>	