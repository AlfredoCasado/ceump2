

package es.ceu.mpII.polimorfismo.enviodenotas.repositorio;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class HistoricoDeNotificaciones {

    public void registrarNotificacionA(Alumno alumno) {
        Connection connection = null;
        PreparedStatement insercionHistorico = null;
        try {
            connection = obtenerLaConexion();
            insercionHistorico = connection.prepareStatement("INSERT INTO HistoricoNotificaciones(Nombre,TipoNotificacion,FechaEnvio) VALUES(?,?,?)");
            insercionHistorico.setString(1, alumno.nombre());
            insercionHistorico.setString(2, alumno.dimeTuTipoDeNotificacion().toString());
            insercionHistorico.setString(3, String.valueOf(new Date().getTime()));
            insercionHistorico.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("error al escribir el historico", ex);
        } finally {
            try {
                if (insercionHistorico != null) {
                    insercionHistorico.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException ex) {}
        }

    }

     private Connection obtenerLaConexion() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/EnvioDeNotas";
        final String usuario = "root";
        final String passwd = "";

        final Connection connection = DriverManager.getConnection(url,usuario,passwd);
        return connection;
    }

}
