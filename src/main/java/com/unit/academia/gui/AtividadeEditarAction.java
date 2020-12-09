package com.unit.academia.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AtividadeEditarAction extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame f = new JFrame();
		f.setTitle("Editar Atividade");
		f.setSize(280, 200);
		f.setLocation(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());

		JPanel p = new JPanel();

		JLabel l1 = new JLabel("Informe o ID");
		p.add(l1);
		JTextField t1 = new JTextField(10);
		p.add(t1);

		JLabel l2 = new JLabel("Edite o nome");
		p.add(l2);
		JTextField t2 = new JTextField(10);
		p.add(t2);

		JLabel l3 = new JLabel("Edite a descrição");
		p.add(l3);
		JTextField t3 = new JTextField(10);
		p.add(t3);

		JLabel l4 = new JLabel("Edite o valor/hora");
		p.add(l4);
		JTextField t4 = new JTextField(10);
		p.add(t4);

		JButton alterar = new JButton("Alterar");
		AtividadeEditarBotao acaoBotao = new AtividadeEditarBotao(t1, t2, t3, t4);
		alterar.addActionListener(acaoBotao);
		p.add(alterar);

		f.add(p);
		f.setVisible(true);
	}

}
