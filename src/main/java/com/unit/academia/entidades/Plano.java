package com.unit.academia.entidades;

import java.util.List;

import com.unit.academia.repositorios.PlanoRepositorio;

public class Plano {
	private int codPlano;
	private String tipo;
	private float valor;
	private int qtdAtividadesDisponiveis;
	
	
	public Plano() {
		
	}
	
	//PARA INSERIR NOVOS PLANOS
	public Plano(String tipo, float valor, int qtdAtividadesDisponiveis) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.qtdAtividadesDisponiveis = qtdAtividadesDisponiveis;
	}
	//PARA LER E ATUALIZAR PLANOS DO BANCO
	public Plano(int codPlano, String tipo, float valor, int qtdAtividadesDisponiveis) {
		super();
		this.codPlano = codPlano;
		this.tipo = tipo;
		this.valor = valor;
		this.qtdAtividadesDisponiveis = qtdAtividadesDisponiveis;
	}
	public int getCodPlano() {
		return codPlano;
	}
	public void setCodPlano(int codPlano) {
		this.codPlano = codPlano;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getQtdAtividadesDisponiveis() {
		return qtdAtividadesDisponiveis;
	}
	public void setQtdAtividadesDisponiveis(int qtdAtividadesDisponiveis) {
		this.qtdAtividadesDisponiveis = qtdAtividadesDisponiveis;
	}
	
	public void criar(Plano plano) {
		PlanoRepositorio.create(plano);
	}
	
	public void alterar(Plano plano) {
		PlanoRepositorio.update(plano);
	}
	
	public Plano listarPorId(int id) {

		return (PlanoRepositorio.findById(id));
	}
	
	public List<Plano> listarTodos(){
		
		return PlanoRepositorio.findAll();
	}
	
	public void excluir(Plano plano) {
		
		PlanoRepositorio.delete(plano);
	}
	
}
