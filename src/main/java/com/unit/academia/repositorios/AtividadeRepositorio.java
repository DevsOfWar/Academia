package com.unit.academia.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.unit.academia.DatabaseConnection;
import com.unit.academia.entidades.Atividade;

public class AtividadeRepositorio {
	
	public static void create(Atividade atividade) {
		String query = "INSERT INTO atividade(nome_atividade, descricao_atividade, custo_hora)\n" 
				+ "VALUES ('"+ atividade.getNome() + "', '" + atividade.getDescricao() + "', " + atividade.getCustoHora() + ")";
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void update(Atividade atividade) {
		String query = "UPDATE atividade\n" 
				+ "SET nome_atividade = '" + atividade.getNome() + "', descricao_atividade = '"+ atividade.getDescricao() + "', custo_hora = " + atividade.getCustoHora() + "\n"
				+ "WHERE cd_atividade = " + atividade.getCodAtividade();
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static Atividade findById(int id) {
		String query = "SELECT * FROM atividade WHERE cd_atividade = " + id;
		Atividade atividade = null;
		
		try {
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				atividade = new Atividade(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return atividade;
	}
	
	public static List<Atividade> findAll(){
		List<Atividade> listaDeAtividades = new ArrayList<Atividade>();
		String query = "SELECT * FROM atividade";
		
		try {
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				listaDeAtividades.add(new Atividade(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4)));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		
		return listaDeAtividades;
	}
	
	public static void delete(Atividade atividade) {
		String query = "DELETE FROM atividade WHERE cd_atividade = " + atividade.getCodAtividade();
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
