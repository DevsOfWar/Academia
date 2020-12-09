package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Plano;
import com.unit.academia.repositorios.PlanoRepositorio;

public class PlanoConsultarBotao implements ActionListener{
	
	private JTextField id;
	
	public PlanoConsultarBotao(JTextField id) {
		super();
		this.id = id;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int codPlano;
		
		codPlano = Integer.parseInt(this.id.getText());
		
		Plano plano = PlanoRepositorio.findById(Integer.parseInt(this.id.getText()));

		JOptionPane.showInternalMessageDialog(null, "ID: " + plano.getCodPlano() +
		"\nTipo: " + plano.getTipo() + "\nValor: " + plano.getValor() + "\nQtd. atividades: "
		+ plano.getQtdAtividadesDisponiveis());
		

	}

}
