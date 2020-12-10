package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Plano;
import com.unit.academia.entidades.Turma;
import com.unit.academia.repositorios.PlanoRepositorio;
import com.unit.academia.repositorios.TurmaRepositorio;

public class TurmaConsultaBotao implements ActionListener {

	private JTextField id;

	public TurmaConsultaBotao(JTextField id) {
		super();
		this.id = id;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int codPlano;

		codPlano = Integer.parseInt(this.id.getText());

		Turma turma = TurmaRepositorio.findById(Integer.parseInt(this.id.getText()));

		JOptionPane.showInternalMessageDialog(null,
				"Atividade: " + turma.getAtividade().getNome() + "\nHorário: " + turma.getHorario() + "\nInstrutor: "
						+ turma.getInstrutor().getNome() + "\nAluno monitor: " + turma.getAlunoMonitor().getNome());
	}

}
