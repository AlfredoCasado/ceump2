package es.ceu.mpII.primerParcial.grupos;

import java.util.Set;

class Grupo extends ElementoConPermisos {

    Set<ElementoConPermisos> elementosQueContiene;
    String nombre;

    public Grupo(String nombre, Set<Permiso> permisos, Set<ElementoConPermisos> elementosQueContiene) {
        super(permisos);

        for (ElementoConPermisos elemento : elementosQueContiene) {
            elemento.perteneceA(this);
        }

        this.nombre = nombre;
    }




}
