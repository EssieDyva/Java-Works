package com.example.libreria.models.repository;

import com.example.libreria.constants.DBConfig;
import com.example.libreria.models.Autore;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutoreRepository {
    public static List<Autore> getAllAutori() throws SQLException {
        List<Autore> autori = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM AUTORE";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Autore autore = new Autore(
                        rs.getString("nome_autore"),
                        rs.getString("cognome_autore"),
                        rs.getString("genere_preferito")
                );
                autori.add(autore);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return autori;
    }// end function

    public static Autore addAutore(Autore autore) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeInserite = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "INSERT INTO AUTORE (nome_autore, cognome_autore, genere_preferito) " +
                            "VALUES (?, ?, ?)";
            comando = conn.prepareStatement(query);
            comando.setString(1, autore.getNome());
            comando.setString(2, autore.getCognome());
            comando.setString(3, autore.getGenerePreferito());
            righeInserite = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeInserite > 0 ? autore : null;
    }// end function

    public static Autore updateAutore(int matricolaAutore, Autore autore) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeAggiornate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "UPDATE AUTORE SET nome_autore = ?, cognome_autore = ?, genere_preferito = ? " +
                           "WHERE id_autore = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, autore.getNome());
            comando.setString(2, autore.getCognome());
            comando.setString(3, autore.getGenerePreferito());
            comando.setInt(4, matricolaAutore);
            righeAggiornate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeAggiornate > 0 ? autore : null;
    }// end function

    public static boolean deleteAutore(int matricolaAutore) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeEliminate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "DELETE FROM AUTORE WHERE id_autore = ?";
            comando = conn.prepareStatement(query);
            comando.setInt(1, matricolaAutore);
            righeEliminate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeEliminate > 0;
    }// end function
}
