package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Plano;
import com.unit.academia.repositorios.PlanoRepositorio;

public class PlanoAdicionarBotao implements ActionListener{
	
	private JTextField tipo;
	private JTextField valor;
	private JTextField qtdAtividade;
	
	public PlanoAdicionarBotao(JTextField tipo, JTextField valor, JTextField qtdAtividade) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.qtdAtividade = qtdAtividade;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String tipoPlano;
		float valorPlano;
		int qtdAtividadePlano;
		
		tipoPlano = this.tipo.getText();
		valorPlano = Float.parseFloat(this.valor.getText());
		qtdAtividadePlano = Integer.parseInt(this.qtdAtividade.getText());
		
		Plano plano = new Plano(tipoPlano, valorPlano, qtdAtividadePlano);
		
		PlanoRepositorio.create(plano);
		
		JOptionPane.showInternalMessageDialog(null, "Inserido com sucesso!");
		
	}

}
