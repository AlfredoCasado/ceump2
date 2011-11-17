package es.ceu.mpII.envioNotificaciones;

public class NoficadorMail implements Notificador {

    public boolean soportasEl(TipoNotificador tipoNotificador) {
        return tipoNotificador.equals(TipoNotificador.MAIL);
    }

    public void enviar(Alumno alumno) {
        System.out.println("enviando mail...");
    }



}
