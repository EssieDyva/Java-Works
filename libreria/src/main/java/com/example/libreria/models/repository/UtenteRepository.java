package com.example.libreria.models.repository;

import com.example.libreria.constants.DBConfig;
import com.example.libreria.models.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteRepository {
    public static List<Utente> getAllUtenti() throws SQLException {
        List<Utente> utenti = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM utente";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();
            while (rs.next()) {
                Utente utente = new Utente(
                        rs.getString("nome_cliente"),
                        rs.getString("cognome_cliente"),
                        rs.getInt("numero_Cellulare"),
                        rs.getString("indirizzo"),
                        rs.getString("genere")
                );
                utenti.add(utente);
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
        return utenti;
    }// end function

    public static Utente addUtente(Utente utente) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeInserite = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "INSERT INTO UTENTE (nome_cliente, cognome_cliente, numero_Cellulare, indirizzo, genere) " +
                            "VALUES (?, ?, ?, ?, ?)";
            comando = conn.prepareStatement(query);
            comando.setString(1, utente.getNome());
            comando.setString(2, utente.getCognome());
            comando.setInt(3, utente.getNumeroCellulare());
            comando.setString(4, utente.getIndirizzo());
            comando.setString(5, utente.getGenere());
            righeInserite = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeInserite > 0 ? utente : null;
    }// end function

    public static Utente updateUtente(int codiceUtente, Utente utente) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeAggiornate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "UPDATE UTENTE SET nome_cliente = ?, cognome_cliente = ?, numero_Cellulare = ?, " +
                           "indirizzo = ?, genere = ? WHERE codice_cliente = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, utente.getNome());
            comando.setString(2, utente.getCognome());
            comando.setInt(3, utente.getNumeroCellulare());
            comando.setString(4, utente.getIndirizzo());
            comando.setString(5, utente.getGenere());
            comando.setInt(6, codiceUtente);
            righeAggiornate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeAggiornate > 0 ? utente : null;
    }// end function

    public static boolean deleteUtente(int codiceUtente) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeCancellate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "DELETE FROM UTENTE WHERE codice_cliente = ?";
            comando = conn.prepareStatement(query);
            comando.setInt(1, codiceUtente);
            righeCancellate = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeCancellate > 0;
    }// end function
}
