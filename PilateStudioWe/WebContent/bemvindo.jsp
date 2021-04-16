<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>PilateStudio</title>
<link href="css/sobre.css" rel="stylesheet">
</head>

 	<header class="cabecalho">
		<c:import url="cabecalho.jsp"/>
	</header>
	
	<%--Titulo Principal --%>
	
	<article class="artigo">
		<h1>Sobre o PilateStudio</h1>
		
		<%--Texto em paragrafos --%>
		
		<figure class="foto-legenda">
			<img src="imagens/Lilian.jpeg">
			<figcaption>Lilian Leite Albuquerque.</figcaption>
		</figure>
		
		<p>
			O <b>PilateStudio</b> é uma empresa fundada em 2013 na cidade de Teixeira-PB, por a fisioterapeuta
			<i>Dr. Lilian Leite Albuquerque</i>, que além de fisioterapeuta também é massoterapeuta e tem especialização
			em acupuntura e limpeza de pele, e anualmente participa de diversos eventos preparatórios visando um melhor atendimento
			aos seus clientes.	
		</p><br/><br/>
			 
		<p>
			Inicialmente o <b>PilateStudio</b> tinha apenas o proposito de auxiliar no treinamento, prevenção e reabilitação fisica, 
			porém, com o decorrer dos anos passou a dispoibilizar serviços relacionados a beleza e ao bem estar, graças a parcerias 
			firmadas com profissionais dessas areas, bem como ao investimento da propritária. Atualmente o PilateStudio disponibiliza 
			além do serviço de pilates os de fitdance (ministrado por Yrtilo Santos), ballet (ministrado por Lis Pergentino), massagem, 
			limpeza de pele e acupuntura.
		</p><br/><br/>
		
		<figure class="foto-esposicao">
			<img alt=" Estudio PilateStidio" src="imagens/foto-estudio.jpeg">
			<figcaption>Area de Fisioterapia.</figcaption>
		</figure>
		
		<p>
			Quando foi fundado o <b>PilateStudio</b> funcionava em espaço alugado, localizado Proximo ao local atual, com uma estrutura reduzida
			e com menos recurso, Pórem pouco a pouco foi ganhando espaço devido aos resultados apresentados na recuperação de seus paciêntes e na
			prevenção de novos casos. 
		</p><br/><br/>
		
		<p>
			Hoje o <b>PilateStudio</b> conta com um espaço próprio e amplo contendo dois salões, e para as atividades relacionadas a reabilitação
			e trinamento, possui os melhores equipamentos do mercado, tudo para  a segurança e comodidade dos nossos clientes, portanto,
			não perca tempo e venha nos fazeruma visita ou se preferir navegue no nosso menu e saiba mais sobre os nossos serviços
			teremos prazer em atende-lo. 	
		</p>
	</article>	
		
	<%--Importando o rodape --%>
	<footer class="rodape">
	<c:import url="rodape.jsp"/>
	</footer>
</body>
</html>