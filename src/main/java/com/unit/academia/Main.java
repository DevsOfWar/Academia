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
		
		
		Pagamento pgmt = new Pagamento ("ESPECIE", null, new Date(new java.util.Date().getTime()), 55f, ContratoRepositorio.findById(10));
		Boleto boleto =  new Boleto ("BOLETO", null, new Date(new java.util.Date().getTime()), 55f, ContratoRepositorio.findById(10), "04556484");
		Cartao cartao =  new Cartao ("CARTAO", null, new Date(new java.util.Date().getTime()), 55f, ContratoRepositorio.findById(10), "", "", "");
		
		
		
		
		DatabaseConnection.conn.close();
	}

}
