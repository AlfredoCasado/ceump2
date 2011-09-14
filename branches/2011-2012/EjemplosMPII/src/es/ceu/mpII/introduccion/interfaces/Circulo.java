package es.ceu.mpII.introduccion.interfaces;

public class Circulo implements Figura {

     private final int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public void pintar() {
        System.out.println("el area del circulo es: " + (Math.PI * radio * radio));
    }

}
