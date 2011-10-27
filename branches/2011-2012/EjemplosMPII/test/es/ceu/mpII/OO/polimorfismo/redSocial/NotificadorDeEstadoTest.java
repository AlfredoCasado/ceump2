package es.ceu.mpII.OO.polimorfismo.redSocial;

import es.ceu.mpII.OO.polimorfismo.redSocial.Linkedin;
import es.ceu.mpII.OO.polimorfismo.redSocial.Facebook;
import es.ceu.mpII.OO.polimorfismo.redSocial.Twitter;
import es.ceu.mpII.OO.polimorfismo.redSocial.NotificadorDeEstado;
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