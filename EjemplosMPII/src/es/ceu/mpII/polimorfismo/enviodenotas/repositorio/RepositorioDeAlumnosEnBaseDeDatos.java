package es.ceu.mpII.polimorfismo.enviodenotas.repositorio;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.MecanismoDeNotificacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class RepositorioDeAlumnosEnBaseDeDatos implements RepositorioAlumnos {

    public Alumno[] dameTodosLosAlumnos() {
        Connection connection = null;
        ResultSet result = null;
        try {
            Set<Alumno> alumnos = new HashSet();
            
            connection = obtenerLaConexion();
            result = ejecutarConsultaParaObtenerTodosLosAlumnos(connection);
            
            while(result.next()) {
                Alumno alumnoLeido = leerAlumno(result);
                alumnos.add(alumnoLeido);
            }
            
            return alumnos.toArray(new Alumno[0]);
            
        } catch (SQLException ex) {
            throw new RuntimeException("error de acceso a la base de datos", ex);
        } finally {
            cerrarRecursosDeBaseDeDatos(connection, result);
        }
    }

    private void cerrarRecursosDeBaseDeDatos(Connection connection, ResultSet result) {
        try {
            if (connection != null) connection.close();
            if (result != null) result.close();
        } catch (SQLException ex) {}
    }

    private ResultSet ejecutarConsultaParaObtenerTodosLosAlumnos(Connection connection) throws SQLException {
        Statement queryTodosLosAlumnos = connection.createStatement();
        ResultSet result = queryTodosLosAlumnos.executeQuery("SELECT * FROM alumno");
        return result;
    }

    private Alumno leerAlumno(ResultSet result) throws SQLException {
        
        final String nombre = result.getString("Nombre");
        final int nota = result.getInt("NotaMedia");
        final String mecanismoNotificacion = result.getString("MecanismoNotificacion");
        final String Direccion = result.getString("Direccion");
        MecanismoDeNotificacion notificacion = null;
        if ("sms".equals(mecanismoNotificacion)) {
             notificacion = MecanismoDeNotificacion.SMS;
        } else {
             notificacion = MecanismoDeNotificacion.MAIL;
        }
        Alumno alumnoLeido = new Alumno(nombre, nota,notificacion, Direccion);
        return alumnoLeido;
        
    }

    private Connection obtenerLaConexion() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/EnvioDeNotas";
        final String usuario = "root";
        final String passwd = "";
        
        final Connection connection = DriverManager.getConnection(url,usuario,passwd);
        return connection;
    }

}
