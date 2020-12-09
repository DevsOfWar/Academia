package com.unit.academia.entidades;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import com.unit.academia.repositorios.TurmaRepositorio;

public class Turma {
	private int codTurma;
	private Date dtInicio;
	private Date dtFim;
	private Time horario;
	private int qtdMaxAlunos;
	
	private Instrutor instrutor;
	private Atividade atividade;
	private Aluno alunoMonitor;
	
	public Turma() {
		
	}
	
	//INSERIR NOVA TURMA
	public Turma(Date dtInicio, Date dtFim, Time horario, int qtdMaxAlunos, Instrutor instrutor, Atividade atividade,
			Aluno alunoMonitor) {
		super();
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.horario = horario;
		this.qtdMaxAlunos = qtdMaxAlunos;
		this.instrutor = instrutor;
		this.atividade = atividade;
		this.alunoMonitor = alunoMonitor;
	}

	//LER TURMAS
	public Turma(int codTurma, Date dtInicio, Date dtFim, Time horario, int qtdMaxAlunos) {
		super();
		this.codTurma = codTurma;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.horario = horario;
		this.qtdMaxAlunos = qtdMaxAlunos;
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
	
	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
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
	
	public void criar(Turma turma) {
		TurmaRepositorio.create(turma);
	}
	
	public void alterar(Turma turma) {
		TurmaRepositorio.update(turma);
	}
	
	public Turma listarPorId(int id) {
		return TurmaRepositorio.findById(id);
	}
	
	public List<Turma> listarTodos(){
		return TurmaRepositorio.findAll();
	}
	
	public void excluir (Turma turma) {
		TurmaRepositorio.delete(turma);
	}
}
