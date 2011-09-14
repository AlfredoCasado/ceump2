package es.ceu.mpII.introduccion.ejerciciocargatrenes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlmacenTest {

    @Test
    public void crearAlmacenConUnaMercancia() {

        Set<Mercancia> mercancias = new TreeSet();
        mercancias.add(new Mercancia(1));
        Almacen almacen = new Almacen(mercancias);

        assertTrue(almacen.noEstaVacio());
        Mercancia mercancia = almacen.dameLaSiguienteMercancia();
        assertNotNull(mercancia);
        assertFalse(almacen.noEstaVacio());

    }
}