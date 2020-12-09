package com.unit.academia.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.unit.academia.DatabaseConnection;
import com.unit.academia.entidades.Contrato;

public abstract class ContratoRepositorio {
	public static void create(Contrato contrato) {
		String query = "INSERT INTO contrato(tipo_contrato, cd_matricula, cd_plano, qtd_atividades_acordadas, valor_acordado)\n"
				+ "VALUES( '" + contrato.getTipoContrato() + "', " + contrato.getAluno().getCodAluno() + ", " + contrato.getPlano().getCodPlano() + ", " + contrato.getQtdAtividadesAcordadas() + ", " + contrato.getValorAcordado() + ")";
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void update(Contrato contrato) {
		String dataFinal = contrato.getDtFinal() != null ? "'"+ contrato.getDtFinal() + "'" : "NULL";
		String query = "UPDATE contrato\n"
				+ "SET data_inicial = '" + contrato.getDtInicial() + "', data_final = " + dataFinal + ", tipo_contrato = '" + contrato.getTipoContrato() + "', status_contrato = " + (contrato.isStatus() ? 1 : 0) + ", valor_acordado = " + contrato.getValorAcordado() + ", cd_plano = " + contrato.getPlano().getCodPlano() + ", qtd_atividades_acordadas = " + contrato.getQtdAtividadesAcordadas() + "\n"
				+ "WHERE cd_contrato = " + contrato.getCodContrato();
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static Contrato findById(int id) {
		Contrato contrato = null;
		String query = "SELECT * FROM contrato WHERE cd_contrato =" + id;
		
		try {
			int codAluno = 0;
			int codPlano = 0;
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				codAluno = rs.getInt(10);
				codPlano = rs.getInt(11);
				contrato = new Contrato (rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getBytes(4), rs.getBytes(5), rs.getString(6), rs.getBoolean(7), rs.getFloat(8), rs.getInt(9), null, null);
			}
			contrato.setAluno(AlunoRepositorio.findById(codAluno));
			contrato.setPlano(PlanoRepositorio.findById(codPlano));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return contrato;
	}
	
	public static List<Contrato> findAll(){
		List<Contrato> listaDeContratos = new ArrayList<Contrato>();
		String query = "SELECT * FROM contrato";
		
		try {
			List<Integer> codAlunos = new ArrayList<Integer>();
			List<Integer> codPlanos = new ArrayList<Integer>();
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				codAlunos.add(rs.getInt(10));
				codPlanos.add(rs.getInt(11));
				listaDeContratos.add(new Contrato (rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getBytes(4), rs.getBytes(5), rs.getString(6), rs.getBoolean(7), rs.getFloat(8), rs.getInt(9), null, null));
			}
			
			for (int i = 0; i < listaDeContratos.size(); i++) {
				listaDeContratos.get(i).setAluno(AlunoRepositorio.findById(codAlunos.get(i)));
				listaDeContratos.get(i).setPlano(PlanoRepositorio.findById(codPlanos.get(i)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaDeContratos;
	}
	
	public static void delete(Contrato contrato) {
		String query = "DELETE FROM contrato WHERE cd_contrato = " + contrato.getCodContrato();
		
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
