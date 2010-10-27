package es.ceu.mpII.javalang;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

enum Dia {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    public Dia siguienteDia() {
        switch(this) {
            case LUNES: return MARTES;
            case MARTES: return MIERCOLES;
            case MIERCOLES : return JUEVES;
            default: return LUNES;
        }

    }

    public boolean esFestivo() {
        return this.equals(Dia.DOMINGO);
    }

}

public class TestEnumerados {

    @Test
    public void testEnumerados() {
        Dia d = Dia.LUNES;

        assertEquals(d.siguienteDia(), Dia.MARTES);
        assertFalse(d.esFestivo());
        assertTrue(Dia.DOMINGO.esFestivo());

        Dia martes = Dia.MARTES;
        Dia lunes = Dia.LUNES;

        assertEquals(lunes.siguienteDia(), martes);
        assertTrue(lunes.siguienteDia() == martes);

       
    }
  
}