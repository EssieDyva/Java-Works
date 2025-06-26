package com.concessionaria.models.repository;

import com.concessionaria.constants.DBConfig;
import com.concessionaria.models.Concessionaria;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConcessionariaRepository {
    public static List<Concessionaria> selectAllConcessionarie() throws SQLException {
        List<Concessionaria> concessionariaList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM CONCESSIONARIA";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Concessionaria conc = new Concessionaria(
                        rs.getString("NOME_CONCESSIONARIO"),
                        rs.getString("CODICE_CONCESSIONARIO"),
                        rs.getString("INDIRIZZO"));
                concessionariaList.add(conc);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return concessionariaList;
    }

    public static Concessionaria inserisciConcessionaria(Concessionaria concessionaria) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeInserite = 0;

        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "INSERT INTO CONCESSIONARIA (NOME_CONCESSIONARIO, CODICE_CONCESSIONARIO, INDIRIZZO) " +
                           "VALUES(?, ?, ?)";
            comando = conn.prepareStatement(query);
            comando.setString(1, concessionaria.getNomeConcessionario());
            comando.setString(2, concessionaria.getCodiceConcessionario());
            comando.setString(3, concessionaria.getIndirizzo());

            righeInserite = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return concessionaria;
    }

    public static Concessionaria updateConcessionaria(Concessionaria concessionaria) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeAggiornate = 0;

        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "UPDATE CONCESSIONARIA " +
                           "SET NOME_CONCESSIONARIO = ?, INDIRIZZO = ? " +
                           "WHERE CODICE_CONCESSIONARIO = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, concessionaria.getNomeConcessionario());
            comando.setString(2, concessionaria.getIndirizzo());
            comando.setString(3, concessionaria.getCodiceConcessionario());

            righeAggiornate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return concessionaria;
    }

    public static boolean deleteConcessionaria(String codiceConcessionario) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeCancellate = 0;

        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "DELETE FROM CONCESSIONARIA WHERE CODICE_CONCESSIONARIO = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, codiceConcessionario);

            righeCancellate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return righeCancellate > 0;
    }
}
