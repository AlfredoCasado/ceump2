package es.ceu.mpII.colecciones.comparable;

import java.util.Comparator;

public class Usuario implements Comparable<Usuario> {

    private final String nombre;
    private final int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int edad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " edad: " + edad;
    }

    String nombre() {
        return nombre;
    }

    public int compareTo(Usuario o) {
        return nombre().compareTo(o.nombre());
    }

    static class PorEdadDescendente implements Comparator<Usuario> {
        public int compare(Usuario o1, Usuario o2) {
            Integer edadPrimerUsuario = o1.edad();
            Integer edadSegundoUsuario = o2.edad();
            return edadSegundoUsuario.compareTo(edadPrimerUsuario);
        }
    }
}

