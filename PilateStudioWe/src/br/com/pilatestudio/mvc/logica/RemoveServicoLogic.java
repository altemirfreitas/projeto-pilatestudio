package br.com.pilatestudio.mvc.logica;

import java.sql.Connection; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ServicoDao;
import br.com.pilatestudio.modelo.Servico;

public class RemoveServicoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		Servico servico = new Servico();
		servico.setId(id);
		
		Connection connection = (Connection) req.getAttribute("connection");
		ServicoDao dao = new ServicoDao(connection);
		dao.remove(servico);
		
		System.out.println("Excluindo servico ...");
		return "mvc?logica=ListaServicoLogic";
	}

	
}
