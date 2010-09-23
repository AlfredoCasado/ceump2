package es.ceu.mpII.introduccion.ejerciciocargatrenes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlmacenTest {

    @Test
    public void crearAlmacenConUnaMercancia() {

        Mercancia[] mercancias = new Mercancia[1];
        mercancias[0] = new Mercancia(1);
        Almacen almacen = new Almacen(mercancias);

        assertTrue(almacen.noEstaVacio());
        Mercancia mercancia = almacen.dameLaSiguienteMercancia();
        assertNotNull(mercancia);
        assertFalse(almacen.noEstaVacio());

    }
}