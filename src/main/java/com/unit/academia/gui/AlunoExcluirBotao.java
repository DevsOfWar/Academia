package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Aluno;
import com.unit.academia.repositorios.AlunoRepositorio;

public class AlunoExcluirBotao implements ActionListener {

	private JTextField id;

	public AlunoExcluirBotao(JTextField id) {
		super();
		this.id = id;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int id;

		id = Integer.parseInt(this.id.getText());

		Aluno aluno = AlunoRepositorio.findById(id);

		AlunoRepositorio.delete(aluno);

		JOptionPane.showInternalMessageDialog(null, "Deletado com sucesso!");
	}

}
