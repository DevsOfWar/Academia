package com.unit.academia.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.unit.academia.DatabaseConnection;
import com.unit.academia.entidades.Boleto;
import com.unit.academia.entidades.Cartao;
import com.unit.academia.entidades.Pagamento;

public abstract class PagamentoRepositorio {
	
	
	public static void create(Object object) {
		
		
		ResultSet rsCodPagamento;
		int codPagamento = 0;
		Pagamento pgmt = (Pagamento) object;
		String query = "INSERT INTO pagamento(metodo_pagamento, confimacao_pagamento, data_pagamento, valor_pagamento)\n"
				+ "VALUES ('" + pgmt.getMetodo() + "', CAST('lorem ipsum' AS VARBINARY), '" + pgmt.getDtPagamento() + "', " + pgmt.getValor() + ");\n";
		
		try {
			DatabaseConnection.stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
			rsCodPagamento = DatabaseConnection.stmt.getGeneratedKeys();
			while (rsCodPagamento.next()) {
				codPagamento = rsCodPagamento.getInt(1);
			}
			if (object instanceof Boleto) {
				Boleto boleto = (Boleto) object;
				query = "INSERT INTO boleto (cd_pagamento, cod_barras)\n"
						+ "VALUES ("+ codPagamento +", '" + boleto.getCodigoBarras() + "');\n";
				DatabaseConnection.stmt.executeUpdate(query);

			} else if (object instanceof Cartao) {
				Cartao cartao = (Cartao) object;
				query = "INSERT INTO cartao (cd_pagamento, bandeira, nome_pessoa, numero_cartao)\n"
						+ "VALUES ("+ codPagamento + ", '" + cartao.getBandeira() + "', '" + cartao.getNome() + "', '" + cartao.getNumero() + "');\n";
				DatabaseConnection.stmt.executeUpdate(query);
						
			}

			query = "INSERT INTO contrato_pagamento (cd_pagamento, cd_contrato)\n"
					+ "VALUES ("+ codPagamento +", " + pgmt.getContrato().getCodContrato() + ")";
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	//não usado
	public static void update() {
		
	}
	
	public static Object findById(int id) {
		Object object = null;
		Pagamento pgmt = null;
		
		String query = "SELECT * FROM pagamento WHERE cd_pagamento = " +id;
		
		try {
			int codContrato = 0;
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				pgmt = new Pagamento (rs.getInt(1), rs.getString(2), rs.getBytes(3), rs.getDate(4), rs.getFloat(5), null);
			}
			query = "SELECT cd_contrato FROM contrato_pagamento WHERE cd_pagamento = " + id;
			rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				codContrato = rs.getInt(1);
			}
			pgmt.setContrato(ContratoRepositorio.findById(codContrato));
			if (pgmt.getMetodo().toUpperCase().contentEquals("BOLETO")) {
				Boleto boleto = null;
				query = "SELECT * FROM boleto WHERE cd_pagamento = " + pgmt.getCodPagamento();
				rs = DatabaseConnection.stmt.executeQuery(query);
				while (rs.next()) {
					boleto = new Boleto(pgmt.getCodPagamento(), pgmt.getMetodo(), pgmt.getConfirmacao(), pgmt.getDtPagamento(), pgmt.getValor(), pgmt.getContrato(), rs.getString(2));
				}
				return boleto;
			} else if (pgmt.getMetodo().toUpperCase().contentEquals("CARTAO")) {
				Cartao cartao = null;
				query = "SELECT * FROM cartao WHERE cd_pagamento = " + id;
				ResultSet rs2 = DatabaseConnection.stmt.executeQuery(query);
				while (rs2.next()) {
					cartao = new Cartao (pgmt.getCodPagamento(), pgmt.getMetodo(), pgmt.getConfirmacao(), pgmt.getDtPagamento(), pgmt.getValor(), pgmt.getContrato(), rs2.getString(1), rs2.getString(2), rs2.getString(3));
				}
				return cartao;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pgmt;
	}
	
	//não usado
	public static List<Object> findAll(){
		List<Object> listaDePagamentos = new ArrayList<Object>();
		
		
		
		return listaDePagamentos;
	}
	
	
	public static void delete(Object object) {
		Pagamento pgmt = (Pagamento) object;
		String query = "";
		if (object instanceof Boleto) {
			query = "DELETE FROM boleto WHERE cd_pagamento = " + pgmt.getCodPagamento() + ";\n";
		} else if (object instanceof Cartao) {
			query = "DELETE FROM cartao WHERE cd_pagamento = " + pgmt.getCodPagamento() + ";\n";
		}
		try {
			query += "DELETE FROM contrato_pagamento WHERE cd_pagamento = " + pgmt.getCodPagamento() +";\n"
					+ "DELETE FROM pagamento WHERE cd_pagamento = " + pgmt.getCodPagamento();
			DatabaseConnection.stmt.executeUpdate(query);
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
