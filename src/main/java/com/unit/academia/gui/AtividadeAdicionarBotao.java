package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Atividade;
import com.unit.academia.entidades.Plano;
import com.unit.academia.repositorios.AtividadeRepositorio;
import com.unit.academia.repositorios.PlanoRepositorio;

public class AtividadeAdicionarBotao implements ActionListener {

	private JTextField nome;
	private JTextField descricao;
	private JTextField custoHora;

	public AtividadeAdicionarBotao(JTextField nome, JTextField descricao, JTextField custoHora) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.custoHora = custoHora;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nomeAt;
		float valorAt;
		String descricaoAt;
		
		nomeAt = this.nome.getText();
		valorAt = Float.parseFloat(this.custoHora.getText());
		descricaoAt = this.descricao.getText();
		
		Atividade atividade = new Atividade(nomeAt, descricaoAt, valorAt);
		
		AtividadeRepositorio.create(atividade);
		
		JOptionPane.showInternalMessageDialog(null, "Inserido com sucesso!");
	}

}
