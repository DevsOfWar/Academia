package com.unit.academia.entidades;

import java.sql.Date;

public class Cartao extends Pagamento {
	private String bandeira;
	private String nome;
	private String numero;
	
	
	public Cartao(int codPagamento, String metodo, byte[] confirmacao, Date dtPagamento, float valor,
			Contrato contrato, String bandeira, String nome, String numero) {
		super(codPagamento, metodo, confirmacao, dtPagamento, valor, contrato);
		this.bandeira = bandeira;
		this.nome = nome;
		this.numero = numero;
	}
	public Cartao(String metodo, byte[] confirmacao, Date dtPagamento, float valor, Contrato contrato, String bandeira, String nome, String numero) {
		super(metodo, confirmacao, dtPagamento, valor, contrato);
		this.bandeira = bandeira;
		this.nome = nome;
		this.numero = numero;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	
}
