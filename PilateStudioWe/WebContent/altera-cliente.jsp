<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pilatestudio" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/jquery.css" rel="stylesheet">
<link href="css/frame.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	
	<section class="janela">
	
		<form action="mvc?logica=AlteraClienteLogic" method="post">
			ID: <input type="text" name="id" value="${param.id}"/><br/>
			Nome: <input type="text" name="nome" value="${param.nome}"/><br/>
			Sexo: <input type="text" name="sexo" value="${param.sexo}"/><br/>
			Data de Nascimento: <pilatestudio:campoData id="dataNascimento"/><br/>
			Telefone: <input type="text" name="telefone" value="${param.telefone}"/><br/>
			Endereco: <input type="text" name="endereco" value="${param.endereco}"/><br/>
			<input type="submit" value="Alterar">
			<input type="reset" value="Limpar">
		</form>

	</section>
		
	<c:import url="rodape.jsp"/>
</body>
</html>