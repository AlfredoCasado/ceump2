package es.ceu.mpII.envioNotificaciones;

public class SistemaEnvioNotificaciones {

    private RepositorioAlumnos repoAlumnos;
    private Notificador[] notificadores;

    public SistemaEnvioNotificaciones(RepositorioAlumnos repoAlumnos, Notificador[] notificadores) {
        this.repoAlumnos = repoAlumnos;
        this.notificadores = notificadores;
    }

    public void enviarNotificaciones() {
        Alumno[] alumnos = repoAlumnos.dameTodos();

        for (Alumno alumno : alumnos) {
            enviarNotificacionA(alumno);
        }
    }

    private void enviarNotificacionA(Alumno alumno) {
        TipoNotificador tipoNotificador = alumno.tipoNotificador();
        for (Notificador notificador : notificadores) {
            if (notificador.soportasEl(tipoNotificador)) {
                notificador.enviar(alumno);
                return;
            }
        }
    }

}
