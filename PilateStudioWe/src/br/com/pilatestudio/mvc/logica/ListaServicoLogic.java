package br.com.pilatestudio.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ServicoDao;
import br.com.pilatestudio.modelo.Servico;

public class ListaServicoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Connection connection = (Connection) req.getAttribute("connection");
		List<Servico> servicos = new ServicoDao(connection).getLista();
		
		req.setAttribute("servicos", servicos);
		return "lista-servicos.jsp";
	}

	
}
