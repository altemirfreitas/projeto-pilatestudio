package br.com.pilatestudio.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ClienteDao;
import br.com.pilatestudio.modelo.Cliente;

public class MostraClienteLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		
		Cliente cliente = new Cliente();
		cliente.setId(id);
		
		Connection connection = (Connection) req.getAttribute("connection");
		ClienteDao dao = new ClienteDao(connection);
		dao.buscarPorCodigo(cliente);
		
		return "altera-cliente.jsp";
	}

	
}
