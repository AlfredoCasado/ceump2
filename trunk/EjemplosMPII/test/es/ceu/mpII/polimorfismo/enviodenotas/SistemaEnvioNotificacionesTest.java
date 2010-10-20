package es.ceu.mpII.polimorfismo.enviodenotas;

import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.Notificador;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.NotificadorMail;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.NotificadorSms;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.RepositorioAlumnosEnMemoria;
import org.junit.Test;

public class SistemaEnvioNotificacionesTest {

    @Test
    public void verificarQueFuncionaElSistemaDeEnvioDeNotificaciones() {

        Notificador[] notificadores = new Notificador[2];
        notificadores[0] = new NotificadorMail();
        notificadores[1] = new NotificadorSms();

        SistemaEnvioNotificaciones envioNotificaciones =
                new SistemaEnvioNotificaciones(new RepositorioAlumnosEnMemoria(),
                                               notificadores);

        envioNotificaciones.enviarNotificaciones();
    }


}