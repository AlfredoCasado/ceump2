package es.ceu.mpII.polimorfismo.enviodenotas;

import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.ExcepcionDeNotificacion;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.MecanismoDeNotificacion;
import es.ceu.mpII.polimorfismo.enviodenotas.repositorio.RepositorioAlumnos;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.Notificador;
import org.apache.log4j.Logger;

public class SistemaEnvioNotificaciones {

    private static Logger log = Logger.getLogger(SistemaEnvioNotificaciones.class);
  
    public final RepositorioAlumnos repositorioAlumnos;
    public final Notificador[] notificadoresDisponibles;

    public SistemaEnvioNotificaciones(RepositorioAlumnos repositorioAlumnos, Notificador[] notificadoresDisponibles) {
        this.repositorioAlumnos = repositorioAlumnos;
        this.notificadoresDisponibles = notificadoresDisponibles;
    }

    public void enviarNotificaciones() {
        Alumno[] alumnos = repositorioAlumnos.dameTodosLosAlumnos();
        for (Alumno alumno : alumnos) {
            MecanismoDeNotificacion notificacion = alumno.dimeTuTipoDeNotificacion();
            enviarNotificacion(notificacion, alumno);
        }
    }

    private void enviarNotificacion(MecanismoDeNotificacion notificacion, Alumno alumno)  {
        try {
    
            for (Notificador notificador : notificadoresDisponibles) {
                if (notificador.soportasElMecanismoDe(notificacion)) {
                    notificador.enviarNotificacionA(alumno);
                }
            }
            log.info("mensaje enviado al usuario: " + alumno);
        } catch (ExcepcionDeNotificacion ex) {
            log.error("error enviando notificacion a:" + alumno, ex);
        } 
    }
}
