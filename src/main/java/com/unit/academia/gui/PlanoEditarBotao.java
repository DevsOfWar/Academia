package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Plano;
import com.unit.academia.repositorios.PlanoRepositorio;

public class PlanoEditarBotao implements ActionListener{
	
	private JTextField id;
	private JTextField tipo;
	private JTextField valor;
	private JTextField qtdAtividade;
	
	public PlanoEditarBotao(JTextField id, JTextField tipo, JTextField valor, JTextField qtdAtividade) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.valor = valor;
		this.qtdAtividade = qtdAtividade;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String tipoPlano;
		float valorPlano;
		int qtdAlunosPlano;
		int codPlano;
		
		tipoPlano = this.tipo.getText();
		valorPlano = Float.parseFloat(this.valor.getText());
		qtdAlunosPlano = Integer.parseInt(this.qtdAtividade.getText());
		codPlano = Integer.parseInt(this.id.getText());
		
		
		Plano plano = PlanoRepositorio.findById(Integer.parseInt(this.id.getText()));
		plano.setTipo(tipoPlano);
		plano.setValor(valorPlano);
		plano.setQtdAtividadesDisponiveis(qtdAlunosPlano);
		
		PlanoRepositorio.update(plano);
		
		JOptionPane.showInternalMessageDialog(null, "Editado com sucesso!");
	}

}