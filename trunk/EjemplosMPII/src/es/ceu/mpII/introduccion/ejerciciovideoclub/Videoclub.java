package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class Videoclub {

    private final Pelicula[] peliculasDisponibles;
    private final Cliente[] clientes;

    public Videoclub(Pelicula[] peliculasDisponibles, Cliente[] clientes) {
        this.peliculasDisponibles = peliculasDisponibles;
        this.clientes = clientes;
    }

    public Pelicula dameLaPeliculaSiEstaDisponible(String nombreDeLaPelicula) {
        for (Pelicula pelicula : peliculasDisponibles) {
            if (pelicula.es(nombreDeLaPelicula)) {
                return pelicula;
            }

        }
        return null;
    }

    public Cliente buscarClientePorNombre(String nombreCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.tuNombreEs(nombreCliente)) {
                return cliente;
            }
        }
        throw new ClienteNoEncontradoException();
    }

    boolean esCliente(String nombreCliente) {
         for (Cliente cliente : clientes) {
            if (cliente.tuNombreEs(nombreCliente)) {
                return true;
            }
        }
       return false;
    }



}
