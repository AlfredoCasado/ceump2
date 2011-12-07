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

        ActualizadorCotizaciones actualizadorCotizaciones = new ActualizadorCotizaciones();
        ActualizadorMovimientos yoodle = new Yoddle();
        ActualizadorMovimientos eurobits = new Eurobits();

        Accion ibm = new Accion(COTIZACION_100_PUNTOS, actualizadorCotizaciones);
        Accion telefonica = new Accion(COTIZACION_10_PUNTOS, actualizadorCotizaciones);

        Set<Inversion> inversionesTecnologicas = new HashSet();
        inversionesTecnologicas.add(new Inversion(UNIDADES_10, ibm, yoodle));
        inversionesTecnologicas.add(new Inversion(UNIDADES_20, telefonica, eurobits));

        Cartera tecnologicas = new Cartera(inversionesTecnologicas);

        assertEquals(1200, tecnologicas.total());

    }

    @Test
    public void actualizacion_carteras() {

        ActualizadorCotizaciones actualizadorCotizaciones = new ActualizadorCotizaciones();
        ActualizadorMovimientos yoodle = new Yoddle();
        ActualizadorMovimientos eurobits = new Eurobits();

        Accion ibm = new Accion(COTIZACION_100_PUNTOS, actualizadorCotizaciones);
        Accion telefonica = new Accion(COTIZACION_10_PUNTOS, actualizadorCotizaciones);

        Set<Inversion> inversionesTecnologicas = new HashSet();
        inversionesTecnologicas.add(new Inversion(UNIDADES_10, ibm, yoodle));
        inversionesTecnologicas.add(new Inversion(UNIDADES_20, telefonica, eurobits));

        Cartera tecnologicas = new Cartera(inversionesTecnologicas);

        tecnologicas.actualizar();

        assertEquals(3000, tecnologicas.total());
    }

}