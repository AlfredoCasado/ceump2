
package es.ceu.mpII.examenSegundoParcial;

import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContadorDeLineasTest {

    @Test
    public void siLePasoUnFicheroConVariasLineasQueContienenLaPalabraHolaLasDevuelvo() throws IOException {

        FileWriter writer = new FileWriter("ficheroTest.txt");
        writer.write("hola\n");
        writer.write("adios\n");
        writer.close();

        ContadorDeLineas contador = new ContadorDeLineas(new File("ficheroTest.txt"));

        List<String> lineasDetectadasQueContieneLaPalabra = contador.lineasEnLasQueApareceLa("hola");

        assertEquals(1, lineasDetectadasQueContieneLaPalabra.size());
        assertTrue(lineasDetectadasQueContieneLaPalabra.contains("hola"));
        assertTrue(new File("ficheroTest.txt").delete());

    }

    @Test
    public void siLePasoUnFicheroVacioDevuelveUnaListaVacia() throws IOException {

        FileWriter writer = new FileWriter("ficheroTest.txt");
        writer.close();
        ContadorDeLineas contador = new ContadorDeLineas(new File("ficheroTest.txt"));

        assertEquals(0,contador.lineasEnLasQueApareceLa("hola").size());
    }

    @Test(expected=IllegalArgumentException.class)
    public void siLePasoUnFicheroQueNoExisteMeDevuelveUnaExcepcion() {
        new ContadorDeLineas(new File("fichero que no existe"));
    }

}
