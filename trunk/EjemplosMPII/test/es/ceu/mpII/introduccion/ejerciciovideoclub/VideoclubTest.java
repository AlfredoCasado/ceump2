package es.ceu.mpII.introduccion.ejerciciovideoclub;

import org.junit.Test;
import static org.junit.Assert.*;

public class VideoclubTest {
    
    @Test
    public void elVideoclubTieneLaPeliculaYAdemasTieneCopiasDisponibles() {
        Videoclub videoclub = crearVideoclub();

        Pelicula pelicula = videoclub.dameLaPeliculaSiEstaDisponible("Up");
        assertNotNull(pelicula.dameUnaCopiaSiHayDisponibles());
    }

    @Test
    public void debeSerCapazDeBuscarUnCliente() {
        Videoclub videoclub = crearVideoclub();
        
        Cliente alfredo = videoclub.buscarClientePorNombre("alfredo");
        assertNotNull(alfredo);

        Cliente clienteQueNoExiste = videoclub.buscarClientePorNombre("noExiste");
        assertNull(clienteQueNoExiste);
    }

    @Test
    public void debeSerCapazDeRegistrarUnAlquiler() {
        Videoclub videoclub = crearVideoclub();

        Pelicula pelicula = videoclub.dameLaPeliculaSiEstaDisponible("Up");
        Copia copia = pelicula.dameUnaCopiaSiHayDisponibles();

        Cliente cliente = videoclub.buscarClientePorNombre("alfredo");
        cliente.realizarAlquiler(copia, 3);
        assertEquals(1, cliente.alquilereRealizados());
    }
    
    @Test
    public void debeSerCapazDeImprimirUnInformeDeAlquileresPorCliente() {
        Videoclub videoclub = crearVideoclub();

        Pelicula pelicula = videoclub.dameLaPeliculaSiEstaDisponible("Up");
        Copia copia = pelicula.dameUnaCopiaSiHayDisponibles();
        Cliente cliente = videoclub.buscarClientePorNombre("alfredo");

        cliente.realizarAlquiler(copia, 3);
        cliente.realizarAlquiler(copia, 2);

        cliente.pintarInformeDeAlquileresRealizados("texto");
        cliente.pintarInformeDeAlquileresRealizados("html");
    }

    private Videoclub crearVideoclub() {
        PintorInformes[] pintores = new PintorInformes[2];
        pintores[0] = new PintorInformesEnTexto();
        pintores[1] = new PintorInformesHtml();

        Copia[] copiasDisponibles = new Copia[1];
        copiasDisponibles[0] = new Copia(true);

        Pelicula[] peliculasDisponibles = new Pelicula[1];
        peliculasDisponibles[0] = new Pelicula("Up", copiasDisponibles);

        Cliente[] clientesDelVideoclub = new Cliente[1];
        clientesDelVideoclub[0] = new Cliente("alfredo", pintores);

        return new Videoclub(peliculasDisponibles, clientesDelVideoclub);
    }

}