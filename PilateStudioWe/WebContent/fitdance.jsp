<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/sobre.css" rel="stylesheet">
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	
	<article class="artigo">
		
		<h1>O que é FitDance</h1>
			
			<figure class="foto-esposicao">
				<img src="imagens/fitdance.jpg">
				<figcaption>Aula de FitDance.</figcaption>
			</figure>
			
			<p>
				É uma dança que mistura vários ritmos. Além disso, as coreografias são elaboradas para um maior gasto calórico 
				e condicionamento físico.
			</p><br/><br/>
			
			<p>
				Ao longo da aula, os estilos musicais são variados. Assim, ela fica cada vez mais dinâmica e prazerosa.
			</p><br/><br/>
			
			<p>
				O professor dá as coordenadas dos passos e os alunos o seguem. É bem simples de se fazer, mesmo para quem 
				tem dificuldades em dançar.
			</p><br/><br/>
			
			<p>
			Por isso, é uma alternativa para as pessoas que querem se exercitar, mas que não gostam das atividades tradicionais.
			</p><br/><br/>
			
			<p>
				Embora existam videoaulas na internet, o ideal é fazer em uma academia com supervisão de um profissional.
			</p><br/>
			<p>
				Dessa forma, você evita lesões e garante que está fazendo os movimentos do jeito certo.
			</p><br/>
						
			<h1>Quais os seus Beneficios?</h1>
			
			<ul>
				<li>Ajuda na boa forma.</li>
				<li>Aumenta a autoestima e bem-estar.</li>
				<li>Previne  doenças.</li>
				<li>Promove a interação.</li>
			</ul>
	
	</article>
	
	<p>Confira no video uma demonstração de fitdance com o Professor Yrtilo Santos.</p>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/TqBgbijb-hc" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			
	<c:import url="rodape.jsp"/>
</body>
</html>