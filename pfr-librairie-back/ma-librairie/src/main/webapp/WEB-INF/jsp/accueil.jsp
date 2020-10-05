<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Accueil</title>
<link href="<c:url value="/css/style.css" />" rel="stylesheet">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div id="logo">
		<img src="images/logo.png" height="200" class="image" />
	</div>

	<div class="container-fluid">
		<div class="row">
		
		
		
			<div class="col-12 col-md-6">
				<div id="nav">
					<nav class="navbar navbar-expand-lg navbar-light bg-light">
						<ul class="navbar-nav mr-auto">
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
								role="button" data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false"> Mon Compte </a>
								<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								
									<a class="dropdown-item" id="inscription" href="#">Je crée mon compte</a> 
									<a class="dropdown-item" id="connexion" href="#">Je me connecte</a>
									
								</div>
							</li>
						</ul>
					</nav>
				</div>
			</div>
			
			<div class="col-12 col-md-6">
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Je cherche mon livre</button>
			</form>
			</div>
						
			
		</div>
	</div>

	<!-- 	<header> -->

	<!-- 	<div id="logo"> -->
	<!-- 	<img src="images/logo.png" height="200" class="image"/> -->
	<!-- 	</div> -->

	<!-- <div id="nav"> -->
	<!-- 	<nav class="navbar navbar-expand-lg navbar-light bg-light"> -->

	<!--   <ul class="navbar-nav mr-auto">   -->
	<!--      <li class="nav-item dropdown"> -->
	<!--         <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> -->
	<!--           Mon Compte -->
	<!--         </a> -->
	<!--         <div class="dropdown-menu" aria-labelledby="navbarDropdown"> -->
	<!--           <a class="dropdown-item" href="#">Je crée mon compte</a> -->
	<!--           <a class="dropdown-item" href="#">Je me connecte</a>   -->
	<!--         </div> -->
	<!--       </li>  -->
	<!--    </ul> -->

	<!--     <form class="form-inline my-2 my-lg-0"> -->
	<!--       <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" > -->
	<!--       <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Je cherche mon livre</button> -->
	<!--     </form> -->


	<!-- 	</nav> -->
	<!-- </div> -->
	<!-- </header> -->


	<div id="imagefond">
		<img src="images/bibliotheque.jpg" />
	</div>

	<div id="foot"></div>






	<!-- 	<label for="site-search">Je cherche le livre:</label> -->
	<!-- 	<input type="search" id="site-search" name="q" -->
	<!-- 		aria-label="Search through site content"> -->
	<!-- 	<button>Search</button> -->
	<!-- 	<br /> -->
	<!-- 	<p>Pour commander vous devez créer votre compte client ou vous connecter</p> -->
	<!-- 	<br /> -->
	<!-- 	<p>Je n'ai pas de compte:</p> -->
	<!-- 	<input class="favorite styled" type="button" -->
	<!-- 		value="Je m'inscris"> -->
	<!-- 	<br /> -->
	<!-- 	<p>J'ai déjà un compte:</p> -->
	<!-- <input class="favorite styled" type="button" -->
	<!-- 		value="Je me connecte"> -->

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>


</html>