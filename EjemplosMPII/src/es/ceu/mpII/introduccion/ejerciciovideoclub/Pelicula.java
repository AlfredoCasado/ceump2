package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class Pelicula {

    private final String nombre;
    private final Copia[] copias;

    public Pelicula(String nombre, Copia[] copiasDisponibles) {
        this.nombre = nombre;
        this.copias = copiasDisponibles;
    }

    boolean es(String nombreDeLaPelicula) {
        return nombreDeLaPelicula.equals(nombre);
    }

    boolean hayCopiasDisponiblesParaAlquilar() {
        for (Copia copia : copias) {
            if (copia.estaDisponibleParaAlquilar()) {
                return true;
            }
        }
        return false;
    }

}
