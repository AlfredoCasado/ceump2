package es.ceu.mpII.ejemplobasicojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class actualizarAlumno {

    public static void main(String[] args) throws Exception {

        final String url = "jdbc:mysql://localhost:3306/ejemplobasicojdbc";
        final String usuario = "root";
        final String passwd = "root";

        final Connection connection = DriverManager.getConnection(url,usuario,passwd);
        //connection.setAutoCommit(false);


        final Statement actualizarAlumno = connection.createStatement();
        final int filasAfectadas = actualizarAlumno.executeUpdate("UPDATE Alumnos SET email='hola'");

        System.out.println("filas afectadas por el update: " + filasAfectadas);

       // connection.commit();
        actualizarAlumno.close();
        connection.close();
    }

}
