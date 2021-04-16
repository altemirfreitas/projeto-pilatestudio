<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="pilatestudio" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela de Cadastro de Cliente</title>
	<link href="css/jquery.css" rel="stylesheet">
	<link href="css/frame.css" rel="stylesheet">
	<script src="js/jquery.js"></script>
	<script src="js/jquery-ui.js"></script>
</head>
<body>
	<c:import url="cabecalho.jsp"/>
	
	<section class="janela">
	
		<h1>Cadastro de Clientes</h1>
		
		<form action="mvc?logica=AdicionaClienteLogic" method="post">
			Nome:<input type="text" name="nome"/><br/><br/>
			Sexo:<input type="text" name="sexo"/><br/><br/>
			Data de nascimento: <pilatestudio:campoData id="dataNascimento"/><br/><br/>
			Telefone:<input type="text" name="telefone"/><br/><br/>
			Endereco:<input type="text" name="endereco"/><br/><br/>
			<input type="submit" value="Salvar">
			<input type="reset" value="Limpar"><br/><br/>
		</form>
		
	</section>
	
	<c:import url="rodape.jsp"></c:import>
</body>
</html>