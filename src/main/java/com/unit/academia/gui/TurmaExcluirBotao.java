package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Aluno;
import com.unit.academia.entidades.Turma;
import com.unit.academia.repositorios.AlunoRepositorio;
import com.unit.academia.repositorios.TurmaRepositorio;

public class TurmaExcluirBotao implements ActionListener{
	
	private JTextField id;
	
	public TurmaExcluirBotao(JTextField id) {
		super();
		this.id = id;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int id;
		

		id = Integer.parseInt(this.id.getText());

		Turma turma = TurmaRepositorio.findById(id);
		
		JOptionPane.showInternalMessageDialog(null, "Deletado com sucesso!");
	}

}
