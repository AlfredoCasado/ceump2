package es.ceu.mpII.javalang;

import org.junit.Test;
import static org.junit.Assert.*;



public class EqualTest {

    @Test
    public void pruebaEquals() {
        Direccion a = new Direccion("MADRID", "CASTELLANA");
        Direccion b = new Direccion("MADRID", "CASTELLANA");

        assertFalse(a == b);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());


    }
}