package com.unit.academia.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlunoConsultarAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame f = new JFrame();
		f.setTitle("Consultar aluno");
		f.setSize(280, 200);
		f.setLocation(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());
		
		JPanel p = new JPanel();
		
		JLabel l1 = new JLabel("Informe o ID");
		p.add(l1);
		
		JTextField t1 = new JTextField(10);
		p.add(t1);
		
		JButton consultar = new JButton("Consultar");
		AlunoConsultarBotao acaoBotao = new AlunoConsultarBotao(t1);
		consultar.addActionListener(acaoBotao);
		p.add(consultar);
		
		f.add(p);
		f.setVisible(true);	
	}

}
