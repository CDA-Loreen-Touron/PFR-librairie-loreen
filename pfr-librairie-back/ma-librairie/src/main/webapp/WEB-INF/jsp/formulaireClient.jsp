<%@ page language="java" contentType="text/html; charset=
UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Formulaire d'inscription client</title>
<link href="/css/style.css" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>



<body>
	<img src="images/logo.png"
		style="position: relative; top: 0px; left: 0px;" height="200"
		class="image" />
	<fieldset>
		<h2>Inscription</h2>

		<div class="form-row">
			<form action="formulaireClient" method="post">
				</br>
<div class="row">
				<div class="form-group">
					<label for="inputEmail4">Email</label> <input type="email"
						required="required" class="form-control" id="inputEmail4"
						name="email">
				</div>

				<div class="form-group">
					<label for="inputPassword4">Password</label> <input type="password"
						required="required" class="form-control" id="inputPassword4"
						name="pwd">
				</div>
				</div>

				<div class="form-group">
					<label for="inputConfirmation">Confirmation</label> <input
						type="password" required="required" class="form-control"
						id="inputConfirmation" name="confirmation">
				</div></br>
<div class="row">
				<div class="form-group">
					<label for="inputPrenom">Prénom</label> <input type="text"
						required="required" class="form-control" id="inputPrenom"
						name="prenom">
				</div>

				<div class="form-group">
					<label for="inputNom">Nom</label> <input type="text"
						required="required" class="form-control" id="inputNom" name="nom">
				</div>
</div></br>

				<div class="form-group">
					<label for="inputTel">Téléphone</label> <input type="text"
						required="required" class="form-control" id="inputTel"
						name="telephone">
				</div>

				<button type="submit" class="btn btn-primary" >Créer son compte</button>
			</form>
		</div>
	</fieldset>

	<div id="imagefond">
		<img src="images/bibliotheque.jpg" />
	</div>










	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
</body>
</html>




<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%-- 	pageEncoding="UTF-8"%> --%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!-- <!DOCTYPE html> -->
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>Formulaire d'inscription</title> -->
<%-- <link href="<c:url value="/bootstrap/bootstrap.min.css" />" --%>
<!-- 	rel="stylesheet"> -->
<%-- <link href="<c:url value="/font-awesome/css/all.min.css" />" --%>
<!-- 	rel="stylesheet"> -->
<%-- <link href="<c:url value="/style.css" />" rel="stylesheet"> --%>
<!-- </head> -->
<!-- <body> -->
<!-- 	<form method="post" action="addClient"> -->

<!-- 		<fieldset> -->

<!-- 			<legend>Inscription</legend> -->
<!-- 			<br /> -->

<!-- 			<p> -->
<!-- 				<strong>Vous pouvez vous inscrire via ce formulaire</strong> -->
<!-- 			</p> -->

<!-- 			<br /> -->

<!-- 			<label for="email">Votre adresse mail (identifiant):<span class="requis"></span></label> -->
<!-- 			<br /> -->

<%-- 			<input type="email" id="email" name="email" value="<c:out value="${param.email}"/>"/> --%>

<%-- 			<span class="erreur">${form.erreurs['email']}</span> --%>
<!-- 			<br /> -->



<!-- 			<label for="pwd">Votre mot de passe:<span class="requis"></span></label> -->
<!-- 			<br /> -->

<!-- 			<input type="password" id="pwd" name="pwd" value="" /> -->

<%-- 			<span class="erreur">${form.erreurs['pwd']}</span> --%>
<!-- 			<br /> -->

<!-- 			<label for="confirmation">Confirmation du mot de passe:<span class="requis"></span></label> -->
<!-- 			<br /> -->

<!-- 			<input type="password" id="confirmation" name="confirmation" value="" /> -->

<%-- 			<span class="erreur">${form.erreurs['confirmation']}</span> --%>
<!-- 			<br /> -->



<!-- 			<label for="nom">Votre nom:<span class="requis"></span></label> -->
<!-- 			<br /> -->

<%-- 			<input type="text" id="nom" name="nom" value="<c:out value="${param.nom}"/>"/> --%>

<%-- 			<span class="erreur">${form.erreurs['nom']}</span> --%>
<!-- 			<br /> -->



<!-- 			<label for="prenom">Votre prénom:<span class="requis"></span></label> -->
<!-- 			<br /> -->

<%-- 			<input type="text" id="prenom" name="prenom" value="<c:out value="${param.prenom}"/>"/> --%>

<%-- 			<span class="erreur">${form.erreurs['prenom']}</span> --%>
<!-- 			<br /> -->



<!-- 			<label for="adresse">Votre adresse postale:<span class="requis"></span></label> -->
<!-- 			<br /> -->

<!-- 			<ul> -->
<!-- 			<label for="adresse">Numéro:<span class="requis"></span></label> -->
<%-- 			<input type="number" id="adresse" name="adresse" value="<c:out value="${param.numero}"/>"/> --%>
<!-- 			<br /> -->

<!-- 			<label for="adresse">Rue:<span class="requis"></span></label> -->
<%-- 			<input type="text" id="adresse" name="adresse" value="<c:out value="${param.rue}"/>"/> --%>
<!-- 			<br /> -->

<!-- 			<label for="adresse">Code Postal:<span class="requis"></span></label> -->
<%-- 			<input type="number" id="adresse" name="adresse" value="<c:out value="${param.cp}"/>"/> --%>
<!-- 			<br /> -->

<!-- 			<label for="adresse">Ville:<span class="requis"></span></label> -->
<%-- 			<input type="text" id="adresse" name="adresse" value="<c:out value="${param.ville}"/>"/> --%>
<!-- 			<br /> -->

<!-- 			<label for="adresse">Complément:<span class="requis"></span></label> -->
<%-- 			<input type="text" id="adresse" name="adresse" value="<c:out value="${param.complement}"/>"/> --%>
<!-- 			<br /> -->

<!-- 			</ul> -->




<!-- 			<label for="telephone">Votre numéro de téléphone:<span class="requis"></span></label> -->
<!-- 			<br /> -->

<%-- 			<input type="tel" id="telephone" name="telephone" value="<c:out value="${param.telephone}"/>"/> --%>

<%-- 			<span class="erreur">${form.erreurs['telephone']}</span> --%>
<!-- 			<br /> -->



<!-- 			<label for="abonnement">Je prends l'abonnement:<span class="requis"></span></label> -->
<!-- 			<br /> -->

<%-- 			<input type="checkbox" id="abo" name="abo" value="<c:out value="${param.abo}"/>"/> --%>

<%-- 			<span class="erreur">${form.erreurs['abo']}</span> --%>
<!-- 			<br /> -->





<!-- 			<input type="submit" value="Inscription" class="sansLabel" /><br /> -->

<%-- 			<p class="${empty erreurs ? 'succes' : 'erreur'}">${form.resultat}</p> --%>

<!-- 		</fieldset> -->

<!-- 	</form> -->


<!-- </body> -->
<!-- </html> -->

