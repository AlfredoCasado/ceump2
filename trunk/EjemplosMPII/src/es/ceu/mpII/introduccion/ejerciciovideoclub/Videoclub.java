package es.ceu.mpII.introduccion.ejerciciovideoclub;

import java.util.Iterator;

public class Videoclub {

    private final Pelicula[] peliculasDisponibles;

    public Videoclub(Pelicula[] peliculasDisponibles) {
        this.peliculasDisponibles = peliculasDisponibles;
    }

    public Pelicula dameLaPeliculaSiEstaDisponible(String nombreDeLaPelicula) {
        for (Pelicula pelicula : peliculasDisponibles) {
            if (pelicula.es(nombreDeLaPelicula)) {
                return pelicula;
            }

        }
        return null;

    }



}
