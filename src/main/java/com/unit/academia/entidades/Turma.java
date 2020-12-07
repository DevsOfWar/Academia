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
}
