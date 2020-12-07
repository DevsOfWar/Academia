package com.unit.academia.entidades;

import java.sql.Date;

public class Pagamento {
	private int codPagamento;
	private String metodo;
	private byte[] confirmacao;
	private Date dtPagamento;
	private float valor;
	
	private Contrato contrato;
}
