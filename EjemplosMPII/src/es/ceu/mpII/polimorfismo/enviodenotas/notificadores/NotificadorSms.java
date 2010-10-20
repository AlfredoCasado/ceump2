package es.ceu.mpII.polimorfismo.enviodenotas.notificadores;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;


public class NotificadorSms implements Notificador {

    public boolean soportasElMecanismoDe(String notificacion) {
        return notificacion.equals("sms");
    }

    public void enviarNotificacionA(Alumno alumno) {
        System.out.println("notificacion por sms enviada a: " + alumno);
    }

}
