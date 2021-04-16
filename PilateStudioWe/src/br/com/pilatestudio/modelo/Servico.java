package br.com.pilatestudio.modelo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Servico {

	private int id;
	private String nome;
	private BigDecimal Valor;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public BigDecimal getValor() {
		return Valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.Valor = valor;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return "Servico [id=" + id + ", nome=" + nome + ", Valor=" + Valor + "]";
	}
	
}
