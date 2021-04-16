package br.com.pilatestudio.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pilatestudio.modelo.Cliente;
import br.com.pilatestudio.modelo.Usuario;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//	System.out.println(request.getParameter("login"));
	//	System.out.println(request.getParameter("senha"));
		Usuario usuario = new Usuario();
		String login  = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if(usuario.validar(login, senha)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("bemvindo.jsp");
			dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("erro.html");
			dispatcher.forward(request, response);
		}
	}

}
