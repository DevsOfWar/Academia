package com.unit.academia.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AtividadeAdicionarAction extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame f = new JFrame();
		f.setTitle("Adicionar atividade");
		f.setSize(300, 200);
		f.setLocation(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());

		JPanel p = new JPanel();

		JLabel l1 = new JLabel("Informe o nome");
		p.add(l1);

		JTextField t1 = new JTextField(10);
		p.add(t1);

		JLabel l2 = new JLabel("Informe a descrição");
		p.add(l2);

		JTextField t2 = new JTextField(10);
		p.add(t2);

		JLabel l3 = new JLabel("Custo por hora");
		p.add(l3);

		JTextField t3 = new JTextField(10);
		p.add(t3);

		JButton inserir = new JButton("Inserir");
		AtividadeAdicionarBotao acaoBotao = new AtividadeAdicionarBotao(t1, t2, t3);
		inserir.addActionListener(acaoBotao);
		p.add(inserir);

		f.add(p);
		f.setVisible(true);

	}

}
