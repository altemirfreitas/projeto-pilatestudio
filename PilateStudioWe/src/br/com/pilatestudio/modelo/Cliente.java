package br.com.pilatestudio.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cliente {

	private int id;
	private String nome;
	private String sexo;
	private Calendar dataNascimento;
	private String telefone;
	private String endereco;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
		
	}

	public void setId(int id) {
		this.id = id;
		
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
//		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return "Cliente [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ","
				+ " dataNascimento=" + dataNascimento
				+ ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}

	public static void main(String[] args) {
		Cliente c = new Cliente();
//		c.setLogin("admin");
	//	c.setSenha("123");
//		System.out.println("Login: " + c.getLogin() + " Senha: " + c.getSenha());
	}
}
