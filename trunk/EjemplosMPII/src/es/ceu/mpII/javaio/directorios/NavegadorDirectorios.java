
package es.ceu.mpII.javaio.directorios;

import java.io.File;
import java.io.FileFilter;

class NavegadorDirectorios {
    private final File ficheroRaiz;

    public NavegadorDirectorios(String rutaRaiz) {
        this.ficheroRaiz = new File(rutaRaiz);
    }

    void recorrerDirectorios(VisitorDirectorio visitorDirectorio) {
        recorrerDirectoriosRecursivo(ficheroRaiz, visitorDirectorio);
    }

    private void recorrerDirectoriosRecursivo(File ficheroRaiz, VisitorDirectorio visitorDirectorio) {
        File[] hijos = ficheroRaiz.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });

        if (hijos == null) return;

        for (File file : hijos) {
            recorrerDirectoriosRecursivo(file, visitorDirectorio);
            visitorDirectorio.directorioEncontrado(file);
        }
    }
}
