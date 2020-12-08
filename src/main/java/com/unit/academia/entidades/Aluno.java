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

	public Aluno() {
		super();
	}
	
	
	//PARA NOVOS ALUNOS
	public Aluno(String nome, String telefone, Date dtNascimento, String logradouro, int numeroLogradouro,
			String bairro, String cidade, String cep, Date dtMatricula, float altura, float peso, String senha) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.logradouro = logradouro;
		this.numeroLogradouro = numeroLogradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.dtMatricula = dtMatricula;
		this.altura = altura;
		this.peso = peso;
		this.senha = senha;
	}



	//PARA LER E ATUALIZAR ALUNOS
	public Aluno(int codAluno, String nome, String telefone, Date dtNascimento, String logradouro, int numeroLogradouro,
			String bairro, String cidade, String cep, Date dtMatricula, float altura, float peso, String senha) {
		super();
		this.codAluno = codAluno;
		this.nome = nome;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.logradouro = logradouro;
		this.numeroLogradouro = numeroLogradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.dtMatricula = dtMatricula;
		this.altura = altura;
		this.peso = peso;
		this.senha = senha;
	}

	public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(int numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getDtMatricula() {
		return dtMatricula;
	}

	public void setDtMatricula(Date dtMatricula) {
		this.dtMatricula = dtMatricula;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Turma> getTurmasQueParticipa() {
		return turmasQueParticipa;
	}

	public void setTurmasQueParticipa(List<Turma> turmasQueParticipa) {
		this.turmasQueParticipa = turmasQueParticipa;
	}
	
	
}
