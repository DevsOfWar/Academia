package com.unit.academia.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TurmaAdicionarActio extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame f = new JFrame();
		f.setTitle("Adicionar turma");
		f.setSize(100, 500);
		f.setLocation(500, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());

		JPanel p = new JPanel();

		JLabel l1 = new JLabel("ID instrutpr");
		p.add(l1);
		JTextField t1 = new JTextField(10);
		p.add(t1);

		JLabel l2 = new JLabel("ID atividade");
		p.add(l2);
		JTextField t2 = new JTextField(10);
		p.add(t2);

		JLabel l3 = new JLabel("ID monitor");
		p.add(l3);
		JTextField t3 = new JTextField(10);
		p.add(t3);

		JLabel l4 = new JLabel("Data inicio");
		p.add(l4);
		JTextField t4 = new JTextField(10);
		p.add(t4);

		JLabel l5 = new JLabel("Horário da aula");
		p.add(l5);
		JTextField t5 = new JTextField(10);
		p.add(t5);
		
		JLabel l6 = new JLabel("Qtd. alunos");
		p.add(l6);
		JTextField t6 = new JTextField(10);
		p.add(t6);

		JButton inserir = new JButton("Inserir");
		TurmaAdicionarBotao acaoBotao = new TurmaAdicionarBotao(t1, t2, t3, t4, t5, t6);
		inserir.addActionListener(acaoBotao);
		p.add(inserir);

		f.add(p);
		f.setVisible(true);
	}

}
