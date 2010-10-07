package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class Pelicula {

    private final String nombre;
    private final Copia[] copias;

    public Pelicula(String nombre, Copia[] copiasDisponibles) {
        this.nombre = nombre;
        this.copias = copiasDisponibles;
        for (Copia copia : copiasDisponibles) {
            copia.eresCopiaDe(this);
        }
    }

    boolean es(String nombreDeLaPelicula) {
        return nombreDeLaPelicula.equals(nombre);
    }

    Copia dameUnaCopiaSiHayDisponibles() {
        for (Copia copia : copias) {
            if (copia.estaDisponibleParaAlquilar()) {
                return copia;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return nombre;
    }



}
