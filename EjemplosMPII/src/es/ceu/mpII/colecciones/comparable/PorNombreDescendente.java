package es.ceu.mpII.colecciones.comparable;

import java.util.Comparator;

public class PorNombreDescendente implements Comparator<Usuario> {

    public int compare(Usuario o1, Usuario o2) {
        return o2.nombre().compareTo(o1.nombre());
    }

    

}
