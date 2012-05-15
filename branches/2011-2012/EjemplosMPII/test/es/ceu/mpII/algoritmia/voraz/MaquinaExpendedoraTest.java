package es.ceu.mpII.algoritmia.voraz;

import java.util.List;
import org.junit.Test;   
import static org.junit.Assert.*;

public class MaquinaExpendedoraTest {

    MaquinaExpendedora maquina = new MaquinaExpendedora();
    
    @Test
    public void si_le_doy_el_dinero_exacto_devuelve_una_lista_vacia_de_monedas_de_cambio() {
        List<Moneda> cambio = maquina.comprar("coca-cola", 60);
        assertEquals(0, cambio.size());
    }

    @Test
    public void si_el_cambio_es_de_140_me_tiene_que_devolver_euro_20c_y_20c() {
        List<Moneda> cambio = maquina.comprar("coca-cola", 200);
        assertEquals(3, cambio.size());
        assertEquals(Moneda.UN_EURO, cambio.get(0));
        assertEquals(Moneda.VEINTE, cambio.get(1));
        assertEquals(Moneda.VEINTE, cambio.get(2));

    }




}
