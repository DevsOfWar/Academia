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
						+ "VALUES ("+ codPagamento +", '" + boleto.getCodigoBarras() + "');\n"
						+ "INSERT INTO contrato_pagamento (cd_contrato, cd_pagamento)\n"
						+ "VALUES ("+ codPagamento +", " + boleto.getContrato().getCodContrato() + ")";
			} else if (object instanceof Cartao) {
				Cartao cartao = (Cartao) object;
				query = "INSERT INTO cartao (bandeira, nome_pessoa, numero_cartao)\n"
						+ "VALUES ("+ codPagamento + ", '" + cartao.getBandeira() + "', '" + cartao.getNome() + "', '" + cartao.getNumero() + "');\n"
						+ "INSERT INTO contrato_pagamento (cd_contrato, cd_pagamento)\n"
						+ "VALUES ("+ codPagamento +", " + cartao.getContrato().getCodContrato() + ")";
			}
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
		
		
		
		
		
		return object;
	}
	
	public static List<Object> findAll(){
		List<Object> listaDePagamentos = new ArrayList<Object>();
		
		
		
		return listaDePagamentos;
	}
	
	//NÃO TESTADO
	public static void delete(Object object) {
		Pagamento pgmt = (Pagamento) object;
		String query = "";
		if (object instanceof Boleto) {
			query = "DELETE FROM boleto WHERE cd_pagamento = " + pgmt.getCodPagamento();
		} else if (object instanceof Cartao) {
			query = "DELETE FROM cartao WHERE cd_pagamento = " + pgmt.getCodPagamento();
		}
		try {
			DatabaseConnection.stmt.executeUpdate(query);
			query = "DELETE FROM contrato_pagamento WHERE cd_pagamento = " + pgmt.getCodPagamento() +";\n"
					+ "DELETE FROM pagamento WHERE cd_pagamento = " + pgmt.getCodPagamento();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
