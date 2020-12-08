package com.unit.academia.entidades;

import java.sql.Date;

public class Instrutor {
	private int codInstrutor;
	private String rg;
	private String nome;
	private Date dtNascimento;
	private String titulacao;
	private float salario;
	
	//novo
	public Instrutor(String rg, String nome, Date dtNascimento, String titulacao, float salario) {
		super();
		this.rg = rg;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.titulacao = titulacao;
		this.salario = salario;
	}
	
	//ler
	public Instrutor(int codInstrutor, String rg, String nome, Date dtNascimento, String titulacao, float salario) {
		super();
		this.codInstrutor = codInstrutor;
		this.rg = rg;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.titulacao = titulacao;
		this.salario = salario;
	}

	public int getCodInstrutor() {
		return codInstrutor;
	}

	public void setCodInstrutor(int codInstrutor) {
		this.codInstrutor = codInstrutor;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
