package com.unit.academia.repositorios;

import com.unit.academia.DatabaseConnection;
import com.unit.academia.entidades.Plano;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class PlanoRepositorio {

	public static void create(Plano plano) {
		String query = "INSERT INTO plano(tipo_plano, valor_plano, qtd_atividades_disponiveis)\n" + "VALUES ('"
				+ plano.getTipo() + "', " + plano.getValor() + ", " + plano.getQtdAtividadesDisponiveis() + ")";
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public static void update(Plano plano) {
		String query = "UPDATE plano\n" 
				+ "SET tipo_plano = '" + plano.getTipo() + "', valor_plano = "+ plano.getValor() + ", qtd_atividades_disponiveis = " + plano.getQtdAtividadesDisponiveis() + "\n"
				+ "WHERE cd_plano = " + plano.getCodPlano();
		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static Plano findById(int id) {
		String query = "SELECT * FROM plano WHERE cd_plano = " + id;
		Plano plano = null;
		try {
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				plano = new Plano(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4));

			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return plano;
	}

	public static List<Plano> findAll() {
		List<Plano> listaDePlanos = new ArrayList<Plano>();

		String query = "SELECT * FROM plano";

		try {
			ResultSet rs = DatabaseConnection.stmt.executeQuery(query);
			while (rs.next()) {
				listaDePlanos.add(new Plano(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4)));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return listaDePlanos;
	}

	public static void delete(Plano plano) {
		String query = "DELETE FROM plano\n" 
					+ "WHERE cd_plano = " + plano.getCodPlano();

		try {
			DatabaseConnection.stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
