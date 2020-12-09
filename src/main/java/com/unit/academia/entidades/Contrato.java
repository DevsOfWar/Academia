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
	
	
	
	//NOVO
	public Contrato(byte[] scanContratoInicial, String tipoContrato, float valorAcordado, int qtdAtividadesAcordadas, Aluno aluno, Plano plano) {
		super();
		this.scanContratoInicial = scanContratoInicial;
		this.tipoContrato = tipoContrato;
		this.status = false;
		this.valorAcordado = valorAcordado;
		this.qtdAtividadesAcordadas = qtdAtividadesAcordadas;
		this.aluno = aluno;
		this.plano = plano;
	}

	//LER
	public Contrato(int codContrato, Date dtInicial, Date dtFinal, byte[] scanContratoInicial, byte[] scanRecisao,
			String tipoContrato, boolean status, float valorAcordado, int qtdAtividadesAcordadas, Aluno aluno,
			Plano plano) {
		super();
		this.codContrato = codContrato;
		this.dtInicial = dtInicial;
		this.dtFinal = dtFinal;
		this.scanContratoInicial = scanContratoInicial;
		this.scanRecisao = scanRecisao;
		this.tipoContrato = tipoContrato;
		this.status = status;
		this.valorAcordado = valorAcordado;
		this.qtdAtividadesAcordadas = qtdAtividadesAcordadas;
		this.aluno = aluno;
		this.plano = plano;
	}

	public int getCodContrato() {
		return codContrato;
	}

	public void setCodContrato(int codContrato) {
		this.codContrato = codContrato;
	}

	public Date getDtInicial() {
		return dtInicial;
	}

	public void setDtInicial(Date dtInicial) {
		this.dtInicial = dtInicial;
	}

	public Date getDtFinal() {
		return dtFinal;
	}

	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}

	public byte[] getScanContratoInicial() {
		return scanContratoInicial;
	}

	public void setScanContratoInicial(byte[] scanContratoInicial) {
		this.scanContratoInicial = scanContratoInicial;
	}

	public byte[] getScanRecisao() {
		return scanRecisao;
	}

	public void setScanRecisao(byte[] scanRecisao) {
		this.scanRecisao = scanRecisao;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getValorAcordado() {
		return valorAcordado;
	}

	public void setValorAcordado(float valorAcordado) {
		this.valorAcordado = valorAcordado;
	}

	public int getQtdAtividadesAcordadas() {
		return qtdAtividadesAcordadas;
	}

	public void setQtdAtividadesAcordadas(int qtdAtividadesAcordadas) {
		this.qtdAtividadesAcordadas = qtdAtividadesAcordadas;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
	
}
