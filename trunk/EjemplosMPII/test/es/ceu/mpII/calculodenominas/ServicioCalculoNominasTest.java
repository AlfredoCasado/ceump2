package es.ceu.mpII.calculodenominas;

import org.junit.Test;

public class ServicioCalculoNominasTest {

    @Test
    public void probarElCalculoDeNominas() {
        ServicioCalculoNominas servicioCalculoNominas = new ServicioCalculoNominas(new RepositorioEmpleados());
        servicioCalculoNominas.pintarLasNominasDeLosEmpleados();
    }
}