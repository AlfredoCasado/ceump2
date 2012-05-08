package es.ceu.mpII.ejemplobasicojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class consultarAlumnosConPreparedStatement {

     public static void main(String[] args) throws Exception {
        consultarAlumnosConApellido("sanchez");
     }

    private static void consultarAlumnosConApellido(final String apellido) throws SQLException {
        final String url = "jdbc:mysql://localhost:3307/ejemplobasicojdbc";
        final String usuario = "root";
        final String passwd = "";

        final Connection connection = DriverManager.getConnection(url,usuario,passwd);

        final PreparedStatement queryTodosLosAlumnos = connection.
                                                       prepareStatement("SELECT * FROM alumnos WHERE Apellido = ?");
       
        queryTodosLosAlumnos.setString(1, apellido);
        
        ResultSet alumnos = queryTodosLosAlumnos.executeQuery();
        
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
