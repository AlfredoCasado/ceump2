package es.ceu.mpII.introduccion.herencia;

public class Persona {

    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("hola soy: " + nombre);
    }

    protected String nombre() {
        return nombre;
    }

}
