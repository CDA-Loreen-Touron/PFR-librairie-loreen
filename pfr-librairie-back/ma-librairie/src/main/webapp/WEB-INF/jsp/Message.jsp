<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

	<form method="post" action="EnvoiMessage">
	
		<fieldset>
		
			<legend>Messagerie</legend>
			<br />
			
			<p>
				<strong>Vous pouvez contacter votre libraire via cette messagerie</strong>
			</p>
			
			<br /> 
				
			<label for="nom">Votre nom :<span class="requis"></span></label> 
			<br />
			
			<input type="text" id="nom" name="nom" value="<c:out value="${param.nom}"/>"/>
			
			<span class="erreur">${form.erreurs['nom']}</span>
			<br />
			
			<input type="submit" value="Inscription" class="sansLabel" /><br />
			
			<p class="${empty erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
			
			
			
			
			<label for="message">Votre Message :<span class="requis"></span></label> 
			<br />
			
			<input type="text" id="message" name="message" value="<c:out value="${param.message}"/>"/>
			
			<span class="erreur">${form.erreurs['message']}</span>
			<br />
			
			<input type="submit" value="Inscription" class="sansLabel" /><br />
			
			<p class="${empty erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
		
		</fieldset>
		
	</form>

</body>
</html>