package es.ceu.mpII.javaio.buscadorficheros;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

interface FicheroEncontrado {
    void ficheroEncontrado(File fichero);
}

public class BuscadorFicheros {
    
    private static File directorioRaiz = new File("/Users/alfredocasado/");
    
    public static void main(String[] args) {
        
        BuscadorFicheros buscador = new BuscadorFicheros();
        
        buscador.buscarficherosConExtension("css", new FicheroEncontrado() {
            @Override
            public void ficheroEncontrado(File fichero) {
                System.out.println(fichero.getAbsoluteFile());
            }
        });
        
    }
    
    private void buscarficherosConExtension(String extension, FicheroEncontrado ficheroEncontrado) {
        navegarRecursivo(directorioRaiz, extension, ficheroEncontrado);
    }
    
    private void navegarRecursivo(File directorio, String extension, FicheroEncontrado ficheroEncontrado) {
        File[] hijos = directorio.listFiles();
        
        for (File hijo : hijos) {
            if (hijo.isDirectory()) {
               navegarRecursivo(hijo, extension, ficheroEncontrado);
            } else if (hijo.getName().endsWith(extension)) {
               ficheroEncontrado.ficheroEncontrado(hijo);
            }
        }
    }
    

    private Set<File> buscarFicherosConExtension(final String extension) {
        Set<File> ficherosEncontrados = new HashSet();
        
        navegarRecursivo(directorioRaiz, extension, ficherosEncontrados);
        
        return ficherosEncontrados;
    }

    private void navegarRecursivo(File directorio, final String extension, Set<File> ficherosEncontrados) {
        File[] hijos = directorio.listFiles();
        
        for (File hijo : hijos) {
            if (hijo.isDirectory()) {
               navegarRecursivo(hijo, extension, ficherosEncontrados);
            } else if (hijo.getName().endsWith(extension)) {
               ficherosEncontrados.add(hijo);
            }
        }
        
    }

    
}
