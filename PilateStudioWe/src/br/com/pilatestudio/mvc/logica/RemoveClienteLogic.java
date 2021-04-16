package br.com.pilatestudio.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ClienteDao;
import br.com.pilatestudio.modelo.Cliente;

public class RemoveClienteLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//pegando o id
		int id = Integer.parseInt(req.getParameter("id"));
		//instanciando e setando o id
		Cliente cliente = new Cliente();
		cliente.setId(id);
		//criando um dao e chamando o metodo excluir
		Connection connection = (Connection) req.getAttribute("connection");
		ClienteDao dao = new ClienteDao(connection);
		dao.remove(cliente);
		
		System.out.println("Excluindo cliente ...");
		//retornando o lista cliente
		return "mvc?logica=ListaClienteLogic";
	}

}
