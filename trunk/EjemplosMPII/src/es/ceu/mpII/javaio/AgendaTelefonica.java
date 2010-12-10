package es.ceu.mpII.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class AgendaTelefonica {

    private Map<String, String> agenda = new HashMap();

    public AgendaTelefonica(File rutaAgendaTxt) throws IOException {
        BufferedReader lectorFichero = getBufferedReader(rutaAgendaTxt);

        String linea;
        while ((linea = lectorFichero.readLine()) != null) {
            leerEntradaDeLaAgendaDe(linea);
        }

        lectorFichero.close();
    }

    private BufferedReader getBufferedReader(File rutaAgendaTxt) throws FileNotFoundException {
        FileReader reader = new FileReader(rutaAgendaTxt);
        BufferedReader buferedReader = new BufferedReader(reader);
        return buferedReader;
    }

    private void leerEntradaDeLaAgendaDe(String linea) {
        StringTokenizer tokenizer = new StringTokenizer(linea, ",");
        final String nombre = tokenizer.nextToken();
        final String telefono = tokenizer.nextToken();
        agenda.put(nombre.trim(), telefono.trim());
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

    public void save(File rutaDestino) throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(rutaDestino);
            bufferedWriter = new BufferedWriter(fileWriter);

            Set<Entry<String, String>> entradasDeLaAgenda = agenda.entrySet();
            for (Entry<String, String> entrada : entradasDeLaAgenda) {
                bufferedWriter.write(entrada.getKey() + "," + entrada.getValue() + "\n");
            }
        } finally {
            if (bufferedWriter != null) bufferedWriter.close();
            if (fileWriter != null) fileWriter.close();
        }


    }
}
