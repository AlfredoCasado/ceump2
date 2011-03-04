package es.ceu.mpII.polimorfismo.enviodenotas.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProveedorDeConexionesABaseDeDatos {

    private final ConfiguracionConexionABaseDeDatos configuracionBaseDeDatos;

    public ProveedorDeConexionesABaseDeDatos(ConfiguracionConexionABaseDeDatos configuracionBaseDeDatos) {
        this.configuracionBaseDeDatos = configuracionBaseDeDatos;
    }
    
    public Connection obtenerLaConexion()  {
        return obtenerConexion(configuracionBaseDeDatos.url(),
                               configuracionBaseDeDatos.usuario(), 
                               configuracionBaseDeDatos.password());
    }

    private Connection obtenerConexion(final String url, final String usuario, final String passwd) {
        try {
            return DriverManager.getConnection(url,usuario,passwd);
        } catch (SQLException ex) {
            throw new ConexionABaseDeDatosException("error al conectar a la base de datos, detalles: ", ex);
        }
    }
    
}
