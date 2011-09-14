package es.ceu.mpII.introduccion.interfaces;

public class Cuadrado implements Figura {

    private final int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public void pintar() {
        System.out.println("soy un cuadrado y mi area es: " + lado*lado);
    }

}
