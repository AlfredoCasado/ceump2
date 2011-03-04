package es.ceu.mpII.polimorfismo.enviodenotas.notificadores;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.HistoricoDeNotificaciones;

public class NotificadorSms extends Notificador {

    public NotificadorSms(HistoricoDeNotificaciones historicoNotificaciones) {
        super(historicoNotificaciones);
    }

    public boolean soportasElMecanismoDe(MecanismoDeNotificacion notificacion) {
        return notificacion.equals(MecanismoDeNotificacion.SMS);
    }

    @Override
    public void enviarNotificacionConcreta(Alumno alumno) {
        System.out.println("notificacion por sms enviada a: " + alumno);
    }
}
