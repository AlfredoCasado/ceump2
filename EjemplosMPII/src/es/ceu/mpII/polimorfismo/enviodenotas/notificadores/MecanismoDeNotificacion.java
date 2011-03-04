
package es.ceu.mpII.polimorfismo.enviodenotas.notificadores;


public enum MecanismoDeNotificacion {
    
    MAIL("mail"),
    SMS("sms");

    private String notificacion;

    MecanismoDeNotificacion(final String notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public String toString() {
        return notificacion;
    }



}
