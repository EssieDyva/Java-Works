package com.example.centroAdozioni.models.repository;

import com.example.centroAdozioni.constants.DBConfig;
import com.example.centroAdozioni.models.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CatRepository {
    public static List<Animal> getAllCats() throws SQLException {
        List<Animal> catList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement comando = null;
        try{
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM CAT";
            comando = conn.prepareStatement(query);
            ResultSet rs = comando.executeQuery();

            //itero sul risultato della select ed assegno la mia lista sql,
            //alla mia lista
            while(rs.next()){
                Animal ani = new Animal(
                        rs.getString("NAME"),
                        rs.getInt("AGE"),
                        rs.getString("BREED"),
                        rs.getInt("GENDER"),
                        rs.getString("ADOPTION_DATE"),
                        rs.getInt("BOX"),
                        rs.getString("CHECK_IN"),
                        rs.getInt("IS_ADOPTED"),
                        rs.getInt("ID_ADOPTER")
                );
                catList.add(ani);
            }//end while
        }//end try
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(conn != null)
                conn.close();
            if(comando != null)
                comando.close();
        }
        return catList;
    }//end function

    public static Animal insertCat(Animal animal) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeInserite = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "INSERT INTO CAT (NAME, AGE, BREED, GENDER, ADOPTION_DATE, BOX, CHECK_IN, IS_ADOPTED, ID_ADOPTER) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            comando = conn.prepareStatement(query);
            comando.setString(1, animal.getName());
            comando.setInt(2, animal.getAge());
            comando.setString(3, animal.getBreed());
            comando.setInt(4, animal.getGender());
            comando.setString(5, animal.getAdoptionDate());
            comando.setInt(6, animal.getBox());
            comando.setString(7, animal.getCheckIn());
            comando.setInt(8, animal.getIsAdopted());
            comando.setInt(9, animal.getIdAdopter());
            righeInserite = comando.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return righeInserite > 0 ? animal : null;
    }// end function

    public  static Animal updateCat(Animal animal, int id) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeAggiornate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "UPDATE CAT SET NAME = ?, AGE = ?, BREED = ?, GENDER = ?, ADOPTION_DATE = ?, BOX = ?, CHECK_IN = ?, IS_ADOPTED = ?, ID_ADOPTER = ? " +
                    "WHERE ID = ?";
            comando = conn.prepareStatement(query);
            comando.setString(1, animal.getName());
            comando.setInt(2, animal.getAge());
            comando.setString(3, animal.getBreed());
            comando.setInt(4, animal.getGender());
            comando.setString(5, animal.getAdoptionDate());
            comando.setInt(6, animal.getBox());
            comando.setString(7, animal.getCheckIn());
            comando.setInt(8, animal.getIsAdopted());
            comando.setInt(9, animal.getIdAdopter());
            comando.setInt(10, id);

            righeAggiornate = comando.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
            if (comando != null)
                comando.close();
        }
        return righeAggiornate > 0 ? animal : null;
    }// end function

    public static boolean deleteCat(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement comando = null;
        int righeCancellate = 0;
        try {
            conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "DELETE FROM CAT WHERE ID = ?";
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
    }// end function
}
