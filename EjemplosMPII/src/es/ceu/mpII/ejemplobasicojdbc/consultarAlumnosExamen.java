package es.ceu.mpII.ejemplobasicojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class consultarAlumnosExamen {

    public static void main(String[] args) {
        Connection connection = null;
        ResultSet alumnos = null;
        Statement queryTodosLosAlumnos = null;
        try {   

            final String url = "jdbc:mysql://localhost:3307/ejemplobasicojdbc";
            final String usuario = "root";
            final String passwd = "";

            connection = DriverManager.getConnection(url, usuario, passwd);
            queryTodosLosAlumnos = connection.createStatement();
            alumnos = queryTodosLosAlumnos.executeQuery("SELECT * FROM alumnos");

            while (alumnos.next()) {
                final String nombre = alumnos.getString("Nombre");
                final String Apellido = alumnos.getString("Apellido");
                final String email = alumnos.getString("Email");
                System.out.println("leido alumno, nombre: " + nombre + " apellido: " + Apellido + " email: " + email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (alumnos != null) {
                try {
                    alumnos.close();
                } catch (SQLException ex1) {
                }
            }

            if (queryTodosLosAlumnos != null) {
                try {
                    queryTodosLosAlumnos.close();
                } catch (SQLException ex) {
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex1) {
                }
            }


        }
    }
}
