package com.unit.academia.entidades;

import java.sql.Date;
import java.util.List;

public class Aluno {
	private int codAluno;
	private String nome;
	private String telefone;
	private Date dtNascimento;
	private String logradouro;
	private int numeroLogradouro;
	private String bairro;
	private String cidade;
	private String cep;
	private Date dtMatricula;
	private float altura;
	private float peso;
	private String senha;
	
	private List<Turma> turmasQueParticipa;
}
