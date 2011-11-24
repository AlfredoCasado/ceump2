package es.ceu.mpII.colecciones.comparable;

import java.util.Comparator;

public class PorEdadDescendente implements Comparator<Usuario> {

    public int compare(Usuario o1, Usuario o2) {
        Integer edadPrimerUsuario = o1.edad();
        Integer edadSegundoUsuario = o2.edad();
        return edadSegundoUsuario.compareTo(edadPrimerUsuario);
    }

}
