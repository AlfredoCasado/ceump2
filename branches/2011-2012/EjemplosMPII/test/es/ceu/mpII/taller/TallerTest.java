package es.ceu.mpII.taller;

import java.util.Set;
import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TallerTest {

    @Test
    public void testGananciasTotales() {
        Taller taller = crearTaller();
        assertEquals(30, taller.gananciasTotales());
    }

    @Test
    public void testPorcentajeVehiculosDiesel() {
       Taller taller = crearTaller();
       assertEquals(50, taller.porcentajeCochesDiesel());
    }

    @Test
    public void testPedirGastoDeClienteExistente() {
       Taller taller = crearTaller();
       assertEquals(30, taller.gastoDeCliente("alfredo"));

    }

    @Test
    public void testPedirGastoDeClienteNoExistente() {
       Taller taller = crearTaller();
       try {
         taller.gastoDeCliente("cliente que no existe");
         fail("deberia lanzar la excepcion esperada");
       } catch(ClienteNoEncontradoExcepcion e) {
         assertTrue(true);
       }

    }

    private Taller crearTaller() {
        Set<Vehiculo> vehiculos = new HashSet();
        vehiculos.add(new Vehiculo(new MotorDiesel()));
        vehiculos.add(new Vehiculo(new MotorGasolina()));
        
        Set<Reparacion> reparaciones = new HashSet();

        reparaciones.add(new Reparacion(10, "10 de enero", "cambio de ruedas"));
        reparaciones.add(new Reparacion(20, "14 de enero", "cambio de ruedas"));

        HistorialReparaciones historial = new HistorialReparaciones(reparaciones);
        Set<Cliente> clientes = new HashSet();

        clientes.add(new Cliente(historial, vehiculos, "alfredo"));
        Taller taller = new Taller(clientes);
        return taller;
    }

}