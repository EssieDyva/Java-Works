package com.concessionaria.models.repository;

import com.concessionaria.models.Auto;
import com.concessionaria.constants.DBConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutoRepository {
    public static List<Auto> selectAllAuto() throws SQLException {
        List<Auto> autoList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM AUTO";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Auto auto = new Auto(
                        rs.getString("MODELLO"),
                        rs.getString("TARGA"),
                        rs.getInt("ANNO"),
                        rs.getString("TIPO_CARBURANTE"),
                        rs.getString("MARCA"),
                        rs.getInt("NUMERO_PORTE"),
                        rs.getInt("IBRIDA"),
                        rs.getString("CODICE_MECCANOGRAFICO"));
                autoList.add(auto);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return autoList;
    }

    public static Auto inserisciAuto(Auto auto) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeInserite = 0;

        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "INSERT INTO AUTO (MODELLO, TARGA, ANNO, TIPO_CARBURANTE, MARCA, NUMERO_PORTE, IBRIDA, CODICE_MECCANOGRAFICO)" +
                           "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            comando = conn.prepareStatement(query);
            comando.setString(1, auto.getModello());
            comando.setString(2, auto.getTarga());
            comando.setInt(3, auto.getAnno());
            comando.setString(4, auto.getTipoCarburante());
            comando.setString(5, auto.getMarca());
            comando.setInt(6, auto.getNumeroPorte());
            comando.setInt(7, auto.getIbrida());
            comando.setString(8, auto.getCodiceMeccanografico());

            righeInserite = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return righeInserite > 0 ? auto : null;
    }

    public static Auto aggiornaAuto(Auto auto) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeAggiornate = 0;

        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "UPDATE AUTO" +
                           "SET MODELLO = ?, TARGA = ?, ANNO = ?, TIPO_CARBURANTE = ?, MARCA = ?, NUMERO_PORTE = ?, IBRIDA = ?" +
                           "WHERE CODICE_MECCANOGRAFICO = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, auto.getModello());
            comando.setString(2, auto.getTarga());
            comando.setInt(3, auto.getAnno());
            comando.setString(4, auto.getTipoCarburante());
            comando.setString(5, auto.getMarca());
            comando.setInt(6, auto.getNumeroPorte());
            comando.setInt(7, auto.getIbrida());
            comando.setString(8, auto.getCodiceMeccanografico());

            righeAggiornate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return righeAggiornate > 0 ? auto : null;
    }

    public static boolean eliminaAuto(String codiceMeccanografico) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeEliminate = 0;

        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "DELETE FROM AUTO WHERE CODICE_MECCANOGRAFICO = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, codiceMeccanografico);

            righeEliminate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return righeEliminate > 0;
    }
}