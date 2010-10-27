package es.ceu.mpII.javalang;


public class Alumno implements Cloneable {

    private String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}
