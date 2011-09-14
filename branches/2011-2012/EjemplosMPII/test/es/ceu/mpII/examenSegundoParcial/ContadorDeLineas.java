/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.ceu.mpII.examenSegundoParcial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class ContadorDeLineas {
    private final File file;
    private BufferedReader bufReader;

    ContadorDeLineas(File file) {
        if (!file.exists()) throw new IllegalArgumentException();
        this.file = file;
    }

    List<String> lineasEnLasQueApareceLa(String palabra) throws IOException  {
        bufReader = new BufferedReader(new FileReader(file));
        String linea;
        List<String> lineasADevolver = new ArrayList();
        while( (linea = bufReader.readLine()) != null) {
            if (linea.contains(palabra)) {
                lineasADevolver.add(linea);
            }
        }
        return lineasADevolver;
    }

}
