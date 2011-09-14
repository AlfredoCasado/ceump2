package es.ceu.mpII.introduccion;

import org.junit.Test;
import static org.junit.Assert.*;

public class ControlDeFlujoTest {

    @Test
    public void pruebaIf() {
        int numeroDeAlumnos = 7;

        if (numeroDeAlumnos == 7) {
            assertTrue(true);
        } else {
            fail("el if no funciona???");
        }
    }

    @Test
    public void pruebaWhile() {

        int numeroDeAlumnos = 0;
        while (numeroDeAlumnos < 7) {
            numeroDeAlumnos++;
        }

        assertEquals(7, numeroDeAlumnos);
    }

    @Test
    public void pruebaDoWhile() {
        int numeroDeAlumnos = 7;
        do {
            numeroDeAlumnos--;
        } while (numeroDeAlumnos > 0);

        assertEquals(0, numeroDeAlumnos);
    }

    @Test
    public void pruebaFor() {
        int numeroDeAlumnos = 0;
        for (int i = 0; i < 10; i++) {
            numeroDeAlumnos++;
        }

        assertEquals(10, numeroDeAlumnos);
    }

    @Test
    public void pruebaSwitch() {

        switch(2) {
            case 1: {
                    fail("era 2!!");

            }
            case 2: assertTrue(true); break;
            default: fail("era 2");
        }

    }

}