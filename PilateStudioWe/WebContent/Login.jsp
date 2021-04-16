<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pilatestudio"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Tela de Login</title>
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
<link href="css/login.css" rel="stylesheet">
</head>
<body>
	<header class="container">
		
		<section class="formulario">	
			<form action="LoginServlet" method="post">
				Usuario: 
				<input type="text" name="login"/>
				Senha:
				 <input type="text" name="senha"/>
				<input type="submit" value="Acessar">
			</form>
	
		</section>
	</header>
	
	<section class="conteudo">
		
		<figure class="imagem">
			<img src="imagens/banner.jpeg">
		</figure>
		
			<form class="conta" action="mvc?logica=AdicionaClienteLogic" method="post">
				<h1>Crie sua Conta</h1>
				Nome: <input type="text" name="nome"><br/><br/>
				Sexo: <input type="text" name="sexo"><br/><br/>
				Data de Nascimento: <pilatestudio:campoData id="dataNascimento"/><br/><br/>
				Telefone: <input type="text" name="telefone"><br/><br/>
				Endereço: <input type="text" name="endereco"><br/><br/>
				<input type="submit" value="Cadastrar"><br/><br/>
			</form>
	</section>
	
	<footer class="rodape">
		<c:import url="rodape.jsp"/>
	</footer>
</body>
</html>