package com.unit.academia;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;

import com.unit.academia.entidades.*;
import com.unit.academia.repositorios.*;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		/*
		ResultSet rs = null;
		String query = "";
		query = "select * from uVW_DADOS_CONTRATOS_ALUNOS where [Nº do Contrato] = 1";
		rs = DatabaseConnection.stmt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}*/
		
		
		Aluno aluno = AlunoRepositorio.findById(3);
		System.out.println("TESTE");
		aluno.setTurmasQueParticipa( TurmaRepositorio.findAllByAluno(aluno.getCodAluno()) );
		
		for (Turma t : aluno.getTurmasQueParticipa()) {
			System.out.println(t.getCodTurma());
		}
		
		
		
		DatabaseConnection.conn.close();
	}

}
