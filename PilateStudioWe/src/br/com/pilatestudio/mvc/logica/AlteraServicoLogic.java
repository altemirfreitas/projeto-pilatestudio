package br.com.pilatestudio.mvc.logica;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ServicoDao;
import br.com.pilatestudio.modelo.Servico;

public class AlteraServicoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String nome = req.getParameter("nome");
		BigDecimal valor = new BigDecimal(req.getParameter("valor"));
		int id = Integer.parseInt(req.getParameter("id"));
		
		Servico servico = new Servico();
		servico.setNome(nome);
		servico.setValor(valor);
		servico.setId(id);
		
		Connection connection = (Connection) req.getAttribute("connection");
		ServicoDao dao = new ServicoDao(connection);
		dao.altera(servico);
		
		System.out.println("Editando Servico...");
		return "mvc?logica=ListaServicoLogic";
	}

	
}
