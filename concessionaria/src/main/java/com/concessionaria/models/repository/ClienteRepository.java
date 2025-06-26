package com.concessionaria.models.repository;

import com.concessionaria.models.Cliente;
import com.concessionaria.constants.DBConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    public static List<Cliente> selectAllClienti() throws SQLException {
        List<Cliente> clienteList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try{
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM CLIENTE";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();

            while(rs.next()) {
                Cliente cli = new Cliente(
                        rs.getString("NOME"),
                        rs.getString("COGNOME"),
                        rs.getString("CODICE_FISCALE"),
                        rs.getString("NUMERO_TELEGONO"),
                        rs.getString("GENERE"));
                clienteList.add(cli);
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return clienteList;
    }

    public static Cliente inserisciCliente(Cliente cliente) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeInserite = 0;

        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "INSERT INTO CLIENTE (CODICE_FISCALE, NOME, COGNOME, GENERE, NUMERO_TELEFONO)" +
                    "VALUES(?, ?, ?, ?, ?)";
            comando = conn.prepareStatement(query);
            comando.setString(1, cliente.getCodiceFiscale());
            comando.setString(2, cliente.getNomeCliente());
            comando.setString(3, cliente.getCognomeCliente());
            comando.setString(4, cliente.getGenere());
            comando.setString(5, cliente.getNumeroTelefono());

            righeInserite = comando.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeInserite > 0 ? cliente : null;

    } //end function

    public static Cliente aggiornaCliente(Cliente cliente) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeInserite = 0;

        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "UPDATE CLIENTE" +
                           "SET NOME = ?, COGNOME = ?,NUMERO_TELEFONO = ?, GENERE = ?" +
                           "WHERE CODICE_FISCALE = ?";
            comando = conn.prepareStatement(query);
            comando.setString(2, cliente.getNomeCliente());
            comando.setString(3, cliente.getCognomeCliente());
            comando.setString(5, cliente.getNumeroTelefono());
            comando.setString(4, cliente.getGenere());
            comando.setString(1, cliente.getCodiceFiscale());

            righeInserite = comando.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeInserite > 0 ? cliente : null;
    }

    public static boolean eliminaCliente(String codiceFiscale) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeEliminate = 0;

        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "DELETE FROM CLIENTE WHERE CODICE_FISCALE = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, codiceFiscale);

            righeEliminate = comando.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return righeEliminate > 0;
    }
}// end repository
