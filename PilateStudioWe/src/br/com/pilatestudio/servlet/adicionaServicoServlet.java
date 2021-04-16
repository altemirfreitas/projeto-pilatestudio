package br.com.pilatestudio.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ServicoDao;
import br.com.pilatestudio.modelo.Servico;

@WebServlet("/adicionaServico")
public class adicionaServicoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String nome = req.getParameter("nome");
		BigDecimal valor = new BigDecimal(req.getParameter("valor"));
		
		Servico servico = new Servico();
		servico.setNome(nome);
		servico.setValor(valor);
		
		try {
			Connection connection = (Connection) req.getAttribute("connection");
			ServicoDao dao = new ServicoDao(connection);
			dao.adiciona(servico);
			RequestDispatcher rd = req.getRequestDispatcher("/servico-adicionado.jsp");
			rd.forward(req, resp);
		} catch (SQLException e) {
			out.println("Servico: " + servico.getNome() + " nao pode ser adicionado.");
			e.printStackTrace();
		}
	}
}
