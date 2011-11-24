package es.ceu.mpII.colecciones.comparable;

import java.util.Comparator;

public class PorNombreAscendente implements Comparator<Usuario> {

    public int compare(Usuario o1, Usuario o2) {
        return o1.nombre().compareTo(o2.nombre());
    }

    

}
