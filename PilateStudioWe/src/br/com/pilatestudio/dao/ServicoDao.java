package br.com.pilatestudio.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.pilatestudio.conexao.ConnectionFactory;
import br.com.pilatestudio.modelo.Servico;

public class ServicoDao {
	
	private Connection connection;
	
	public ServicoDao(Connection connection) throws SQLException{
		this.connection = connection; 
	}

	public void adiciona(Servico servico) {
		
		String sql = "insert into servicos" + "(nome, valor)" + "values(?,?)";
		
		try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setString(1, servico.getNome());
		stmt.setBigDecimal(2, servico.getValor());

		stmt.execute();
		connection.commit();
		}catch(Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void altera(Servico servico) {
		
		String sql = "update servicos set nome=?, valor=?" + "where idServico=?";
		
		try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setString(1, servico.getNome());
		stmt.setBigDecimal(2, servico.getValor());
		stmt.setInt(3, servico.getId());
		
		stmt.execute();
		connection.commit();
		}catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void remove(Servico servico) {
		
		String sql = "delete from servicos " + "where idServico=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, servico.getId());
			
			stmt.execute();
			connection.commit();
		}catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	} 
	
	public Servico buscaPorCodigo(Servico servico) {
		Servico s = null;
		String sql = "select nome, valor from servicos where idServico=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, servico.getId());
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				s = new Servico();
				s.setNome(rs.getString("nome"));
				s.setValor(rs.getBigDecimal("valor"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public List<Servico> getLista() throws SQLException {
		List<Servico> servicos = new ArrayList<Servico>();
		
		String sql = "select idServico, nome, valor from servicos ORDER BY idServico ASC";
	
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Servico servico = new Servico();
				
				servico.setId(rs.getInt("idServico"));
				servico.setNome(rs.getString("nome"));
				servico.setValor(rs.getBigDecimal("valor"));
							
				servicos.add(servico);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return servicos;
	}
	public static void main(String[] args) throws SQLException {
	Servico servico = new Servico();
		servico.setId(1);
		servico.setNome("Pilates");
		servico.setValor(new BigDecimal("110.00"));
/*		
		Connection connection = new ConnectionFactory().conectar();
		ServicoDao dao = new ServicoDao(connection);
		
		dao.remove(servico);

			List<Servico> servicos = dao.getLista();
			for(Servico serv : servicos) {
				System.out.println(serv);
			}*/
		Connection connection = ConnectionFactory.conectar();
		ServicoDao dao = new ServicoDao(connection);
		
		System.out.println(dao.buscaPorCodigo(servico));
	}
}
