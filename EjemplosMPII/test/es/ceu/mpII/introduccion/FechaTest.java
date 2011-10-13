package es.ceu.mpII.introduccion;

import org.junit.Test;
import static org.junit.Assert.*;

public class FechaTest {

    @Test
    public void con_el_constructor_vacio_se_crea_una_fecha_por_defecto() {

        Fecha fecha_por_defecto = new Fecha();
        assertEquals("1/1/1970", fecha_por_defecto.imprimir());

    }

    @Test
    public void con_el_constructor_con_parametros_devuelve_una_fecha_con_esos_parametros() {

        Fecha fecha = new Fecha(1,10,1978);
        assertEquals("1/10/1978", fecha.imprimir());


    }

    @Test
    public void puede_sumar_dias_a_una_fecha() {

        Fecha fecha = new Fecha();
        fecha.sumarDias(1);
        assertEquals("2/1/1970", fecha.imprimir());

    }

}