package es.ceu.mpII.polimorfismo.enviodenotas;

import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.RepositorioAlumnos;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.Notificador;

public class SistemaEnvioNotificaciones {

    public final RepositorioAlumnos repositorioAlumnos;
    public final Notificador[] notificadoresDisponibles;

    public SistemaEnvioNotificaciones(RepositorioAlumnos repositorioAlumnos, Notificador[] notificadoresDisponibles) {
        this.repositorioAlumnos = repositorioAlumnos;
        this.notificadoresDisponibles = notificadoresDisponibles;
    }

    public void enviarNotificaciones() {
        Alumno[] alumnos = repositorioAlumnos.dameTodosLosAlumnos();
        for (Alumno alumno : alumnos) {
            String notificacion = alumno.dimeTuTipoDeNotificacion();
            enviarNotificacion(notificacion, alumno);
        }
    }

    private void enviarNotificacion(String notificacion, Alumno alumno) {
        for (Notificador notificador : notificadoresDisponibles) {
            if (notificador.soportasElMecanismoDe(notificacion)) {
                notificador.enviarNotificacionA(alumno);
            }
        }
    }




}
