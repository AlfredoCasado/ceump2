package es.ceu.mpII.unitTesting;

import org.junit.Test;
import static org.junit.Assert.*;


public class TachadorPalabrasTest {
    
    TachadorPalabras tachadorPalabras = new TachadorPalabras();
    
    @Test
    public void puedeTacharUnaPalabraConDosLetras() {
        String fraseTachada = tachadorPalabras.tachar("en un lugar", "en");      
        assertEquals("xx un lugar", fraseTachada);
    }
    
    @Test
    public void puedeTacharUnaPalabraConCincoLetras() {
        String fraseTachada = tachadorPalabras.tachar("en un lugar", "lugar");
        assertEquals("en un xxxxx", fraseTachada);
    }
    
    @Test
    public void puedeTacharVariasPalabras() {
        String fraseTachada = tachadorPalabras.tachar("en un lugar", "en", "un");
        assertEquals("xx xx lugar", fraseTachada);
    }
    
    
}
