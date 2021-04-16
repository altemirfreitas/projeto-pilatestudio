<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/tabela.css" rel="stylesheet">
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	
	<table class="tabela">
		<tr class="label">
			<td>Cliente</td>
			<td>Serviço</td>
			<td>Horario</td>
		</tr>
		<c:forEach var="agendamento" items="${agendamentos}">
			<tr>
				<td>${agendamento.cliente.nome}</td>
				<td>${agendamento.servico.nome}</td>
				<td><fmt:formatDate value="${agendamento.horario.time}" pattern="dd/MM/yyyy HH:mm"/>
				<td><a href="mvc?logica=RemoveAgendamentoLogic&id=${agendamento.id}">Remover</a>
				<td><a href="mvc?logica=MostraAgendamentoLogic&id=${agendamento.id}&cliente=${agendamento.cliente.id}&servico${agendamento.servico.id}">Alterar</a>
			</tr>
		</c:forEach>
	</table>
	
	<c:import url="rodape.jsp"/>
</body>
</html>