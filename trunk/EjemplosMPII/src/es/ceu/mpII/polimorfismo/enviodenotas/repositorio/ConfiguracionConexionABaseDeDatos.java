package es.ceu.mpII.polimorfismo.enviodenotas.repositorio;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfiguracionConexionABaseDeDatos {

    private String url = null;
    private String usuario = null;
    private String password = null;

    public String url() {
        if (url == null) {
            leerPropiedadesDeConfiguracionABaseDeDatos();
        }
        return url;
    }

    public String usuario() {
        if (usuario == null) {
            leerPropiedadesDeConfiguracionABaseDeDatos();
        }
        return usuario;
    }

    public String password() {
        if (password == null) {
            leerPropiedadesDeConfiguracionABaseDeDatos();
        }
        return password;
    }

    private void leerPropiedadesDeConfiguracionABaseDeDatos() {
        Properties configuracionDeBaseDeDatos = leerFicheroDePropiedades();

        url = configuracionDeBaseDeDatos.getProperty("url");
        usuario = configuracionDeBaseDeDatos.getProperty("usuario");
        password = configuracionDeBaseDeDatos.getProperty(("password"));
    }

    private Properties leerFicheroDePropiedades() {
        try {
            InputStream is = ProveedorDeConexionesABaseDeDatos.class.getResourceAsStream("/es/ceu/mpII/polimorfismo/enviodenotas/repositorio/configuracion_conexion_base_de_datos.properties");
            Properties configuracionDeBaseDeDatos = new Properties();
            configuracionDeBaseDeDatos.load(is);
            return configuracionDeBaseDeDatos;
        } catch (IOException ex) {
            throw new ConexionABaseDeDatosException("error leyendo el fichero de propiedades", ex);
        }
    }
}
