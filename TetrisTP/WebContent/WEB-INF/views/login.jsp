<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"
	media="screen,projection" />
<title>Tetris TP</title>
</head>
<body>
	<header class="col s12" style="background-color: #26a69a; margin-top: -1%; align: center;">
		<div class="col s1">
			<h4>Tetris - Connexion</h4>
		</div>
	</header>
	<div class="row">
		<form class="col s12" style="align-content: center;">
			<div class="row">
				<div class="input-field col s2">
					<i class="material-icons prefix">account_circle</i> 
					<input placeholder="Login" name="login" id="login" type="text" class="validate">
				</div>
			</div>
			<div class="row">
				<div class="input-field col s2">
					<i class="material-icons prefix">https</i> 
					<input placeholder="Password" name="password" id="password" type="password" class="validate">
				</div>
			</div>
			<div class="row">
				<button class="btn waves-effect waves-light" type="submit">OK
    				<i class="material-icons right">send</i>
  				</button>
  			</div>
		</form>
	</div>
	
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>