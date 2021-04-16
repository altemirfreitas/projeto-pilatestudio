<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Cabeçalho</title>
<link href="css/cabecalho.css" rel="stylesheet">
</head>
<script src="js/funcoes.js"></script>
<body>
	<header class="container">
			
			<section class="menu-opcoes">
				<nav>
					<ul>
						<li><a href="bemvindo.jsp">Home</a></li>
						<li><a href="Login.jsp">Sair</a></li>
						<li><a href="agendamento.jsp">Agendamento</a></li>
					</ul>
				</nav>
			</section>
			
			<section class="menu-departamentos">
				<nav>
					<ul>
					
						<li>Treinamento
							<ul class="sub-itens">
								<li><a href="pilates.jsp">Pilates</a></li>
							</ul>
						</li>
						
						<li>Bem-Estar
							<ul class="sub-itens">
								<li><a href="fitdance.jsp">FitDance</a></li>
								<li><a href="acupuntura.jsp">Acupuntura</a></li>
								<li><a href="ballet.jsp">Ballet</a></li>
								<li><a href="massagem.jsp">Massagem</a></li>
							</ul>
						</li>
						
						<li>Beleza
							<ul class="sub-itens">
								<li><a href="limpeza-de-pele.jsp">Limpeza de Pele</a></li>
							</ul>
						</li>
					</ul>
				</nav>
			</section>
			
	</header>
</body>
</html>