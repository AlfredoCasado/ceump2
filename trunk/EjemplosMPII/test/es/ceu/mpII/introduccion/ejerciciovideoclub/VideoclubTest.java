package es.ceu.mpII.introduccion.ejerciciovideoclub;

import org.junit.Test;
import static org.junit.Assert.*;

public class VideoclubTest {
    
    @Test
    public void elVideoclubTieneLaPeliculaYAdemasTieneCopiasDisponibles() {
        
        Copia[] copiasDisponibles = new Copia[1];
        copiasDisponibles[0] = new Copia(true);
         
        Pelicula[] peliculasDisponibles = new Pelicula[1];
        peliculasDisponibles[0] = new Pelicula("Up", copiasDisponibles);
        
        Videoclub videoclub = new Videoclub(peliculasDisponibles);

        Pelicula pelicula = videoclub.dameLaPeliculaSiEstaDisponible("Up");
        assertTrue(pelicula.hayCopiasDisponiblesParaAlquilar());
      
    }

}