
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PilateStudio</title>
<link href="css/tabela.css" rel="stylesheet">
</head>
<body>
	
	<c:import url="cabecalho.jsp"/>
	
	<table class="tabela">
		<c:forEach var="cliente" items="${clientes}">
		
		<tr>
			<td>${cliente.nome}</td>
			<td>${cliente.sexo}</td>
			<td><fmt:formatDate value="${cliente.dataNascimento.time }" pattern="dd/MM/yyyy HH:mm"/></td>
			<td>${cliente.telefone}</td>
			<td>${cliente.endereco}</td>
			<td>
				<a href="mvc?logica=MostraClienteLogic&id=${cliente.id}&nome=${cliente.nome}&sexo=${cliente.sexo}
				&dataNascimento=${cliente.dataNascimento.time}&telefone=${cliente.telefone}&endereco=${cliente.endereco}">Alterar</a>
				<a href="mvc?logica=RemoveClienteLogic&id=${cliente.id}">Remover</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
	<c:import url="rodape.jsp"/>
</body>
</html>