package br.com.pilatestudio.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ClienteDao;
import br.com.pilatestudio.modelo.Cliente;

public class ListaClienteLogic implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Connection connection = (Connection) req.getAttribute("connection");
		List<Cliente> clientes = new ClienteDao(connection).getLista();
		
		req.setAttribute("clientes", clientes);
		return "lista-cliente.jsp";
	}
}
