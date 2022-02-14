<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
xmlns:th="http://www.thymeleaf.org">
<head>
<title>Formation Spring Boot : Services Web</title>
<link rel="stylesheet" type="text/css" th:href="@{/css/home.css}" />
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<span th:utext="${userName}"></span>
<br>
<form th:action="@{/client}" method="get">
<button class="btn btn-md btn-danger btn-block" name="Services
M tier" type="Submit">Pour les clients</button>
</form>
<br>
<form th:action="@{/admin}" method="get">
<button class="btn btn-md btn-danger btn-block" name="Cr er un
nouvel utilisateur" type="Submit">Pour les admin</button>
</form>
</div>
</body>
</html>