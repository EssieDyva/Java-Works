package com.example.libreria.models.repository;

import com.example.libreria.constants.DBConfig;
import com.example.libreria.models.Autore;
import com.example.libreria.models.Libro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroRepository {
    public static List<Libro> getAllLibri() throws SQLException {
        List<Libro> libri = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM LIBRO";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Libro libro = new Libro(
                        rs.getString("nome_libro"),
                        rs.getString("matricola_autore"),
                        rs.getString("genere"),
                        rs.getInt("anno_pubblicazione"),
                        rs.getString("casa_editrice"),
                        rs.getInt("quantita"));
                libri.add(libro);
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
        return libri;
    }// end function

    public static Libro addLibro(Libro libro) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeInserite = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "INSERT INTO LIBRO (nome_libro, matricola_autore, genere, anno_pubblicazione, casa_editrice, quantita) " +
                            "VALUES (?, ?, ?, ?, ?, ?)";
            comando = conn.prepareStatement(query);
            comando.setString(1, libro.getNomeLibro());
            comando.setString(2, libro.getMatricolaAutore());
            comando.setString(3, libro.getGenere());
            comando.setInt(4, libro.getAnnoPubblicazione());
            comando.setString(5, libro.getCasaEditrice());
            comando.setInt(6, libro.getQuantita());
            righeInserite = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeInserite > 0 ? libro : null; // Return the added book or null if insertion failed
    }

    public static Libro updateLibro(String isbn, Libro libro) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeAggiornate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "UPDATE LIBRO SET matricola_autore = ?, genere = ?, anno_pubblicazione = ?, casa_editrice = ?, quantita = ? " +
                           "WHERE isbn = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, libro.getMatricolaAutore());
            comando.setString(2, libro.getGenere());
            comando.setInt(3, libro.getAnnoPubblicazione());
            comando.setString(4, libro.getCasaEditrice());
            comando.setInt(5, libro.getQuantita());
            comando.setString(6, isbn);
            righeAggiornate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeAggiornate > 0 ? libro : null; // Return the updated book or null if update failed
    }// end function

    public static boolean deleteLibro(String isbn) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeCancellate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "DELETE FROM LIBRO WHERE isbn = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, isbn);
            righeCancellate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeCancellate > 0; // Return true if deletion was successful
    }// end function

    //query usando una INNER JOIN per ottenere i libri con i loro autori
    public static List<Libro> getLibriConAutori() throws SQLException {
        List<Libro> libri = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT l.*, a.nome_autore, a.cognome_autore FROM LIBRO l " +
                           "INNER JOIN autore a ON l.matricola_autore = a.id_autore";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Libro libro = new Libro(
                        rs.getString("nome_libro"),
                        rs.getString("matricola_autore"),
                        rs.getString("genere"),
                        rs.getInt("anno_pubblicazione"),
                        rs.getString("casa_editrice"),
                        rs.getInt("quantita"));
                libri.add(libro);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return libri;
    }
}
