package br.com.pilatestudio.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Agendamento {

	private int id;
	private Servico servico;
	private Cliente cliente;
	private Calendar horario;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Servico getServico() {
		return servico;
	}
	
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Calendar getHorario() {
		return horario;
	}
	
	public void setHorario(Calendar horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Agendamento [id=" + id + ", servico=" + servico.getNome() + ", cliente=" + cliente.getNome()+ ", horario=" + horario + "]";
	}
		
}
