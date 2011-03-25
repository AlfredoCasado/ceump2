package es.ceu.mpII.kata.lineascodigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ContadorDeLineasJava {

    public int numeroDeLineasEn(final File ficheroJava) throws FileNotFoundException, IOException {
        
        BufferedReader bufReader = new BufferedReader(new FileReader(ficheroJava));
        int numeroLineas = 0;

        String linea;
        while((linea = bufReader.readLine()) != null) {
            numeroLineas++;
            if (estaEnBlanco(linea)) numeroLineas--;
            if (estaComentada(linea)) numeroLineas--;
        }
        bufReader.close();

        return numeroLineas;

    }

    private boolean estaEnBlanco(String linea) {
        return linea.trim().isEmpty();
    }

    private boolean estaComentada(String linea) {
        return linea.trim().startsWith("//");
    }

}
