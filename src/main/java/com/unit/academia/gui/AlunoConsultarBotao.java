package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Aluno;
import com.unit.academia.entidades.Atividade;
import com.unit.academia.repositorios.AlunoRepositorio;
import com.unit.academia.repositorios.AtividadeRepositorio;

public class AlunoConsultarBotao implements ActionListener{
	
	private JTextField id;
	
	public AlunoConsultarBotao(JTextField id) {
		super();
		this.id = id;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int id;

		id = Integer.parseInt(this.id.getText());

		Aluno aluno = AlunoRepositorio.findById(id);

		JOptionPane.showInternalMessageDialog(null, "Nome: " + aluno.getNome() + "\nData Matrícula: " + aluno.getDtMatricula()
		+ "\nPeso: " + aluno.getPeso() + "\nAltura: " + aluno.getAltura() + "\nTelefone: " + aluno.getTelefone());
	}

}
