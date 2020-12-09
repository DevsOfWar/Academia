package com.unit.academia.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.unit.academia.DatabaseConnection;
import com.unit.academia.entidades.Instrutor;

public abstract class InstrutorRepositorio {

	public static void create(Instrutor instrutor) {
		String query = "INSERT INTO instrutor(rg, nome_instrutor, dt_nascimento, titulacao, salario)\n"
				+ "VALUES ('" + instrutor.getRg() +"', '" + instrutor.getNome() + "', '" + instrutor.getDtNascimento() + "', '" + instrutor.getTitulacao() + "', " + instrutor.getSalario() + ")";
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void update(Instrutor instrutor) {
		String query = "UPDATE instrutor\n"
				+ "SET rg = '" + instrutor.getRg() + "', nome_instrutor = '" + instrutor.getNome() + "', dt_nascimento = '" + instrutor.getDtNascimento() + "', titulacao = '" + instrutor.getTitulacao() + "', salario = " + instrutor.getSalario() + "\n"
				+ "WHERE cd_instrutor =" + instrutor.getCodInstrutor();
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static Instrutor findById(int id) {
		Instrutor instrutor = null;
		String query = "SELECT * FROM instrutor WHERE cd_instrutor = " + id;
		
		try {
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				instrutor = new Instrutor (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getFloat(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return instrutor;
	}
	
	public static List<Instrutor> findAll() {
		List<Instrutor> listaDeInstrutores = new ArrayList<Instrutor>();
		String query = "SELECT * FROM instrutor";
		
		
		try {
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				listaDeInstrutores.add(new Instrutor (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getFloat(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaDeInstrutores;
	}
	
	public static void delete(Instrutor instrutor) {
		String query = "DELETE FROM instrutor WHERE cd_instrutor = " + instrutor.getCodInstrutor();
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
