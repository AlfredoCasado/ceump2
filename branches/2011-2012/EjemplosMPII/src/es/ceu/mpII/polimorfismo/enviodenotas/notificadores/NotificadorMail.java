package es.ceu.mpII.polimorfismo.enviodenotas.notificadores;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.HistoricoDeNotificaciones;

public class NotificadorMail extends Notificador {

    public NotificadorMail(HistoricoDeNotificaciones historicoNotificaciones) {
        super(historicoNotificaciones);
    }

    public boolean soportasElMecanismoDe(MecanismoDeNotificacion notificacion) {
        return notificacion.equals(MecanismoDeNotificacion.MAIL);
    }

    @Override
    public void enviarNotificacionConcreta(Alumno alumno) {
        System.out.println("notificacion por mail enviada a: " + alumno);
    }

}
