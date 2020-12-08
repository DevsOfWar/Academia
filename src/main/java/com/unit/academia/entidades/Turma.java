package com.unit.academia.entidades;

import java.sql.Date;
import java.sql.Time;

public class Turma {
	private int codTurma;
	private Date dtInicio;
	private Time horario;
	private int qtdMaxAlunos;
	
	private Instrutor instrutor;
	private Atividade atividade;
	private Aluno alunoMonitor;
	
	//INSERIR NOVA TURMA
	public Turma(Date dtInicio, Time horario, int qtdMaxAlunos, Instrutor instrutor, Atividade atividade,
			Aluno alunoMonitor) {
		super();
		this.dtInicio = dtInicio;
		this.horario = horario;
		this.qtdMaxAlunos = qtdMaxAlunos;
		this.instrutor = instrutor;
		this.atividade = atividade;
		this.alunoMonitor = alunoMonitor;
	}

	//LER TURMAS
	public Turma(int codTurma, Date dtInicio, Time horario, int qtdMaxAlunos, Instrutor instrutor, Atividade atividade,
			Aluno alunoMonitor) {
		super();
		this.codTurma = codTurma;
		this.dtInicio = dtInicio;
		this.horario = horario;
		this.qtdMaxAlunos = qtdMaxAlunos;
		this.instrutor = instrutor;
		this.atividade = atividade;
		this.alunoMonitor = alunoMonitor;
	}

	public int getCodTurma() {
		return codTurma;
	}

	public void setCodTurma(int codTurma) {
		this.codTurma = codTurma;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public int getQtdMaxAlunos() {
		return qtdMaxAlunos;
	}

	public void setQtdMaxAlunos(int qtdMaxAlunos) {
		this.qtdMaxAlunos = qtdMaxAlunos;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Aluno getAlunoMonitor() {
		return alunoMonitor;
	}

	public void setAlunoMonitor(Aluno alunoMonitor) {
		this.alunoMonitor = alunoMonitor;
	}
	
	
}
