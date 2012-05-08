package es.ceu.mpII.javaio.agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Agenda {

    private Map<String,String> agenda = new HashMap();
    
    public Agenda(String rutaAlFichero) throws IOException {
        
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        
        try{
        
            fileReader = new FileReader(rutaAlFichero);
            bufferedReader = new BufferedReader(fileReader);
         
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] lineaTroceada = linea.split(",");
                String nombre = lineaTroceada[0];
                String telefono = lineaTroceada[1];

                nuevoContacto(nombre, telefono);
            }
            
        } finally {
            if (fileReader != null) fileReader.close();
            if (bufferedReader != null) bufferedReader.close();
        }
        
        
    }
    
    public void escribirAFichero(String rutaDelFichero) throws IOException {
        
 
        FileWriter fileWriter = new FileWriter(rutaDelFichero);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        Set<Entry<String,String>> entradasDeLaAgenda = agenda.entrySet();
        for (Entry<String, String> entrada : entradasDeLaAgenda) {
            bufferedWriter.write(entrada.getKey() + "," + entrada.getValue() + "\n");
        }
        
        bufferedWriter.close();
        fileWriter.close();
        
    }
    
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