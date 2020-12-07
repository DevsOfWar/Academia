package com.unit.academia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection conn = DatabaseConnection.conn();
		Statement st = conn.createStatement();
		ResultSet rs = null;
		String query = "";
		//INICIALIAÇÃO
		
		query = "select * from uVW_DADOS_CONTRATOS_ALUNOS where [Nº do Contrato] = 1";
		rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getString(3));
		}
		conn.close();

		
	}

}
