<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<c:forEach var="servico" items="${servicos}">
		<tr>
			<td>${servico.nome}</td>
			<td>${servico.valor}</td>
			<td>
				<a href="mvc?logica=MostraServicoLogic&id=${servico.id}&nome=${servico.nome}&valor=${servico.valor}">Alterar</a>
				<a href="mvc?logica=RemoveServicoLogic&id=${servico.id}">Remover</a>
		</tr>
		</c:forEach>
	</table>
	
	<c:import url="rodape.jsp"/>
</body>
</html>