package es.ceu.mpII.excepciones;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExcepcionesTest {

    @Test
    public void comoCapturarUnaExcepcion() {
        try {
            funcionQueLanzaUnaExcepcion();
        } catch (MiExceptionChecked e) {
            System.out.println("excepcion capturada: " + e.getMessage());
            return;
        } catch (Exception e) {
        } finally {
            System.out.println("me ejecuto siempre!");
        }
        fail("deberia capturar una excepcion");
    }

    private void funcionQueLanzaUnaExcepcion() {
        throw new MiExceptionChecked("mensaje que yo quiera");
    }

    @Test
    public void pruebafinally() {
        assertEquals("java esta mal", 2, funcionRaraconfinally());
    }

    @Test
    public void usarExcepcionesParaControlarElflujoDeEjecucion() {
        final String[] cadenas = new String[3];
        cadenas[0] = "hola";
        cadenas[1] = "adios";
        cadenas[2] = "hasta luego";

        try {
            int i = 0;
            while (true) {
                System.out.println(cadenas[i++]);
            }
        } catch (IndexOutOfBoundsException e) {}

    }

    private int funcionRaraconfinally() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            return 1;
        } finally {
            return 2;
        }
    }

    @Test
    public void relanzarExcepcionIncluyendoLaExcepcionOriginalComoCausa() {
        try {
            throw new RuntimeException("excepcion origen");
        } catch (RuntimeException e) {
            throw new RuntimeException("excepcion que incluye a la anterior como causa",e);
        }
    }
}

class MiExceptionChecked extends RuntimeException {
    public MiExceptionChecked(String message) {
        super(message);
    }
}
