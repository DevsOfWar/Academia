package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Atividade;
import com.unit.academia.entidades.Plano;
import com.unit.academia.repositorios.AtividadeRepositorio;
import com.unit.academia.repositorios.PlanoRepositorio;

public class AtividadeConsultarBotao implements ActionListener {

	private JTextField id;

	public AtividadeConsultarBotao(JTextField id) {
		super();
		this.id = id;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int id;

		id = Integer.parseInt(this.id.getText());

		Atividade atividade = AtividadeRepositorio.findById(id);

		JOptionPane.showInternalMessageDialog(null, "ID: " + atividade.getCodAtividade() + "\nNome: " + atividade.getNome()
				+ "\nValor/hora: " + atividade.getCustoHora() + "\nDescrição: " + atividade.getDescricao());
	}

}
