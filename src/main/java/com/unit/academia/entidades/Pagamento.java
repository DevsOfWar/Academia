package com.unit.academia.entidades;

import java.sql.Date;

public class Pagamento {
	private int codPagamento;
	private String metodo;
	private byte[] confirmacao;
	private Date dtPagamento;
	private float valor;
	
	private Contrato contrato;
	
	//novo
	public Pagamento(String metodo, byte[] confirmacao, Date dtPagamento, float valor, Contrato contrato) {
		super();
		this.metodo = metodo;
		this.confirmacao = confirmacao;
		this.dtPagamento = dtPagamento;
		this.valor = valor;
		this.contrato = contrato;
	}
	//ler
	public Pagamento(int codPagamento, String metodo, byte[] confirmacao, Date dtPagamento, float valor,
			Contrato contrato) {
		super();
		this.codPagamento = codPagamento;
		this.metodo = metodo;
		this.confirmacao = confirmacao;
		this.dtPagamento = dtPagamento;
		this.valor = valor;
		this.contrato = contrato;
	}
	public int getCodPagamento() {
		return codPagamento;
	}
	public void setCodPagamento(int codPagamento) {
		this.codPagamento = codPagamento;
	}
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public byte[] getConfirmacao() {
		return confirmacao;
	}
	public void setConfirmacao(byte[] confirmacao) {
		this.confirmacao = confirmacao;
	}
	public Date getDtPagamento() {
		return dtPagamento;
	}
	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	
}
