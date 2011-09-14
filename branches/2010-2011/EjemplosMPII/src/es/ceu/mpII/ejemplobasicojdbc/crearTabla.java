package es.ceu.mpII.ejemplobasicojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class crearTabla {

    private static final String CREACION_TABLA_ALUMNOS = "CREATE Table Alumnos ( " +
                                                            "Nombre VarChar(50) NOT NULL PRIMARY KEY, " +
                                                            "Apellido VarChar(50) NOT NULL, " +
                                                            "Email VarChar(50) NOT NULL)";


    public static void main(String[] args) throws Exception {

        final String url = "jdbc:mysql://localhost:3306/ejemplobasicojdbc";
        final String usuario = "root";
        final String passwd = "root";
        
        Connection connection = DriverManager.getConnection(url,usuario,passwd);

        final Statement instruccionCreacionTabla = connection.createStatement();
        instruccionCreacionTabla.execute(CREACION_TABLA_ALUMNOS);

        instruccionCreacionTabla.close();
        connection.close();
    }

}
