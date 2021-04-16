<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags"  prefix="pilatestudio"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Agendamento</title>
<link href="css/jquery.css" rel="stylesheet">
<link href="css/frame.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>

</head>
<body>
	<c:import url="cabecalho.jsp"/>
	
	<section class="janela"> 
		
		<h1>Cadastro de Agendamentos</h1>
		
		<form action="mvc?logica=AdicionaAgendamentoLogic" method="post">
			Cliente: <input type="text" name="cliente"/><br/>
			Servico: <input type="text" name="servico"/><br/>
			Horario: <pilatestudio:campoData id="horario"/><br/>
			<input type="submit" value="Confirmar">
			<input type="reset" value="Limpar">
		</form>
	
	</section>
	<c:import url="rodape.jsp"/>
</body>
</html>