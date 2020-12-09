package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Atividade;
import com.unit.academia.repositorios.AtividadeRepositorio;

public class AtividadeEditarBotao implements ActionListener {

	private JTextField id;
	private JTextField nome;
	private JTextField descricao;
	private JTextField custoHora;

	public AtividadeEditarBotao(JTextField id, JTextField nome, JTextField descricao, JTextField custoHora) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.custoHora = custoHora;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nomeAt;
		String descricaoAt;
		float valorAt;
		
		nomeAt = this.nome.getText();	
		descricaoAt = this.descricao.getText();
		valorAt = Float.parseFloat(this.custoHora.getText());
		
		Atividade atividade = AtividadeRepositorio.findById(Integer.parseInt(this.id.getText()));
		atividade.setNome(nomeAt);
		atividade.setDescricao(descricaoAt);
		atividade.setCustoHora(valorAt);
		
		AtividadeRepositorio.update(atividade);
		
		JOptionPane.showInternalMessageDialog(null, "Editado com sucesso!");

	}

}
