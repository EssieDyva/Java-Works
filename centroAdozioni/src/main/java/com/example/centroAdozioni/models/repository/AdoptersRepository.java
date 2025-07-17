package com.example.centroAdozioni.models.repository;

import com.example.centroAdozioni.constants.DBConfig;
import com.example.centroAdozioni.models.Adopters;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdoptersRepository {

    public static List<Adopters> getAllAdopters() throws SQLException {
        List<Adopters> adoptersList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM ADOPTERS";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                Adopters adopter = new Adopters(
                        rs.getString("NAME"),
                        rs.getString("EMAIL"),
                        rs.getString("PHONE")
                );
                adoptersList.add(adopter);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return adoptersList;
    }

    public static Adopters insertAdopter(Adopters adopter) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeInserite = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "INSERT INTO ADOPTERS (NAME, EMAIL, PHONE) VALUES (?, ?, ?)";
            comando = conn.prepareStatement(query);
            comando.setString(1, adopter.getName());
            comando.setString(2, adopter.getEmail());
            comando.setString(3, adopter.getPhone());
            righeInserite = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return righeInserite > 0 ? adopter : null;
    }

    public static Adopters updateAdopter(Adopters adopter, int id) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeAggiornate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "UPDATE ADOPTERS SET NAME = ?, EMAIL = ?, PHONE = ? WHERE ID = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, adopter.getName());
            comando.setString(2, adopter.getEmail());
            comando.setString(3, adopter.getPhone());
            comando.setInt(4, id);

            righeAggiornate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return righeAggiornate > 0 ? adopter : null;
    }

    public static boolean deleteAdopter(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeCancellate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "DELETE FROM ADOPTERS WHERE ID = ?";
            comando = conn.prepareStatement(query);
            comando.setInt(1, id);
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