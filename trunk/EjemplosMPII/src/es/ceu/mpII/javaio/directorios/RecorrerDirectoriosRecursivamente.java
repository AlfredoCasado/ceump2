package es.ceu.mpII.javaio.directorios;

import java.io.File;

public class RecorrerDirectoriosRecursivamente {

    public static void main(String[] args) {

        NavegadorDirectorios navegador = new NavegadorDirectorios("D:/");

        navegador.recorrerDirectorios(new VisitorDirectorio() {
            public void directorioEncontrado(File directorio) {
                System.out.println(directorio.getAbsolutePath());
            }
        });

    }

}
