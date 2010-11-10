package es.ceu.mpII.polimorfismo.enviodenotas.notificadores;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;

public interface Notificador {

    public boolean soportasElMecanismoDe(MecanismoDeNotificacion notificacion);

    public void enviarNotificacionA(Alumno alumno) throws ExcepcionDeNotificacion;

}
