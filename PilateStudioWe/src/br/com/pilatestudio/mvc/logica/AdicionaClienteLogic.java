package br.com.pilatestudio.mvc.logica;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ClienteDao;
import br.com.pilatestudio.modelo.Cliente;

public class AdicionaClienteLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String nome = req.getParameter("nome");
		String sexo = req.getParameter("sexo");
		String dataEmTexto = req.getParameter("dataNascimento");
		String telefone = req.getParameter("telefone");
		String endereco = req.getParameter("endereco");
		Calendar dataNascimento = null;
		
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(data);
		} catch (ParseException e) {
			System.out.println("Erro na Conversao da data.");
			e.printStackTrace();
		}

		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setSexo(sexo);
		cliente.setDataNascimento(dataNascimento);
		cliente.setTelefone(telefone);
		cliente.setEndereco(endereco);
		
		try {
			Connection connection = (Connection) req.getAttribute("connection");
			ClienteDao dao = new ClienteDao(connection);
			dao.adiciona(cliente);
//			connection.close();
		
		} catch (SQLException e) {
			System.out.println("Cliente nao pode ser adicionado.");
		}
				
		System.out.println("Adicionando cliente " + cliente.getNome() + " ...");
		return "bemvindo.jsp";
	}
	
}
