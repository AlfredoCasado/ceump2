package es.ceu.mpII.ejemplobasicojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class consultarAlumnos {

     public static void main(String[] args) throws Exception {

        final String url = "jdbc:mysql://localhost:3306/ejemplobasicojdbc";
        final String usuario = "root";
        final String passwd = "root";

        final Connection connection = DriverManager.getConnection(url,usuario,passwd);

        final Statement queryTodosLosAlumnos = connection.createStatement();
        final ResultSet alumnos = queryTodosLosAlumnos.executeQuery("SELECT * FROM alumnos");
      
        while (alumnos.next()) {
            final String nombre = alumnos.getString("Nombre");
            final String Apellido = alumnos.getString("Apellido");
            final String email = alumnos.getString("Email");

            System.out.println("leido alumno, nombre: " + nombre + " apellido: " + Apellido + " email: " + email);
        }
        
        alumnos.close();
        queryTodosLosAlumnos.close();
        connection.close();
     }

}
