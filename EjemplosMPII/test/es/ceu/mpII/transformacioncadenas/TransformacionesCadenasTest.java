package es.ceu.mpII.transformacioncadenas;

import es.ceu.mpII.polimorfismo.transformacioncadenas.TransformacionCompuesta;
import es.ceu.mpII.polimorfismo.transformacioncadenas.Transformacion;
import es.ceu.mpII.polimorfismo.transformacioncadenas.TransformacionMayusculas;
import es.ceu.mpII.polimorfismo.transformacioncadenas.TransformacionSubcadena;
import es.ceu.mpII.polimorfismo.transformacioncadenas.TransformacionConcatenar;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

public class TransformacionesCadenasTest {

    @Test
    public void deberiaRealizarUnaTransformacionCompuesta() {
        Transformacion[] transformaciones = new Transformacion[3];
        transformaciones[0] = new TransformacionSubcadena(0,300);
        transformaciones[1] = new TransformacionMayusculas();
        transformaciones[2] = new TransformacionConcatenar("@gmail.es");

        TransformacionCompuesta transformacionCompuesta = new TransformacionCompuesta(transformaciones);
        final String resultado = transformacionCompuesta.transformar("alfredo.casado");

        assertEquals("ALFREDO@gmail.es", resultado);
    }
}