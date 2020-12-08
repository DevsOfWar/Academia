package com.unit.academia;

import java.sql.SQLException;

import com.unit.academia.entidades.Atividade;
import com.unit.academia.entidades.Plano;
import com.unit.academia.repositorios.AtividadeRepositorio;
import com.unit.academia.repositorios.PlanoRepositorio;

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

		DatabaseConnection.conn.close();
	}

}
