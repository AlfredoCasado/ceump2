
package es.ceu.mpII.kata.maquina;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaquinaExpendedoraTest {
    
    @Test
    public void si_le_doy_el_dinero_exacto_devuelve_una_lista_vacia_de_monedas_de_cambio() {
        
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        
        List<Moneda> cambio = maquina.comprar("coca-cola", 200);

        assertEquals(0, cambio.size());
        
    }



}
