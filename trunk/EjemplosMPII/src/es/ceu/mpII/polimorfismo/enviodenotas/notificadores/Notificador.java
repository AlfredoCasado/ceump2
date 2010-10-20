package es.ceu.mpII.polimorfismo.enviodenotas.notificadores;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;

public interface Notificador {

    public boolean soportasElMecanismoDe(String notificacion);

    public void enviarNotificacionA(Alumno alumno);

}
