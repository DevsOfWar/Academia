package com.unit.academia.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlunoAdicionarAction extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame f = new JFrame();
		f.setTitle("Adicionar aluno");
		f.setSize(100, 650);
		f.setLocation(500, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());

		JPanel p = new JPanel();

		JLabel l1 = new JLabel("Informe o nome");
		p.add(l1);
		JTextField t1 = new JTextField(10);
		p.add(t1);

		JLabel l2 = new JLabel("Informe telefone");
		p.add(l2);
		JTextField t2 = new JTextField(10);
		p.add(t2);

		JLabel l3 = new JLabel("Data Nascimento");
		p.add(l3);
		JTextField t3 = new JTextField(10);
		p.add(t3);

		JLabel l4 = new JLabel("Logradouro");
		p.add(l4);
		JTextField t4 = new JTextField(10);
		p.add(t4);

		JLabel l5 = new JLabel("Nº logradouro");
		p.add(l5);
		JTextField t5 = new JTextField(10);
		p.add(t5);

		JLabel l6 = new JLabel("Bairro");
		p.add(l6);
		JTextField t6 = new JTextField(10);
		p.add(t6);

		JLabel l7 = new JLabel("Cidade");
		p.add(l7);
		JTextField t7 = new JTextField(10);
		p.add(t7);

		JLabel l8 = new JLabel("CEP");
		p.add(l8);
		JTextField t8 = new JTextField(10);
		p.add(t8);

		JLabel l9 = new JLabel("Data matrícula");
		p.add(l9);
		JTextField t9 = new JTextField(10);
		p.add(t9);

		JLabel l10 = new JLabel("Altura");
		p.add(l10);
		JTextField t10 = new JTextField(10);
		p.add(t10);

		JLabel l11 = new JLabel("Peso");
		p.add(l11);
		JTextField t11 = new JTextField(10);
		p.add(t11);

		JLabel l12 = new JLabel("Senha");
		p.add(l12);
		JTextField t12 = new JTextField(10);
		p.add(t12);

		JButton inserir = new JButton("Inserir");
		AlunoAdicionarBotao acaoBotao = new AlunoAdicionarBotao(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
		inserir.addActionListener(acaoBotao);
		p.add(inserir);

		f.add(p);
		f.setVisible(true);
	}

}
