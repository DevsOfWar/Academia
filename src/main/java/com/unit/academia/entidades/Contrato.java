package com.unit.academia.entidades;

import java.sql.Date;

public class Contrato {
	private int codContrato;
	private Date dtInicial;
	private Date dtFinal;
	private byte[] scanContratoInicial;
	private byte[] scanRecisao;
	private String tipoContrato;
	private boolean status;
	private float valorAcordado;
	private int qtdAtividadesAcordadas;
	
	private Aluno aluno;
	private Plano plano;
}
