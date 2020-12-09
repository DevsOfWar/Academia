package com.unit.academia.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlunoEditarAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame f = new JFrame();
		f.setTitle("Editar aluno");
		f.setSize(100, 650);
		f.setLocation(500, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());

		JPanel p = new JPanel();
		
		JLabel l13 = new JLabel("Informe ID");
		p.add(l13);
		JTextField t13 = new JTextField(10);
		p.add(t13);

		JLabel l1 = new JLabel("Editar o nome");
		p.add(l1);
		JTextField t1 = new JTextField(10);
		p.add(t1);

		JLabel l2 = new JLabel("Editar telefone");
		p.add(l2);
		JTextField t2 = new JTextField(10);
		p.add(t2);

		JLabel l3 = new JLabel("Editar Data Nascimento");
		p.add(l3);
		JTextField t3 = new JTextField(10);
		p.add(t3);

		JLabel l4 = new JLabel("Editar Logradouro");
		p.add(l4);
		JTextField t4 = new JTextField(10);
		p.add(t4);

		JLabel l5 = new JLabel("Editar Nº logradouro");
		p.add(l5);
		JTextField t5 = new JTextField(10);
		p.add(t5);

		JLabel l6 = new JLabel("Editar Bairro");
		p.add(l6);
		JTextField t6 = new JTextField(10);
		p.add(t6);

		JLabel l7 = new JLabel("Editar Cidade");
		p.add(l7);
		JTextField t7 = new JTextField(10);
		p.add(t7);

		JLabel l8 = new JLabel("Editar CEP");
		p.add(l8);
		JTextField t8 = new JTextField(10);
		p.add(t8);

		JLabel l9 = new JLabel("Editar Data matrícula");
		p.add(l9);
		JTextField t9 = new JTextField(10);
		p.add(t9);

		JLabel l10 = new JLabel("Editar Altura");
		p.add(l10);
		JTextField t10 = new JTextField(10);
		p.add(t10);

		JLabel l11 = new JLabel("Editar Peso");
		p.add(l11);
		JTextField t11 = new JTextField(10);
		p.add(t11);

		JLabel l12 = new JLabel("Editar Senha");
		p.add(l12);
		JTextField t12 = new JTextField(10);
		p.add(t12);

		JButton editar = new JButton("Editar");
		AlunoEditarBotao acaoBotao = new AlunoEditarBotao(t13, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
		editar.addActionListener(acaoBotao);
		p.add(editar);

		f.add(p);
		f.setVisible(true);
	}

}
