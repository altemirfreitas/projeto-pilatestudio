
package br.com.pilatestudio.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.pilatestudio.conexao.ConnectionFactory;
import br.com.pilatestudio.modelo.Cliente;

public class ClienteDao {

	private Connection connection;
	
	public ClienteDao(Connection connection) throws SQLException {
		this.connection = connection;
	}
	
	public void adiciona(Cliente cliente) {
		String sql = "insert into clientes" +"(nome, sexo, nascimento, telefone, endereco)" + 
	"values(?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getSexo());
			stmt.setDate(3, new Date(cliente.getDataNascimento().getTimeInMillis()));
			stmt.setString(4, cliente.getTelefone());
			stmt.setString(5, cliente.getEndereco());
			
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
	
	public List<Cliente> getLista(){
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			String sql = "select idCliente, nome,"
			+ "sexo, nascimento, telefone, endereco from clientes ORDER BY idCliente ASC";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("idCliente"));
				cliente.setNome(rs.getString("nome"));
				cliente.setSexo(rs.getString("sexo"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("nascimento"));
				cliente.setDataNascimento(data);
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setEndereco(rs.getString("endereco"));
				
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	
	public void altera(Cliente cliente) {
		String sql = "update clientes set nome=?, sexo=?, nascimento=?, telefone=?," + 
	"endereco=? where idCliente=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getSexo());
			stmt.setDate(3, new Date(cliente.getDataNascimento().getTimeInMillis()));
			stmt.setString(4, cliente.getTelefone());
			stmt.setString(5, cliente.getEndereco());
			stmt.setInt(6, cliente.getId());
			
			stmt.execute();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public void remove(Cliente cliente) {
		String sql = "delete " + "from clientes where idCliente=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, cliente.getId());
			stmt.execute();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("nao foi possivel remover o cliente: " + cliente.getNome());
		}
	}
	
	public Cliente buscarPorCodigo(Cliente cliente) {
		Cliente c = null;
		String sql = "select nome, sexo, nascimento,telefone, endereco from clientes where idCliente = ?";
				
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
		
			stmt.setInt(1, cliente.getId());
		
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				c = new Cliente();
				c.setNome(rs.getString("nome"));
				c.setSexo(rs.getString("sexo"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("nascimento"));
				c.setDataNascimento(data);
				c.setTelefone(rs.getString("telefone"));
				c.setEndereco(rs.getString("endereco"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
/*	public static void main(String[] args) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setNome("Almir");
		cliente.setSexo("M");
		cliente.setDataNascimento(Calendar.getInstance());
		cliente.setTelefone("123456789");
		cliente.setEndereco("Avenida Assis Bonfim");
	
		ClienteDao dao = new ClienteDao();
		
		Cliente clienten = new Cliente();
//		clienten.setId(3);
		clienten.setNome("Edson");
		clienten.setSexo("M");
		clienten.setDataNascimento(Calendar.getInstance());
		clienten.setTelefone("222222222");
		clienten.setEndereco("Avenida Assis Bonfim");
		
		try {
			dao.adiciona(cliente);
			System.out.println("Clinte adicionado com sucesso.");
		} catch (SQLException e) {
			System.out.println("Nao foi possivel adicinar o cliente.");
			e.printStackTrace();
		}
	//	dao.altera(clienten);
	//	dao.remove(clienten);
	//	Cliente clientePesquisado = dao.pesquisar(4);
		
		List<Cliente> clientes = dao.getLista();
		
		for(Cliente client: clientes) {
			System.out.println(client);
		}
		
	/*	Cliente c1 = new Cliente();
		c1.setId(1);
		System.out.println("Cliente: " + dao.buscarPorCodigo(c1));

	}*/
}
