package es.ceu.mpII.polimorfismo.enviodenotas.notificadores;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;
import java.util.Random;

public class NotificadorMail implements Notificador {

    public boolean soportasElMecanismoDe(MecanismoDeNotificacion notificacion) {
        return notificacion.equals(MecanismoDeNotificacion.MAIL);
    }

    public void enviarNotificacionA(Alumno alumno) throws ExcepcionDeNotificacion {
        Random random = new Random();
        int num = random.nextInt(3);
        if (num == 0) {
            throw new ExcepcionDeNotificacion("el servidor de mail esta roto");
        }

        System.out.println("notificacion por mail enviada a: " + alumno);
    }

}
