package br.com.pilatestudio.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String DRIVER ="com.mysql.jdbc.Driver"; 
	private static final String USER = "altemir";
	private static final String PASSWORD = "improvavel";
	private static final String URL = "jdbc:mysql://localhost:3306/pilatestudio";
	private static Connection connection = null;
	
	public static Connection conectar() {
		
		try {
			Class.forName(DRIVER);
			
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			connection.setAutoCommit(false);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) throws SQLException {
		
		
			Connection conexao = ConnectionFactory.conectar();
		if(conexao != null) {	
			System.out.println("Conexão relizada com sucssso!");
			conexao.close();
		}else {
			System.out.println("conexão não pode ser realizada!");
		}
	}
}
