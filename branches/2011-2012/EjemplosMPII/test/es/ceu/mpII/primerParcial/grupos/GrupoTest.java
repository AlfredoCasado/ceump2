package es.ceu.mpII.primerParcial.grupos;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

public class GrupoTest {


    private Set<Permiso> permisos(String...nombres) {
        Set<Permiso> permisos = new HashSet();

        for (String permiso : nombres) {
            permisos.add(new Permiso(permiso));
        }

        return permisos;
    }

    @Test
    public void testDamePermisosConUnSoloGrupo() {
        Grupo all = new Grupo("all", permisos("A"), new HashSet());

        assertEquals(permisos("A"), all.damePermisos());
    }

    @Test
    public void testDamePermisosConUnGrupoYUnUsuario() {
        Set<ElementoConPermisos> elmentosQueContieneAll = new HashSet();
        Usuario alfredo = new Usuario("alfredo", permisos("A","B","D"));
        elmentosQueContieneAll.add(alfredo);

        Grupo all = new Grupo("all", permisos("A","B","C"), elmentosQueContieneAll);

        assertEquals(permisos("A","B","C","D"), alfredo.damePermisos());
    }



}