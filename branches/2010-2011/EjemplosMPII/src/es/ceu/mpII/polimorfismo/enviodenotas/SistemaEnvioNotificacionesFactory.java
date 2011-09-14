package es.ceu.mpII.polimorfismo.enviodenotas;

import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.Notificador;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.NotificadorMail;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.NotificadorSms;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.ConfiguracionConexionABaseDeDatos;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.HistoricoDeNotificaciones;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.ProveedorDeConexionesABaseDeDatos;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.RepositorioAlumnos;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.RepositorioAlumnosEnMemoria;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.RepositorioDeAlumnosEnBaseDeDatos;

public class SistemaEnvioNotificacionesFactory {
    
    public static SistemaEnvioNotificaciones crearConRepositorioDeAlumnosEnBaseDeDatos() {
        
        final ConfiguracionConexionABaseDeDatos configuracionBaseDeDatos = new ConfiguracionConexionABaseDeDatos();
        final ProveedorDeConexionesABaseDeDatos proveedorConexiones = new ProveedorDeConexionesABaseDeDatos(configuracionBaseDeDatos);
        final HistoricoDeNotificaciones historico = new HistoricoDeNotificaciones(proveedorConexiones);
        
        Notificador[] notificadores = new Notificador[2];
        notificadores[0] = new NotificadorMail(historico);
        notificadores[1] = new NotificadorSms(historico);

        return new SistemaEnvioNotificaciones(new RepositorioDeAlumnosEnBaseDeDatos(proveedorConexiones), notificadores);
    }
    
    public static SistemaEnvioNotificaciones crearConRepositorioDeAlumnosEnMemoria() {
        
        final ConfiguracionConexionABaseDeDatos configuracionBaseDeDatos = new ConfiguracionConexionABaseDeDatos();
        final ProveedorDeConexionesABaseDeDatos proveedorConexiones = new ProveedorDeConexionesABaseDeDatos(configuracionBaseDeDatos);
        final HistoricoDeNotificaciones historico = new HistoricoDeNotificaciones(proveedorConexiones);
        
        Notificador[] notificadores = new Notificador[2];
        notificadores[0] = new NotificadorMail(historico);
        notificadores[1] = new NotificadorSms(historico);
        
        return new SistemaEnvioNotificaciones(new RepositorioAlumnosEnMemoria(), notificadores);
    }
    
    public static RepositorioAlumnos crearRepositorioAlumnosEnBaseDeDatos() {
        final ConfiguracionConexionABaseDeDatos configuracionBaseDeDatos = new ConfiguracionConexionABaseDeDatos();
        final ProveedorDeConexionesABaseDeDatos proveedorConexiones = new ProveedorDeConexionesABaseDeDatos(configuracionBaseDeDatos);
        return new RepositorioDeAlumnosEnBaseDeDatos(proveedorConexiones);
    }

}
