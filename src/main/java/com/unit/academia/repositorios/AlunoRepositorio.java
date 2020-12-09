package com.unit.academia.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.unit.academia.DatabaseConnection;
import com.unit.academia.entidades.Aluno;

public abstract class AlunoRepositorio {
	
	public static void create(Aluno aluno) {
		String query = "INSERT INTO aluno(nome_aluno, telefone_aluno, dt_nascimento, logradouro, numero_logradouro, bairro, cidade, cep, altura, peso, senha)\n"
				+ "VALUES ('" + aluno.getNome() + "', '" + aluno.getTelefone() + "', '" + aluno.getDtNascimento() + "', '" + aluno.getLogradouro() + "', " + aluno.getNumeroLogradouro() + ", '" + aluno.getBairro() + "', '" + aluno.getCidade() + "', '" + aluno.getCep() + "', " + aluno.getAltura() + ", "  + aluno.getPeso() + ", '" + aluno.getSenha() + "')";
	
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void update(Aluno aluno) {
		String query = "UPDATE aluno\n"
				+ "SET nome_aluno = '" + aluno.getNome() + "', telefone_aluno = '" + aluno.getTelefone() + "', dt_nascimento = '" + aluno.getDtNascimento() + "', logradouro = '" + aluno.getLogradouro() + "', numero_logradouro = " + aluno.getNumeroLogradouro() + ", bairro = '" + aluno.getBairro() + "', cidade = '" + aluno.getCidade() + "', cep = '" + aluno.getCep() + "', altura = " + aluno.getAltura() + ", peso = " + aluno.getPeso() + ", senha = '" + aluno.getSenha() + "' \n"
				+ "WHERE cd_matricula = " + aluno.getCodAluno();
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static Aluno findById(int id) {
		String query = "SELECT * FROM aluno WHERE cd_matricula = " + id;
		Aluno aluno = null;
		
		try {
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				aluno = new Aluno(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getFloat(11), rs.getFloat(12), rs.getString(13));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return aluno;
	}
	
	public static List<Aluno> findAll(){
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		
		String query = "SELECT * FROM aluno";
		
		try {
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				listaDeAlunos.add(new Aluno(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getFloat(11), rs.getFloat(12), rs.getString(13)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaDeAlunos;
	}
	
	public static void delete(Aluno aluno) {
		String query = "DELETE FROM aluno WHERE cd_matricula = " + aluno.getCodAluno();
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
}
