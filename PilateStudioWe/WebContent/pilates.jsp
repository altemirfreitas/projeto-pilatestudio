<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/sobre.css" rel="stylesheet">
</head>
<body>
	<header class="cabecalho">
		<c:import url="cabecalho.jsp"/>
	</header>
	
	<article class="artigo">
		<h1>O que é Pilates?</h1> 
		
			<figure class="foto-esposicao">
				<img src="imagens/pilates.jpg">
				<figcaption>Exercício de Pilates.</figcaption>
			</figure>
			
			<p>
				O método que surgiu no início do século passado tem como principal objetivo unir o corpo e a mente. Foi a partir desse pensamento 
				e de várias observações que seu idealizador, Joseph Pilates, criou a Contrologia. Mas não se engane, este processo não foi rápido
				e foi preciso vários anos de estudo assim como uma metodologia projetada a partir do público que estudava.
			</p><br/><br/>
			
			<p>
				O método não é um conjunto de exercícios prontos e generalizados. Ele consiste em observar o seu aluno e perceber quais são suas necessidades
				e assim adaptar os exercícios para alcançar o resultado necessário sempre beneficiando ao máximo o seu cliente.
			</p><br/><br/>
			
			<p>
				Assim, todo instrutor tem por obrigação analisar os sinais que o corpo do aluno está dando e a partir de então planejar e desenvolver um conjunto
				de exercícios que propiciem a integração de mente, corpo e espírito. Essa integração é muito importante no Pilates, pois só assim o indivíduo é 
				capaz de ter o controle completo do próprio corpo.
			</p><br/><br/>
				
			<p>
				Como Joseph afirmava, a Contrologia tem por resultado o controle consciente de todos os movimentos musculares do corpo, assim aplicando todos os
				princípios do método que tem bases em fundamentos anatômicos, fisiológicos e cinesiológicos, que são: Concentração, Controle, Precisão, Centramento,
				Respiração e Movimento fluido.
			</p><br/><br/>
		<h1>Quais os seus Beneficios?</h1>
		
		<ul>
			<li>Aumenta a resistência física e mental</li>
			<li>Aumenta a Flexibilidade</li>
			<li>Melhora os desvios da coluna</li>
			<li>Trata patologias</li>
			<li>Aumenta a capacidade cardiorrespiratória</li>
			<li>Diminui ou acaba com as dores</li>
			<li>Aprimora o gesto esportivo</li>
			<li>Corrige problemas posturais</li>
			<li>Aumenta a concentração</li>
			<li>Tonifica a musculatura</li>
			<li>Melhora a coordenação motora</li>
			<li>Promove menor atrito nas articulações</li>
			<li>Alivia dores musculares</li>
			<li>Elimina toxinas e facilita a drenagem linfática</li>
		</ul>
	</article>
	
	<c:import url="rodape.jsp"/>
</body>
</html>