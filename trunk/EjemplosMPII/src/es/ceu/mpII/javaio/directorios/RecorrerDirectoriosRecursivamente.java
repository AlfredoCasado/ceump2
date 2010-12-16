package es.ceu.mpII.javaio.directorios;

import java.io.File;

public class RecorrerDirectoriosRecursivamente {

    public static void main(String[] args) {

        NavegadorDirectorios navegador = new NavegadorDirectorios("C:/");

        navegador.recorrerDirectorios(new VisitorDirectorio() {
            public void directorio(File directorio) {
                System.out.println(directorio.getName());
            }
        });

    }

}
