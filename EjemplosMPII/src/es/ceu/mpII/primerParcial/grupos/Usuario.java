package es.ceu.mpII.primerParcial.grupos;

import java.util.Set;

public class Usuario extends ElementoConPermisos{

    private String nombre;

    public Usuario(String nombre, Set<Permiso> permisos) {
        super(permisos);
        this.nombre = nombre;

    }

}
