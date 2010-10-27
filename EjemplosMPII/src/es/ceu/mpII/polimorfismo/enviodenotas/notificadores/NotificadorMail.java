package es.ceu.mpII.polimorfismo.enviodenotas.notificadores;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;

public class NotificadorMail implements Notificador {

    public boolean soportasElMecanismoDe(MecanismoDeNotificacion notificacion) {
        return notificacion.equals(MecanismoDeNotificacion.MAIL);
    }

    public void enviarNotificacionA(Alumno alumno) {
        System.out.println("notificacion por mail enviada a: " + alumno);
    }

}
