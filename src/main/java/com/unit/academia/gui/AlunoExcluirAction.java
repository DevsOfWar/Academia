package com.unit.academia.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlunoExcluirAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame f = new JFrame();
		f.setTitle("Excluir aluno");
		f.setSize(300, 200);
		f.setLocation(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());

		JPanel p = new JPanel();

		JLabel l1 = new JLabel("Informe o ID");
		p.add(l1);

		JTextField t1 = new JTextField(10);
		p.add(t1);

		JButton deletar = new JButton("Deletar");
		AlunoExcluirBotao acaoBotao = new AlunoExcluirBotao(t1);
		deletar.addActionListener(acaoBotao);
		p.add(deletar);

		f.add(p);
		f.setVisible(true);
	}

}
