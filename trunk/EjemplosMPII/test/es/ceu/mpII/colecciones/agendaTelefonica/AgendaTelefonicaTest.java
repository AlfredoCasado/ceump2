package es.ceu.mpII.colecciones.agendaTelefonica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgendaTelefonicaTest {

    @Test
    public void puedoAnadirUnElementoYLuegoConsultarlo() {
        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.nuevoContacto("alfredo", "12345");

        assertEquals("12345", agenda.telefonoDe("alfredo"));
    }
    
    @Test
    public void podemosEliminarUnElementoDeLaAgenda() {
        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.nuevoContacto("alfredo", "12345");
        agenda.eliminarContacto("alfredo");
      
        assertFalse(agenda.tengoElTelefonoDe("alfredo"));
    }

    @Test
    public void puedoPintarLaAgenda() {
        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.nuevoContacto("alfredo", "12345");
        agenda.nuevoContacto("pedro", "1234533");
        agenda.nuevoContacto("paco", "3434334");

        agenda.pintarAgendaRecorrerConEntry();
    }



}