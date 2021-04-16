package br.com.pilatestudio.mvc.logica;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.AgendamentoDao;
import br.com.pilatestudio.modelo.Agendamento;
import br.com.pilatestudio.modelo.Cliente;
import br.com.pilatestudio.modelo.Servico;

public class AlteraAgendamentoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		int idCliente = Integer.parseInt(req.getParameter("cliente"));
		int idServico = Integer.parseInt(req.getParameter("servico"));
		String dataEmTexto = req.getParameter("horario");
		Calendar horario = null;
		
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			horario = Calendar.getInstance();
			horario.setTime(data);
		} catch (ParseException e) {
			System.out.println("erro na conversão");
			e.printStackTrace();
		}
		
		Cliente cliente = new Cliente();
		cliente.setId(idCliente);
		
		Servico servico = new Servico();
		servico.setId(idServico);
		
		Agendamento agendamento = new Agendamento();
		agendamento.setId(id);
		agendamento.setCliente(cliente);
		agendamento.setServico(servico);
		agendamento.setHorario(horario);
		
		try { 
			Connection connection = (Connection) req.getAttribute("connection");
			AgendamentoDao dao = new AgendamentoDao(connection);
			dao.altera(agendamento);
		} catch (SQLException e) {
			System.out.println("Editando agendamento ...");
		}
		return "mvc?logica=ListaAgendamentoLogic";
	}

}
