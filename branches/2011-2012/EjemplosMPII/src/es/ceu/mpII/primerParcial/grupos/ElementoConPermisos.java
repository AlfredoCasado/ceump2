package es.ceu.mpII.primerParcial.grupos;

import java.util.HashSet;
import java.util.Set;

public abstract class ElementoConPermisos {

    Set<Permiso> permisos;
    Set<Grupo> gruposALosQuePertenece;

    public ElementoConPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
    }

    public Set<Permiso> damePermisos() {
        Set<Permiso> permisosTotales = new HashSet();

        permisosTotales.addAll(permisos);
        for(Grupo grupoPadre : gruposALosQuePertenece ) {
            permisosTotales.addAll(grupoPadre.damePermisos());
        }

        return permisosTotales;
    }

    public void perteneceA(Grupo g) {
        gruposALosQuePertenece.add(g);
    }


}
