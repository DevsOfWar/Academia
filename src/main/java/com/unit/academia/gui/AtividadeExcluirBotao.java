package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Atividade;
import com.unit.academia.repositorios.AtividadeRepositorio;

public class AtividadeExcluirBotao implements ActionListener {

	private JTextField id;

	public AtividadeExcluirBotao(JTextField id) {
		super();
		this.id = id;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int id;

		id = Integer.parseInt(this.id.getText());

		Atividade atividade = AtividadeRepositorio.findById(id);

		AtividadeRepositorio.delete(atividade);

		JOptionPane.showInternalMessageDialog(null, "Deletado com sucesso!");
	}

}
