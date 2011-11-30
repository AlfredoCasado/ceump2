package es.ceu.mpII.carteras;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccionTest {

    public static final int COTIZACION_100_PUNTOS = 100;
    public static final int COTIZACION_10_PUNTOS = 10;
    public static final int UNIDADES_10 = 10;
    public static final int UNIDADES_20 = 20;

    @Test
    public void calcular_el_valor_para_una_cartera_con_dos_inversiones() {

        Accion ibm = new Accion(COTIZACION_100_PUNTOS);
        Accion telefonica = new Accion(COTIZACION_10_PUNTOS);

        Set<Inversion> inversionesTecnologicas = new HashSet();
        inversionesTecnologicas.add(new Inversion(UNIDADES_10, ibm));
        inversionesTecnologicas.add(new Inversion(UNIDADES_20, telefonica));

        Cartera tecnologicas = new Cartera(inversionesTecnologicas);

        assertEquals(1200, tecnologicas.total());

    }

}