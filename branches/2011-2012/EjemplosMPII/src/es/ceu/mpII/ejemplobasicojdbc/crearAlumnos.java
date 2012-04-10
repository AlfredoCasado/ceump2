package es.ceu.mpII.ejemplobasicojdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class crearAlumnos {


    public static void main(String[] args) throws Exception {

        final String url = "jdbc:mysql://localhost:3307/ejemplobasicojdbc";
        final String usuario = "root";
        final String passwd = "";

        Connection connection = DriverManager.getConnection(url,usuario,passwd);

        Statement insertarUsuario = connection.createStatement();

        insertarUsuario.executeUpdate("INSERT INTO alumnos (Nombre,Apellido,Email) "
                                    + "VALUES ('juanito','garcia','jgarcia@ceu.es')");
        
        insertarUsuario.executeUpdate("INSERT INTO alumnos (Nombre,Apellido,Email) "
                                    + "VALUES ('pedro','sanchez','sanchez@ceu.es')");
        
        insertarUsuario.executeUpdate("INSERT INTO alumnos (Nombre,Apellido,Email) "
                                    + "VALUES ('julian','masero','jmasero@ceu.es')");
        
        insertarUsuario.executeUpdate("INSERT INTO alumnos (Nombre,Apellido,Email) "
                                    + "VALUES ('alberto','peña','apeña@ceu.es')");

        insertarUsuario.close();
        connection.close();

    }

}
