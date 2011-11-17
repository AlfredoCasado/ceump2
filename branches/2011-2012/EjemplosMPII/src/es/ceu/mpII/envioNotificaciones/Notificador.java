package es.ceu.mpII.envioNotificaciones;

interface Notificador {

    public boolean soportasEl(TipoNotificador tipoNotificador);

    public void enviar(Alumno alumno);

}
