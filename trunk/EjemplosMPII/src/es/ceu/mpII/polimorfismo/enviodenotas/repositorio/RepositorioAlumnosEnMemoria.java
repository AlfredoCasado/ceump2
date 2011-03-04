package es.ceu.mpII.polimorfismo.enviodenotas.repositorio;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;
import es.ceu.mpII.polimorfismo.enviodenotas.notificadores.MecanismoDeNotificacion;

public class RepositorioAlumnosEnMemoria implements RepositorioAlumnos {

    private static Alumno[] alumnos = new Alumno[3];
    
    static {
        alumnos[0] = new Alumno("alfredo", 8 , MecanismoDeNotificacion.MAIL, "acasado@ipsa.es");
        alumnos[1] = new Alumno("pedro", 2, MecanismoDeNotificacion.SMS, "123456789");
        alumnos[2] = new Alumno("julian", 2,MecanismoDeNotificacion.MAIL, "123456789");
    }

    public Alumno[] dameTodosLosAlumnos() {
        return alumnos;
    }

    public void crear(Alumno alumno) {}

}
