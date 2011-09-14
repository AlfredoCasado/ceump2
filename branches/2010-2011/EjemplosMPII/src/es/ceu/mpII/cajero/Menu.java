package es.ceu.mpII.cajero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    private final Opcion[] opciones;

    public Menu(Opcion[] opciones) {
        this.opciones = opciones;
    }

    public void mostrar() {
        pintarTituloMenu();
        pintarOpciones();
    }
    
    public Opcion solicitarOpcionAlUsuario() {
        int numeroOpcionElegida = leerEnteroDeTeclado();
        return opciones[numeroOpcionElegida-1];
    }

    private void pintarOpciones() {
        int numeroOpcion = 1;
        for (Opcion opcion : opciones) {
            System.out.println(textoAMostrarParaOpcion(numeroOpcion++, opcion));
        }
    }

    private String textoAMostrarParaOpcion(int numeroOpcion, Opcion opcion) {
        return "(" + numeroOpcion + ")" + opcion.dameNombre();
    }

    private void pintarTituloMenu() {
        System.out.println("MENU DE OPCIONES");
        System.out.println("================");
    }

    private int leerEnteroDeTeclado()  {
        try {
            BufferedReader entradaDeDatos = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(entradaDeDatos.readLine());
        } catch (IOException ex) {
            throw new RuntimeException("error al leer la opción de menú elegida por el usuario");
        }
    }

}
