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
		
		Contrato contrato = ContratoRepositorio.findById(1);
		Boleto boleto = new Boleto("BOLETO", null, new Date(new java.util.Date().getTime()), 10, contrato, "021554522144" );
		PagamentoRepositorio.create(boleto);
		DatabaseConnection.conn.close();
	}

}
