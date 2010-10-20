package es.ceu.mpII.polimorfismo.enviodenotas.repositorio;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;

public class RepositorioAlumnosEnMemoria implements RepositorioAlumnos {

    private static Alumno[] alumnos = new Alumno[3];
    
    static {
        alumnos[0] = new Alumno("alfredo", 8 , "mail", "acasado@ipsa.es");
        alumnos[1] = new Alumno("pedro", 2, "sms", "123456789");
        alumnos[2] = new Alumno("julian", 2, "sms", "123456789");
    }

    public Alumno[] dameTodosLosAlumnos() {
        return alumnos;
    }

}
