package es.ceu.mpII.javaio;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgendaTelefonicaTest {

   @Test
   public void cargamosElContenidoDeLaAgendaDeUnFichero() throws IOException {

       File rutaAgendaTxt = new File("./ficheros/contenidoAgenda.txt");
       AgendaTelefonica agenda = new AgendaTelefonica(rutaAgendaTxt);

       assertEquals("1234560", agenda.telefonoDe("Alfredo"));
       assertEquals("4384934", agenda.telefonoDe("Pedro"));
       assertEquals("3747474", agenda.telefonoDe("Juan"));

   }

   @Test
   public void podemosEscribirLaAgendaAFichero() throws IOException {
       File rutaAgendaTxt = new File("./ficheros/contenidoAgenda.txt");
       File rutaDestino = new File("./ficheros/agendaEscrita.txt");
       AgendaTelefonica agenda = new AgendaTelefonica(rutaAgendaTxt);

       agenda.nuevoContacto("julian", "666");

       agenda.save(rutaDestino);
   }

}