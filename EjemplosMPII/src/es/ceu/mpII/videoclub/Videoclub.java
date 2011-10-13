package es.ceu.mpII.videoclub;

public class Videoclub {

    private Titulo[] titulosDisponibles;

    Videoclub(Titulo[] titulosDisponibles) {
        this.titulosDisponibles = titulosDisponibles;
    }

    public boolean DisponeDe(String nombrePelicula) {

        for (Titulo titulo : titulosDisponibles) {
            if (titulo.nombre().equals(nombrePelicula)) {
                if (titulo.tieneCopiasDisponibles()) {
                    return true;
                }
            }
        }

        return false;

    }



}
