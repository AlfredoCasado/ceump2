package es.ceu.mpII.introduccion.ejerciciovideoclub;

import java.util.Date;

public class Videoclub {

    private final Pelicula[] peliculasDisponibles;
    private final Cliente[] clientes;

    public Videoclub(Pelicula[] peliculasDisponibles, Cliente[] clientes) {
        this.peliculasDisponibles = peliculasDisponibles;
        this.clientes = clientes;
    }

    /**
     * funcion que sirve para darme una pelicula si esta disponible
     * @param nombreDeLaPelicula nombre de la pelicula buscada
     * @return la pelicula si la encuentra y null en caso de no encontrarla
     */
    public Pelicula dameLaPeliculaSiEstaDisponible(String nombreDeLaPelicula) {
        for (Pelicula pelicula : peliculasDisponibles) {
            if (pelicula.es(nombreDeLaPelicula)) {
                return pelicula;
            }

        }
        return null;

    }

    /**
     * utilidad para buscar un cliente registrado en el videoclub
     * @param nombreCliente el nombre del cliente buscado
     * @return el cliente buscado o unna excepción en caso de no encontrarlo
     * @throws ClienteNoEncontradoException si no encuentro el cliente
     */
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
