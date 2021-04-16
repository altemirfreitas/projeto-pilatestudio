<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Cadastro de Serviços</title>
<link href="css/frame.css" rel="stylesheet">
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	
	<section class="janela">
	
		<h1>Cadastro de Serviços</h1>
		<form action="mvc?logica=AdicionaServicoLogic" method="post">
			Nome: <input type="text" name="nome"/><br/>
			Valor: <input type="text" name="valor"/><br/>
			<input type="submit" value="Salvar">
			<input type="reset" value="Limpar">
		</form>
	
	</section>
	
	<c:import url="rodape.jsp"/>
</body>
</html>