
package es.ceu.mpII.javaio.directorios;

import java.io.File;
import java.io.FilenameFilter;

class NavegadorDirectorios {
    private final File ficheroRaiz;

    public NavegadorDirectorios(String rutaRaiz) {
        this.ficheroRaiz = new File(rutaRaiz);
    }

    void recorrerDirectorios(VisitorDirectorio visitorDirectorio) {
        recorrerDirectoriosRecursivo(ficheroRaiz, visitorDirectorio);
    }

    private void recorrerDirectoriosRecursivo(File ficheroRaiz, VisitorDirectorio visitorDirectorio) {
        File[] hijos = ficheroRaiz.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return dir.isDirectory();
            }
        });

        if (hijos == null) return;

        for (File file : hijos) {
            recorrerDirectoriosRecursivo(file, visitorDirectorio);
            visitorDirectorio.directorio(file);
        }
    }
}
