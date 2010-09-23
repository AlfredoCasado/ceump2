package es.ceu.mpII.introduccion.ejerciciocargatrenes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaCargaDeTrenesTest {

    @Test
    public void conUnAlmacenConUnaMercanciaYconUnTren() {

        SistemaCargaDeTrenes sistemaCarga = new SistemaCargaDeTrenes();

        Mercancia[] mercancias = new Mercancia[1];
        mercancias[0] = new Mercancia(1);
        Almacen almacen = new Almacen(mercancias);

        Tren[] trenes = new Tren[1];
        trenes[0] = new Tren(1);

        sistemaCarga.cargarTrenes(almacen, trenes);

        assertEquals(1, trenes[0].dameCargaActual());

    }

    @Test
    public void variasMercanciasYVariosTrenes() {
        SistemaCargaDeTrenes sistemaCarga = new SistemaCargaDeTrenes();

        Mercancia[] mercancias = new Mercancia[3];
        mercancias[0] = new Mercancia(1);
        mercancias[1] = new Mercancia(3);
        mercancias[2] = new Mercancia(5);
        Almacen almacen = new Almacen(mercancias);

        Tren[] trenes = new Tren[2];
        trenes[0] = new Tren(4);
        trenes[1] = new Tren(5);

        sistemaCarga.cargarTrenes(almacen, trenes);

        assertFalse(almacen.noEstaVacio());
        assertEquals(4, trenes[0].dameCargaActual());
        assertEquals(5, trenes[1].dameCargaActual());
    
    }
}