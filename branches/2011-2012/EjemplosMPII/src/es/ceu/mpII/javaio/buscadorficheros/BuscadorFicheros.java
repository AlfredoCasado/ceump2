package es.ceu.mpII.javaio.buscadorficheros;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

interface FicheroEncontrado {
    void ficheroEncontrado(File fichero);
}

public class BuscadorFicheros {
    
    private static File directorioRaiz = new File("/Users/alfredocasado/git/unience/web/unience");
    
    public static void main(String[] args) {
        
        Set<String> directoriosAExcluir = new HashSet();
        directoriosAExcluir.add("services");
        directoriosAExcluir.add("conf");
        directoriosAExcluir.add("grails-app");
        
        BuscadorFicheros buscador = new BuscadorFicheros();
        
        buscador.buscarficherosConExtension("groovy", directoriosAExcluir, new FicheroEncontrado() {
            @Override
            public void ficheroEncontrado(File fichero) {
                System.out.println(fichero.getAbsoluteFile());
            }
        });
        
    }
    
    private void buscarficherosConExtension(String extension, Set<String> directoriosAExcluir, FicheroEncontrado ficheroEncontrado) {
        navegarRecursivo(directorioRaiz, extension, ficheroEncontrado, directoriosAExcluir);
    }
    
    private void navegarRecursivo(File directorio, String extension, FicheroEncontrado ficheroEncontrado,Set<String> directoriosAExcluir) {
        File[] hijos = directorio.listFiles();
        
        for (File hijo : hijos) {
            if (hijo.isDirectory() && !directoriosAExcluir.contains(hijo.getName())) {
               navegarRecursivo(hijo, extension, ficheroEncontrado,directoriosAExcluir);
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
