<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/formulario.css" rel="stylesheet">
<script type="text/javascript">
	function preco_serv(servico) {
		var serv = document.getElementById('cServ').value;
		var valor = 0;
		if(servico == "Pilates"){
			valor += 110.00;
		}
		if(servico == "FitDance"){
			valor = valor + 50.00;
		}
		document.getElementById('cVal').value = valor;
	}
</script>
</head>
<body>
	<h1>Agendamento</h1>
	<form action="" method="post">
	
		<fieldset id="dados-pessoais"><legend>dados do cliente.</legend>
			<p><label for="cNome">Nome:</label><input type="text" name="tNome" id="cNome" size="30" maxlength="30" placeholder="nome completo"></p>
			<fieldset id="sexo"><legend>Sexo:</legend>
					<input type="radio" name="tSexo" id="cMasc"><label for="cMasc">Masculino</label><br/>
					<input type="radio" name="tSexo" id="cFem"><label for="cFem">Feminino</label>
			</fieldset>
			<p><label for="cTel">Telefone:</label><input type="text" name="tTel" id="cTel" size="11" maxlength="11" placeholder="(00)999999999"></p>
			<p><label for="cNasc">Data de Nascimento:</label><input type="date" name="tNasc" id="cNasc"></p>
		</fieldset>
	
		<fieldset id="endereco"><legend>endereço do cliente.</legend>
			<p><label for="cRua">Rua:</label><input type="text" name="tRua" id="cRua" size="30" maxlength="80" placeholder="nome da rua"></p>
			<p><label for="cNum">Número:</label><input type="number" name="tNum" id="cNum" min="0" max="99999"></p>
			<p><label for="cCid">Cidade:</label>
			<input type="text" name="tCid" id="cCid" maxlength="40" size="20" placeholder="sua cidade" list="cidades"></p>
			<datalist id="cidades">
				<option value="Maturéia"></option>
				<option value="Teixeira"></option>
				<option value="Cacimbas"></option>
				<option value="Desterro"></option>
				<option value="Livramento"></option>
				<option value="Patos"></option>
			</datalist>
			<p><label for="cEst">Estado:</label>
			<select name="tEst" id="cEst">
				<option value="PB">Paraiba</option>
				<option value="PE">Pernambuco</option>
				<option value="RN">Rio Grande do Norte</option>
				<option value="CE">Ceara</option>
			</select></p>
		</fieldset>
	
		<fieldset id="servico"><legend>dados do serviço.</legend>
			<p><label for="cServ">Serviço:</label>
			<select name="tServ" id="cServ">
				<option oninput="preco_sev('Pilates')">Pilates</option>
				<option>FitDance</option>
				<option>Ballet</option>
				<option>Massagem</option>
				<option>Acunputura</option>
				<option>Limpeza de Pele</option>
			</select></p>
			<p><label for="cHor">Horario:</label><input type="date" name="tHor" id="cHor"></p>
			<p><label for="cVal">Valor: R$</label>
			<input type="text" name="tVal" id="cVal" placeholder="valor do serviço" readonly></p>	
		</fieldset>
		
		<input type="submit" value="Enviar">
		
	</form>
</body>
</html>