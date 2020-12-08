package com.unit.academia.entidades;

import java.sql.Date;

public class Boleto extends Pagamento {
	private String codigoBarras;

	public Boleto(int codPagamento, String metodo, byte[] confirmacao, Date dtPagamento, float valor,
			Contrato contrato, String codigoBarras) {
		super(codPagamento, metodo, confirmacao, dtPagamento, valor, contrato);
		this.codigoBarras = codigoBarras;
	}

	public Boleto(String metodo, byte[] confirmacao, Date dtPagamento, float valor, Contrato contrato, String codigoBarras) {
		super(metodo, confirmacao, dtPagamento, valor, contrato);
		this.codigoBarras = codigoBarras;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	
}
