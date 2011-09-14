package es.ceu.mpII.polimorfismo.enviodenotas;

import org.junit.Test;

public class SistemaEnvioNotificacionesTest {

    @Test
    public void verificarQueFuncionaElSistemaDeEnvioDeNotificaciones() {
        SistemaEnvioNotificaciones envioNotificaciones = SistemaEnvioNotificacionesFactory.crearConRepositorioDeAlumnosEnMemoria();
        envioNotificaciones.enviarNotificaciones();
    }
    
    @Test
    public void verificarQueFuncionaElSistemaDeEnvioDeNotificacionesConUnRepositorioEnBaseDeDatos() {
        SistemaEnvioNotificaciones envioNotificaciones = SistemaEnvioNotificacionesFactory.crearConRepositorioDeAlumnosEnBaseDeDatos();
        envioNotificaciones.enviarNotificaciones();

    }


}