package es.ceu.mpII.introduccion.herencia;

public abstract class Figura {

    void pintar() {
        System.out.println("el area del "+ nombreDeLaFigura() + " es:" + calcularArea());
    }

    protected abstract int calcularArea();

    protected abstract String nombreDeLaFigura();

}
