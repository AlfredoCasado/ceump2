

package es.ceu.mpII.kata.stringcalculator;

import static junit.framework.Assert.*;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void la_cadena_vacia_devuelve_cero() {

        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));

    }

    @Test
    public void si_recibe_un_numero_como_cadena_ese_es_el_resultado() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));

    }

}
