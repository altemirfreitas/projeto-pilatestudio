package br.com.pilatestudio.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.dao.ClienteDao;
import br.com.pilatestudio.modelo.Cliente;

@WebServlet("/adicionaCliente")
public class AdicionaClienteServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String nome = req.getParameter("nome");
		String sexo = req.getParameter("sexo");
		String dataEmTexto = req.getParameter("dataNascimento");
		String telefone = req.getParameter("telefone");
		String endereco = req.getParameter("endereco");
		Calendar dataNascimento = null;
		
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(data);
		} catch (ParseException e) {
			out.println("erro na conversão da data.");
			e.printStackTrace();
			return;
		}
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setSexo(sexo);
		cliente.setDataNascimento(dataNascimento);
		cliente.setTelefone(telefone);
		cliente.setEndereco(endereco);
	
			try {
				Connection connection = (Connection) req.getAttribute("connection");
				ClienteDao dao = new ClienteDao(connection);
				dao.adiciona(cliente);
				
				RequestDispatcher rd = req.getRequestDispatcher("mvc?logica=ListaClienteLogic");
				rd.forward(req, resp);

			} catch (SQLException e) {
				e.printStackTrace();
				out.println("cliente: " + cliente.getNome() + " nao pode ser adicionado.");
	

			}
		}
}
