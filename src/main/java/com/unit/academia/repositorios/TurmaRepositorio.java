package com.unit.academia.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.unit.academia.DatabaseConnection;
import com.unit.academia.entidades.Turma;

public abstract class TurmaRepositorio {

	public static void create(Turma turma) {
		
		String query = "INSERT INTO turma(data_inicio, data_fim, horario_aula, qtd_aluno, cd_instrutor, cd_atividade, cd_matricula_monitor)\n"
				+ "VALUES ('" + turma.getDtInicio() + "', '" + turma.getDtFim() + "', '" + turma.getHorario() + "', " + turma.getQtdMaxAlunos() + ", " + (turma.getInstrutor() == null ? "NULL" : turma.getInstrutor().getCodInstrutor()) + ", " + turma.getAtividade().getCodAtividade() + ", " + (turma.getAlunoMonitor() == null ? "NULL" : turma.getAlunoMonitor().getCodAluno()) + ")";
	
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void update(Turma turma) {
		String query = "UPDATE turma\n"
				+ "SET data_inicio = '" + turma.getDtInicio() + "', data_fim = '" + turma.getDtFim() + "', horario_aula = '" + turma.getHorario() + "', qtd_aluno = " + turma.getQtdMaxAlunos() + ", cd_instrutor = " + (turma.getInstrutor() == null ? "NULL" : turma.getInstrutor().getCodInstrutor()) + ", cd_atividade = " + turma.getAtividade().getCodAtividade() + ", cd_matricula_monitor = " + (turma.getAlunoMonitor() == null ? "NULL" : turma.getAlunoMonitor().getCodAluno()) + "\n"
 				+ "WHERE cd_turma = " + turma.getCodTurma();
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static Turma findById(int id) {
		Turma turma = null;
		String query = "SELECT * FROM turma WHERE cd_turma = " + id;
		
		try {
			int codInstrutor = 0;
			int codAtividade = 0;
			int codMatriculaMonitor = 0;
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				codInstrutor = rs.getInt(6);
				codAtividade = rs.getInt(7);
				codMatriculaMonitor = rs.getInt(8);
				turma = new Turma(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getTime(4), rs.getInt(5));
			}
			turma.setInstrutor(codInstrutor == 0 ? null : InstrutorRepositorio.findById(codInstrutor));
			turma.setAtividade(AtividadeRepositorio.findById(codAtividade));
			turma.setAlunoMonitor(codMatriculaMonitor == 0 ? null : AlunoRepositorio.findById(codMatriculaMonitor));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return turma;
	}
	
	public static List<Turma> findAll(){
		List<Turma> listaDeTurmas = new ArrayList<Turma>();
		String query = "SELECT * FROM turma";
		
		try {
			List<Integer> codInstrutores = new ArrayList<Integer>();
			List<Integer> codAtividades = new ArrayList<Integer>();
			List<Integer> codMatriculaMonitor = new ArrayList<Integer>();
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				codInstrutores.add(rs.getInt(6));
				codAtividades.add(rs.getInt(7));
				codMatriculaMonitor.add(rs.getInt(8));
				listaDeTurmas.add(new Turma(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getTime(4), rs.getInt(5)));
			}
			for (int i = 0; i < listaDeTurmas.size(); i++) {
				listaDeTurmas.get(i).setInstrutor(codInstrutores.get(i) == 0 ? null : InstrutorRepositorio.findById(codInstrutores.get(i)));
				listaDeTurmas.get(i).setAtividade(AtividadeRepositorio.findById(codAtividades.get(i)));
				listaDeTurmas.get(i).setAlunoMonitor(codMatriculaMonitor.get(i) == 0 ? null : AlunoRepositorio.findById(codMatriculaMonitor.get(i)));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaDeTurmas;
	}
	
	public static void delete(Turma turma) {
		String query = "DELETE FROM turma WHERE cd_turma = " + turma.getCodTurma();
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static List<Turma> findAllByAluno(int id) {
		List<Turma> listaDeTurmas = new ArrayList<Turma>();
		String query = "SELECT t.cd_turma, t.data_inicio, t.data_fim, t.horario_aula, t.qtd_aluno, t.cd_instrutor, t.cd_atividade, t.cd_matricula_monitor FROM turma AS T INNER JOIN aluno_turma AS [AT] ON T.cd_turma = [AT].cd_turma WHERE [AT].cd_matricula = " + id;
		
		try {
			List<Integer> codInstrutores = new ArrayList<Integer>();
			List<Integer> codAtividades = new ArrayList<Integer>();
			List<Integer> codMatriculaMonitor = new ArrayList<Integer>();
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				codInstrutores.add(rs.getInt(6));
				codAtividades.add(rs.getInt(7));
				codMatriculaMonitor.add(rs.getInt(8));
				listaDeTurmas.add(new Turma(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getTime(4), rs.getInt(5)));
			}
			for (int i = 0; i < listaDeTurmas.size(); i++) {
				listaDeTurmas.get(i).setInstrutor(codInstrutores.get(i) == 0 ? null : InstrutorRepositorio.findById(codInstrutores.get(i)));
				listaDeTurmas.get(i).setAtividade(AtividadeRepositorio.findById(codAtividades.get(i)));
				listaDeTurmas.get(i).setAlunoMonitor(codMatriculaMonitor.get(i) == 0 ? null : AlunoRepositorio.findById(codMatriculaMonitor.get(i)));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaDeTurmas;
	}
	
	public static void registrarAlunoTurma(int idAluno, int idTurma) {
		String query = "INSERT INTO aluno_turma (cd_matricula, cd_turma)\n"
				+ "VALUES (" + idAluno + ", " + idTurma + ")";
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void removerAlunoTurma(int idAluno, int idTurma) {
		String query = "DELETE FROM aluno_turma\n"
				+ "WHERE cd_matricula = " + idAluno + " AND cd_turma = " + idTurma;
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
