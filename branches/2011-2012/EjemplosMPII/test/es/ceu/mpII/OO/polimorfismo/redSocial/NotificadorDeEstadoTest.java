package es.ceu.mpII.OO.polimorfismo.redSocial;

import org.junit.Test;

public class NotificadorDeEstadoTest {

    @Test
    public void testProcesarNotificacionDeEstado() {

        NotificadorDeEstado notificadorEstado = new NotificadorDeEstado(new Facebook(),
                                                                        new Twitter(),
                                                                        new Linkedin());

        notificadorEstado.procesarNotificacionDeEstado("hola que tal");

    }

}