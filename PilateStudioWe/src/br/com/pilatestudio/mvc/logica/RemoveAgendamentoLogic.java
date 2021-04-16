package br.com.pilatestudio.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.AgendamentoDao;
import br.com.pilatestudio.modelo.Agendamento;

public class RemoveAgendamentoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int id  = Integer.parseInt(req.getParameter("id"));
		
		Agendamento agendamento = new Agendamento();
		agendamento.setId(id);
		
		Connection connection = (Connection) req.getAttribute("connection");
		AgendamentoDao dao = new AgendamentoDao(connection);
		dao.remove(agendamento);
		
		System.out.println("Removendo agendamento ...");
		return "mvc?logica=ListaAgendamentoLogic";
	}

}
