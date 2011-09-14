package es.ceu.mpII.colecciones.agendaTelefonica;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AgendaTelefonica {

    private Map<String,String> agenda = new HashMap();
    
    public void nuevoContacto(String nombreDelUsuario, String numeroDeTelefono) {
        agenda.put(nombreDelUsuario, numeroDeTelefono);
    }

    public String telefonoDe(final String nombreDelUsuario) {
        return agenda.get(nombreDelUsuario);
    }

    public void eliminarContacto(String nombreDelUsuario) {
        agenda.remove(nombreDelUsuario);
    }

    boolean tengoElTelefonoDe(final String nombreDelUsuario) {
        return agenda.containsKey(nombreDelUsuario);
    }

    public void pintarAgendaRecorrerConEntry() {
        Set<Entry<String,String>> entradasDeLaAgenda = agenda.entrySet();
        for (Entry<String, String> entrada : entradasDeLaAgenda) {
            System.out.print("nombre: " + entrada.getKey());
            System.out.println(" su telefono es: " + entrada.getValue());
        }
    }

    public void pintarAgendaRecorrerKeySetYAccesosDeMas_formaMala_() {
         for (String clave : agenda.keySet()) {
            System.out.print("nombre: " + clave);
            System.out.println(" su telefono es: " + agenda.get(clave));
        }
    }

}
