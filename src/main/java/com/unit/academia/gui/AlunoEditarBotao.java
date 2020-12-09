package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Aluno;
import com.unit.academia.repositorios.AlunoRepositorio;

public class AlunoEditarBotao implements ActionListener{

	private JTextField id;
	private JTextField nome;
	private JTextField telefone;
	private JTextField dtNascimento;
	private JTextField logradouro;
	private JTextField numeroLogradouro;
	private JTextField bairro;
	private JTextField cidade;
	private JTextField cep;
	private JTextField dtMatricula;
	private JTextField altura;
	private JTextField peso;
	private JTextField senha;

	public AlunoEditarBotao(JTextField id, JTextField nome, JTextField telefone, JTextField dtNascimento,
			JTextField logradouro, JTextField numeroLogradouro, JTextField bairro, JTextField cidade, JTextField cep,
			JTextField dtMatricula, JTextField altura, JTextField peso, JTextField senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.logradouro = logradouro;
		this.numeroLogradouro = numeroLogradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.dtMatricula = dtMatricula;
		this.altura = altura;
		this.peso = peso;
		this.senha = senha;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nomeAluno;
		String telefoneAluno;
		Date dtNascimentoAluno;
		String logradouroAluno;
		int numeroLogradouroAluno;
		String bairroAluno;
		String cidadeAluno;
		String cepAluno;
		Date dtMatriculaAluno;
		float alturaAluno;
		float pesoAluno;
		String senhaAluno;

		nomeAluno = this.nome.getText();
		telefoneAluno = this.telefone.getText();
		dtNascimentoAluno = Date.valueOf(this.dtNascimento.getText());
		logradouroAluno = this.logradouro.getText();
		numeroLogradouroAluno = Integer.parseInt(this.numeroLogradouro.getText());
		bairroAluno = this.bairro.getText();
		cidadeAluno = this.cidade.getText();
		cepAluno = this.cep.getText();
		dtMatriculaAluno = Date.valueOf(this.dtMatricula.getText());
		alturaAluno = Float.parseFloat(this.altura.getText().replace(",", "."));
		pesoAluno = Float.parseFloat(this.peso.getText().replace(",", "."));
		senhaAluno = this.senha.getText();
		
		Aluno aluno = AlunoRepositorio.findById(Integer.parseInt(this.id.getText()));
		aluno.setNome(nomeAluno);
		aluno.setTelefone(telefoneAluno);
		aluno.setDtNascimento(dtNascimentoAluno);
		aluno.setLogradouro(logradouroAluno);
		aluno.setNumeroLogradouro(numeroLogradouroAluno);
		aluno.setBairro(bairroAluno);
		aluno.setCidade(cidadeAluno);
		aluno.setCep(cepAluno);
		aluno.setDtMatricula(dtMatriculaAluno);
		aluno.setAltura(alturaAluno);
		aluno.setPeso(pesoAluno);
		aluno.setSenha(senhaAluno);
		
		AlunoRepositorio.update(aluno);
		JOptionPane.showInternalMessageDialog(null, "Editado com sucesso!");
		
	}

}
