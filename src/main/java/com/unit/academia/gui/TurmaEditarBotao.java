package com.unit.academia.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Time;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.unit.academia.entidades.Aluno;
import com.unit.academia.entidades.Atividade;
import com.unit.academia.entidades.Instrutor;
import com.unit.academia.entidades.Turma;
import com.unit.academia.repositorios.AlunoRepositorio;
import com.unit.academia.repositorios.AtividadeRepositorio;
import com.unit.academia.repositorios.InstrutorRepositorio;
import com.unit.academia.repositorios.TurmaRepositorio;

public class TurmaEditarBotao implements ActionListener{

	private JTextField idTurma;
	private JTextField idInstrutor;
	private JTextField idAtividade;
	private JTextField idMonitor;
	private JTextField dataInicio;
	private JTextField horario;
	private JTextField qtdAluno;
	
	public TurmaEditarBotao(JTextField idTurma, JTextField idInstrutor, JTextField idAtividade, JTextField idMonitor, JTextField dataInicio,
			JTextField horario, JTextField qtdAluno) {
		super();
		this.idTurma = idTurma;
		this.idInstrutor = idInstrutor;
		this.idAtividade = idAtividade;
		this.idMonitor = idMonitor;
		this.dataInicio = dataInicio;
		this.horario = horario;
		this.qtdAluno = qtdAluno;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int idInstrutorTurma;
		int idAtividadeTurma;
		int idMonitorTurma;
		Date dataIncioTurma;
		Time horarioTurma;
		int qtdAlunoTurma;
		
		idInstrutorTurma = Integer.parseInt(this.idInstrutor.getText());
		idAtividadeTurma = Integer.parseInt(this.idAtividade.getText());
		idMonitorTurma = Integer.parseInt(this.idMonitor.getText());
		dataIncioTurma = Date.valueOf(this.dataInicio.getText());
		horarioTurma = Time.valueOf(this.horario.getText());
		qtdAlunoTurma = Integer.parseInt(this.qtdAluno.getText());
		
		Aluno aluno = AlunoRepositorio.findById(idMonitorTurma);
		Instrutor instrutor = InstrutorRepositorio.findById(idInstrutorTurma);
		Atividade atividade = AtividadeRepositorio.findById(idAtividadeTurma);
		
		Turma turma = TurmaRepositorio.findById(Integer.parseInt(this.idTurma.getText()));
		
		turma.setInstrutor(instrutor);
		turma.setAlunoMonitor(aluno);
		turma.setAtividade(atividade);
		turma.setDtInicio(dataIncioTurma);
		turma.setHorario(horarioTurma);
		turma.setQtdMaxAlunos(qtdAlunoTurma);
		
		TurmaRepositorio.update(turma);
		
		JOptionPane.showInternalMessageDialog(null, "Editado com sucesso!");

	}

}
