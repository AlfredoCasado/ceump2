package es.ceu.mpII.polimorfismo.enviodenotas.notificadores;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.HistoricoDeNotificaciones;

public abstract class Notificador {

    private final HistoricoDeNotificaciones historicoNotificaciones;

    public Notificador(HistoricoDeNotificaciones historicoNotificaciones) {
        this.historicoNotificaciones = historicoNotificaciones;
    }

    public abstract boolean soportasElMecanismoDe(MecanismoDeNotificacion notificacion);

    public void enviarNotificacionA(Alumno alumno) throws ExcepcionDeNotificacion {
        enviarNotificacionConcreta(alumno);
        historicoNotificaciones.registrarNotificacionA(alumno);
    }

    public abstract void enviarNotificacionConcreta(Alumno alumno);

}
