package es.ceu.mpII.videoclub;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class VideoclubTest {

    Videoclub videoclub = prepararEscenario();

    @Test
    public void el_videoclub_dispone_de_copias_de_la_pelicula_que_le_pedimos() {
        assertTrue(videoclub.DisponeDe("cars"));
    }

    @Test
    public void el_videoclub_no_dispone_de_copias_de_la_pelicula_que_le_pedimos() {
        assertFalse(videoclub.DisponeDe("avatar"));
    }
    
    @Test
    public void el_videoclub_no_tiene_la_pelicula() {
        assertFalse(videoclub.DisponeDe("300"));
    }

     private Videoclub prepararEscenario() {
        Copia[] copiasDeAvatar = new Copia[1];
        copiasDeAvatar[0] = new Copia(false);

        Copia[] copiasDeCars = new Copia[1];
        copiasDeCars[0] = new Copia(true);

        Titulo[] titulosDisponibles = new Titulo[2];
        titulosDisponibles[0] = new Titulo("avatar", copiasDeAvatar);
        titulosDisponibles[1] = new Titulo("cars", copiasDeCars);

        return new Videoclub(titulosDisponibles);
    }


}