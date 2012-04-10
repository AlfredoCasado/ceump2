package es.ceu.mpII.ejemplobasicojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class actualizarAlumno {

    public static void main(String[] args) throws Exception {

        final String url = "jdbc:mysql://localhost:3307/ejemplobasicojdbc";
        final String usuario = "root";
        final String passwd = "";

        final Connection connection = DriverManager.getConnection(url,usuario,passwd);      
        connection.setAutoCommit(false);
  
            final Statement actualizarAlumno = connection.createStatement();
            actualizarAlumno.executeUpdate("UPDATE Alumnos SET email='primera parte transaccion'");
            actualizarAlumno.executeUpdate("UPDATE Alumnos SET email='segunda parte transaccion'");
        
        connection.commit();

        actualizarAlumno.close();
        connection.close();
    }

    private static void provocarFallo() throws RuntimeException {
        throw new RuntimeException("fallo provocado");
    }

}
