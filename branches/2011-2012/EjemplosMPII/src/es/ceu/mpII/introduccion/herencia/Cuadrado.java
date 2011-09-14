package es.ceu.mpII.introduccion.herencia;

public class Cuadrado extends Figura {

    private final int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    protected int calcularArea() {
        return lado*lado;
    }

    @Override
    protected String nombreDeLaFigura() {
        return "Cuadrado";
    }


}
