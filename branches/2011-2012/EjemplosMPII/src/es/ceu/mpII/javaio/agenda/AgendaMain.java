package es.ceu.mpII.javaio.agenda;

import java.io.IOException;

public class AgendaMain {

    public static void main(String[] args) throws IOException {
        
        Agenda agenda = new Agenda("./ficheros/agenda.txt");
        
        agenda.pintarAgendaRecorrerConEntry();
        
        agenda.nuevoContacto("nuevo contacto", "848484848482");
        
        agenda.escribirAFichero("./ficheros/agenda_nueva.txt");
      
        
    }
}
