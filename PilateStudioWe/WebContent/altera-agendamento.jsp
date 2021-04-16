<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pilatestudio" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/frame.css" rel="stylesheet">
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	
	<section class="janela">
	
		<form action="">
			ID: <input type="text" name="id" value="${param.id}"><br/>
			Cliente: <input type="text" name="cliente" value="${param.cliente}"><br/>
			Servico: <input type="text" name="cliente" value="${param.servico}"><br/>
			Horario: <pilatestudio:campoData id="horario"/><br/>
			<input type="submit" value="Alterar">
			<input type="reset" value="Limpar">
		</form>
	
	</section>
	
	<c:import url="rodape.jsp"/>
</body>
</html>