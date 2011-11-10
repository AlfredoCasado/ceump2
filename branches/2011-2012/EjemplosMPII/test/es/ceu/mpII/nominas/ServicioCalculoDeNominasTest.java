package es.ceu.mpII.nominas;

import org.junit.Test;

public class ServicioCalculoDeNominasTest {

    @Test
    public void testCalcularTodasLasNominas() {

        ServicioCalculoDeNominas calculoNominas = new ServicioCalculoDeNominas(new ListadoEmpleados());
        calculoNominas.calcularTodasLasNominas();
    }

}