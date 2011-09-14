
package es.ceu.mpII.kata.romanos;

import org.junit.Test;
import static org.junit.Assert.*;



public class ConversorRomanoArabigoTest {

    ConversorRomanoArabigo conversor = new ConversorRomanoArabigo();

    @Test
    public void puedeConvertirSimbolosRomanosSimplesANumeros() {
        assertEquals(1, conversor.convertir("I"));
        assertEquals(5, conversor.convertir("V"));
        assertEquals(10, conversor.convertir("X"));
        assertEquals(50, conversor.convertir("L"));
        assertEquals(100, conversor.convertir("C"));
        assertEquals(500, conversor.convertir("D"));
        assertEquals(1000, conversor.convertir("M"));
    }

    @Test public void puedeConvertirSimbolosEspecialesDeDosCaracteres() {
        
        assertEquals(4, conversor.convertir("IV"));
        assertEquals(9, conversor.convertir("IX"));
        assertEquals(40, conversor.convertir("XL"));
        assertEquals(90, conversor.convertir("XC"));
        assertEquals(400, conversor.convertir("CD"));
        assertEquals(900, conversor.convertir("CM"));
    }

    @Test public void puedoConvertirSecuenciasConVariosSimbolosRomanos() {

        assertEquals(2, conversor.convertir("II"));
        assertEquals(3, conversor.convertir("III"));
        assertEquals(1999, conversor.convertir("MCMXCIX"));
    }


}
