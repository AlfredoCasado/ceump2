package es.ceu.mpII.transformacioncadenas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

public class TransformacionesCadenasTest {

    @Test
    public void deberiaRealizarUnaTransformacionCompuesta() {
        Transformacion[] transformaciones = new Transformacion[3];
        transformaciones[0] = new TransformacionSubcadena(0,7);
        transformaciones[1] = new TransformacionMayusculas();
        transformaciones[2] = new TransformacionConcatenar("@gmail.es");

        TransformacionCompuesta transformacionCompuesta = new TransformacionCompuesta(transformaciones);
        final String resultado = transformacionCompuesta.transformar("alfredo.casado");

        assertEquals("ALFREDO@gmail.es", resultado);
    }
}