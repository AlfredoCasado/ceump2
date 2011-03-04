package es.ceu.mpII.polimorfismo.enviodenotas.repositorio;

import es.ceu.mpII.polimorfismo.enviodenotas.Alumno;

public interface RepositorioAlumnos {

    public Alumno[] dameTodosLosAlumnos();

    public void crear(Alumno alumno);

}
