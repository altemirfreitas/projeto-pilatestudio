package br.com.pilatestudio.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.AgendamentoDao;
import br.com.pilatestudio.modelo.Agendamento;

public class ListaAgendamentoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Connection connection = (Connection) req.getAttribute("connection");
		List<Agendamento> agendamentos = new AgendamentoDao(connection).getLista();
		
		req.setAttribute("agendamentos", agendamentos);
		return "lista-agendamentos.jsp";
	}

}
