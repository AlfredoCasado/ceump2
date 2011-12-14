package es.ceu.mpII.transformaciones;

import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TransformacionTest {


    @Test
    public void transformacion_compuesta_de_3_transformaciones() {

        Set<Transformacion> transformaciones = new HashSet();
        transformaciones.add(new TransformacionSubcadena(0,7));
        transformaciones.add(new TransformacionMayusculas());
        transformaciones.add(new TransformacionConcatenar("@gmail.com"));

        TransformacionCompuesta transformacionCompuesta = new TransformacionCompuesta(transformaciones);
        transformacionCompuesta.transformar("alfredo.casado");

        assertEquals("ALFREDO@gmail.com", transformacionCompuesta.transformar("alfredo.casado"));

    }

}