package es.ceu.mpII.polimorfismo.enviodenotas;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.MecanismoDeNotificacion;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.ConfiguracionConexionABaseDeDatos;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.ProveedorDeConexionesABaseDeDatos;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.RepositorioAlumnos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaEnvioNotificacionesBDTest {
        
    RepositorioAlumnos repositorioAlumnos = SistemaEnvioNotificacionesFactory.crearRepositorioAlumnosEnBaseDeDatos();
    
    @Before
    public void borrarBaseDeDatos() throws SQLException {
        Connection conexion = new ProveedorDeConexionesABaseDeDatos(new ConfiguracionConexionABaseDeDatos()).obtenerLaConexion();
        Statement query = conexion.createStatement();
        query.executeUpdate("DELETE FROM Alumno");
        query.executeUpdate("DELETE FROM HistoricoNotificaciones");
        query.close();
        conexion.close();
    }
    
    @Test public void 
    si_hay_un_alumno_al_que_enviar_notificaciones_la_envia_correctamente_y_queda_reflejado_en_el_historico() throws Exception {
        
        //arrange o given
        Alumno alfredo = new Alumno("alfredo", 10, MecanismoDeNotificacion.MAIL, "casado.alfredo@gmail.com");
        crearAlumnos(alfredo);
        
        // act o where
        SistemaEnvioNotificaciones envioNotificaciones = SistemaEnvioNotificacionesFactory.crearConRepositorioDeAlumnosEnBaseDeDatos();
        envioNotificaciones.enviarNotificaciones();
        
        // assert o then
        assertTrue("no se ha encontrado ninguna entrada en el historico para el usuario", 
                   historicoTieneUnaEntradaParaElUsuario("alfredo"));
    }
    
    @Test public void 
    si_varios_un_alumnos_a_los_que_enviar_notificaciones_las_envia_correctamente_y_queda_reflejado_en_el_historico() throws Exception {
        
        //arrange o given
        Alumno alfredo = new Alumno("alfredo", 10, MecanismoDeNotificacion.MAIL, "casado.alfredo@gmail.com");
        Alumno pedro = new Alumno("pedro", 10, MecanismoDeNotificacion.MAIL, "pedro.alfredo@gmail.com");
        Alumno juan = new Alumno("juan", 10, MecanismoDeNotificacion.SMS, "juan.alfredo@gmail.com");
        crearAlumnos(alfredo,pedro,juan);
        
        // act o where
        SistemaEnvioNotificaciones envioNotificaciones = SistemaEnvioNotificacionesFactory.crearConRepositorioDeAlumnosEnBaseDeDatos();
        envioNotificaciones.enviarNotificaciones();
        
        // assert o then
        assertTrue("no se ha encontrado ninguna entrada en el historico para el usuario", 
                   historicoTieneUnaEntradaParaElUsuario("alfredo"));
        assertTrue("no se ha encontrado ninguna entrada en el historico para el usuario", 
                   historicoTieneUnaEntradaParaElUsuario("pedro"));
        assertTrue("no se ha encontrado ninguna entrada en el historico para el usuario", 
                   historicoTieneUnaEntradaParaElUsuario("juan"));
    }
    
    private void crearAlumnos(Alumno...alumnos) {
        for (Alumno alumno : alumnos) {
            repositorioAlumnos.crear(alumno);
        }
    }
    
    private boolean historicoTieneUnaEntradaParaElUsuario(final String nombreUsuario) throws Exception {
      
        Connection connection = null;
        PreparedStatement queryHistorico = null;
        ResultSet result = null;
        try {
            connection = new ProveedorDeConexionesABaseDeDatos(new ConfiguracionConexionABaseDeDatos()).obtenerLaConexion();
            queryHistorico = connection.prepareStatement("SELECT * FROM HistoricoNotificaciones WHERE Nombre = ?");
            queryHistorico.setString(1, nombreUsuario);
            result = queryHistorico.executeQuery();
            return result.next();
        } finally {
            connection.close();
            queryHistorico.close();
            result.close();
        }
        
    }
            
}
