package br.com.pilatestudio.mvc.logica;

import java.math.BigDecimal;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ServicoDao;
import br.com.pilatestudio.modelo.Servico;

public class MostraServicoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
/*		String nome = req.getParameter("nome");
		BigDecimal valor = new BigDecimal(req.getParameter("valor"));
		String horarioEmTexto = req.getParameter("horario");
		Calendar horario = null;
		
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(horarioEmTexto);
			horario = Calendar.getInstance();
			horario.setTime(data);
		} catch (Exception e) {
			System.out.println("erro na conversao da data.");
		}*/
		Servico servico = new Servico();
		servico.setId(id);
/*		servico.setNome(nome);
		servico.setValor(valor);
		servico.setHorario(horario);*/
			
		Connection connection = (Connection) req.getAttribute("connection");
		ServicoDao dao = new ServicoDao(connection);
		dao.buscaPorCodigo(servico);
		return "altera-servico.jsp";
	}

	
}
