package es.ceu.mpII.gestor.alumnos.infraestructura;

import es.ceu.mpII.gestor.alumnos.modelo.Alumno;


public interface RepositorioAlumnos {

    public Alumno[] dameTodosLosAlumnos();

    public void crear(Alumno alumno);

}
