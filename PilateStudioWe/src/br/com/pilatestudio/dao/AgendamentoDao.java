package br.com.pilatestudio.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.pilatestudio.conexao.ConnectionFactory;
import br.com.pilatestudio.modelo.Cliente;
import br.com.pilatestudio.modelo.Servico;
import br.com.pilatestudio.modelo.Agendamento;

public class AgendamentoDao {

	private Connection connection;
	
	public AgendamentoDao(Connection connection) throws SQLException{
		this.connection = connection;
	}
	
	public void adiciona(Agendamento agendamento) {
		String sql = "insert into agendamentos (cliente, servico, horario) values (?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, agendamento.getCliente().getId());
			stmt.setInt(2, agendamento.getServico().getId());
			stmt.setDate(3, new Date(agendamento.getHorario().getTimeInMillis()));
			
			stmt.execute();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	public void altera(Agendamento agendamento) {
		String sql = "update agendamentos set cliente=?, servico=?, horario=? where idAgendamento=?";
		
		try {
			PreparedStatement stmt =  connection.prepareStatement(sql);
			
			stmt.setInt(1, agendamento.getCliente().getId());
			stmt.setInt(2, agendamento.getServico().getId());
			stmt.setDate(3, new Date(agendamento.getHorario().getTimeInMillis()));
			stmt.setInt(4, agendamento.getId());
			
			stmt.execute();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void remove(Agendamento agendamento) {
		String sql = "delete from agendamentos where idAgendamento=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, agendamento.getId());
			
			stmt.execute();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public List<Agendamento> getLista() {
		List<Agendamento> agendamentos = new ArrayList<Agendamento>();
		String sql = "select a.idAgendamento, c.nome, s.nome, a.horario " + 
		"from clientes c join agendamentos a on c.idCliente = a.cliente " +
				"join servicos s on s.idServico = a.servico";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Agendamento agendamento = new Agendamento();
				agendamento.setId(rs.getInt("idAgendamento"));
				
				Cliente cliente = new Cliente();
//				cliente.setId(rs.getInt("c.idCliente"));
				cliente.setNome(rs.getString("c.nome"));
				agendamento.setCliente(cliente);
				
				Servico servico = new Servico();
//				servico.setId(rs.getInt("s.idServico"));
				servico.setNome(rs.getString("s.nome"));
				agendamento.setServico(servico);
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("a.horario"));
				agendamento.setHorario(data);
				
				agendamentos.add(agendamento);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return agendamentos;
	}
	
	public Agendamento BuscaPorCodigo(Agendamento agendamento) {
		Agendamento a = null;
		String sql = "select a.idAgendamento, c.nome, s.nome, a.horario " + 
		"from clientes c join agendamentos a on c.idCliente = a.cliente " + 
				"join servicos s on s.idServico = a.servico where idAgendamento = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, agendamento.getId());
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setNome(rs.getString("c.nome"));
				a.setCliente(cliente);
				
				Servico servico = new Servico();
				servico.setNome(rs.getString("s.nome"));
				a.setServico(servico);
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("a.horario"));
				a.setHorario(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	
	public static void main(String[] args) {
/*		Cliente c = new Cliente();
		c.setId(3);
		Servico s = new Servico();
		s.setId(1);
		Agendamento a = new Agendamento();
		a.setId(1);
		a.setCliente(c);
		a.setServico(s);
		a.setHorario(Calendar.getInstance());
	*/	
		Connection connection = ConnectionFactory.conectar(); 
		AgendamentoDao dao;
/*		try {
			dao = new AgendamentoDao(connection);
			List<Agendamento> agendamentos = dao.getLista();
			
			for (Agendamento ag : agendamentos) {
				System.out.println(ag);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
/*		try {
			AgendamentoDao dao = new AgendamentoDao(connection);
			dao.adiciona(a);
			System.out.println("agendamento realizado.");
		} catch (SQLException e) {
			System.out.println("agendameto nao pode ser editado");
			e.printStackTrace();
		}*/
		try {
			dao = new AgendamentoDao(connection);
			
			Agendamento a = new Agendamento();
			a.setId(1);
			System.out.println(dao.BuscaPorCodigo(a));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
