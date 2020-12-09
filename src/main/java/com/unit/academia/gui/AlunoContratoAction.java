package com.unit.academia.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlunoContratoAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame f = new JFrame();
		f.setTitle("Adicionar aluno");
		f.setSize(200, 400);
		f.setLocation(500, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());

		JPanel p = new JPanel();

		JLabel l1 = new JLabel("Informe ID aluno");
		p.add(l1);
		JTextField t1 = new JTextField(10);
		p.add(t1);

		JLabel l2 = new JLabel("Informe ID plano");
		p.add(l2);
		JTextField t2 = new JTextField(10);
		p.add(t2);

		JLabel l4 = new JLabel("Tipo de contrato");
		p.add(l4);
		JTextField t4 = new JTextField(10);
		p.add(t4);

		JLabel l5 = new JLabel("Valor acordado");
		p.add(l5);
		JTextField t5 = new JTextField(10);
		p.add(t5);

		JLabel l6 = new JLabel("Qtd. atividades acordadas");
		p.add(l6);
		JTextField t6 = new JTextField(10);
		p.add(t6);

		JButton inserir = new JButton("Inserir");
		AlunoContratoBotao acaoBotao = new AlunoContratoBotao(t1, t2, t4, t5, t6);
		inserir.addActionListener(acaoBotao);
		p.add(inserir);

		f.add(p);
		f.setVisible(true);
	}

}
