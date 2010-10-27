package es.ceu.mpII.transformacioncadenas;

public class TransformacionSubcadena implements Transformacion {

    private int inicio;
    private int fin;

    public TransformacionSubcadena(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public String transformar(String cadenaATransformar) {
        return cadenaATransformar.substring(inicio, fin);
    }

}
