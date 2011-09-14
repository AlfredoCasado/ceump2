package es.ceu.mpII.introduccion;

import org.junit.Test;
import static org.junit.Assert.*;
public class OperadoresTest {

    @Test
    public void pruebaMasIgual() {
        int unEntero = 7;
        int otroEntero = 7;

        unEntero = unEntero + 2;
        otroEntero += 2;

        assertEquals(unEntero, otroEntero);
    }

    @Test
    public void pruebaMenosIgual() {
        int unEntero = 7;
        int otroEntero = 7;

        unEntero = unEntero - 2;
        otroEntero -= 2;

        assertEquals(unEntero, otroEntero);
    }

    @Test
    public void pruebaNegacion() {
        boolean bool = true;
        assertEquals(false, !bool);
    }

    @Test
    public void pruebaOperadorAnd() {
        boolean verdadero = true;
        boolean falso = false;

        assertEquals(false, verdadero && falso);
    }


}