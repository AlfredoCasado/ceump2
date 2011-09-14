package es.ceu.mpII.introduccion.herencia;

public class Circulo extends Figura {

    private final int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    protected int calcularArea() {
        return (int) (Math.PI * radio * radio);
    }

    @Override
    protected String nombreDeLaFigura() {
        return "Circulo";
    }

}
