<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des clients</title>
</head>
<body>
<h1>Liste des clients</h1>
<c:forEach items="${ clients }" var="client">
<div>
<c:out value="${ client.prenom } ${ client.nom } ${ client.email } ${ client.pwd }  ${ client.confirmation } ${ client.telephone }"/>
</div>
</c:forEach>
</body>
</html>