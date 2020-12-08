package com.unit.academia.entidades;

public class Atividade {
	private int codAtividade;
	private String nome;
	private String descricao;
	private float custoHora;
	
	
	
	//PARA INSERIR NOVAS ATIVIDADES
	public Atividade(String nome, String descricao, float custoHora) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.custoHora = custoHora;
	}

	//PARA LER E ATUALIZAR ATIVIDADES
	public Atividade(int codAtividade, String nome, String descricao, float custoHora) {
		super();
		this.codAtividade = codAtividade;
		this.nome = nome;
		this.descricao = descricao;
		this.custoHora = custoHora;
	}
	
	public int getCodAtividade() {
		return codAtividade;
	}
	public void setCodAtividade(int codAtividade) {
		this.codAtividade = codAtividade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getCustoHora() {
		return custoHora;
	}
	public void setCustoHora(float custoHora) {
		this.custoHora = custoHora;
	}
	
	
	
}
