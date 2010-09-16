package es.ceu.mpII.introduccion;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClaseVaciaTest {

    @Test
    public void verificarQueAunqueLaClaseNoDefinaNingunConstructorExplicitamenteJavaCreaUnoPorDefecto() {
        ClaseVacia objetoDeClaseVacia = new ClaseVacia(); // el constructor por defecto que añade java
        assertNotNull(objetoDeClaseVacia);
    }

}