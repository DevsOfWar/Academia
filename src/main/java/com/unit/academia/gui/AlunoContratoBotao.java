package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Aluno;
import com.unit.academia.entidades.Contrato;
import com.unit.academia.entidades.Plano;
import com.unit.academia.repositorios.AlunoRepositorio;
import com.unit.academia.repositorios.ContratoRepositorio;
import com.unit.academia.repositorios.PlanoRepositorio;

public class AlunoContratoBotao implements ActionListener {

	private JTextField idAluno;
	private JTextField idPlano;
	private JTextField tipoContrato;
	private JTextField valorAcordado;
	private JTextField qtdAtividadesAcordadas;

	public AlunoContratoBotao(JTextField idAluno, JTextField idPlano, JTextField tipoContrato,
			JTextField valorAcordado, JTextField qtdAtividadesAcordadas) {
		super();
		this.idAluno = idAluno;
		this.idPlano = idPlano;
		this.tipoContrato = tipoContrato;
		this.valorAcordado = valorAcordado;
		this.qtdAtividadesAcordadas = qtdAtividadesAcordadas;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int idAlunoC;
		int idPlanoC;
		String tipoContratoC;
		float valorAcordadoC;
		int qtdAtivC;
		
		idAlunoC = Integer.parseInt(this.idAluno.getText());
		idPlanoC = Integer.parseInt(this.idPlano.getText());
		tipoContratoC = this.tipoContrato.getText();
		valorAcordadoC = Float.parseFloat(this.valorAcordado.getText());
		qtdAtivC = Integer.parseInt(this.qtdAtividadesAcordadas.getText());
		
		Aluno aluno = AlunoRepositorio.findById(idAlunoC);
		Plano plano = PlanoRepositorio.findById(idPlanoC);
		
		Contrato contrato = new Contrato(null, tipoContratoC, valorAcordadoC, qtdAtivC, aluno, plano);
		
		ContratoRepositorio.create(contrato);
		
		JOptionPane.showInternalMessageDialog(null, "Registro de contrato efetuado!");
	}

}
