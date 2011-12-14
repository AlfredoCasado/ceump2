package es.ceu.mpII.transformaciones;

public class TransformacionSubcadena implements Transformacion {
    private final int inicio;
    private final int longitud;

    public TransformacionSubcadena(int inicio, int longitud) {
        this.inicio = inicio;
        this.longitud = longitud;
    }

    public String transformar(String cadenaATransformar) {
        return cadenaATransformar.substring(inicio, longitud);
    }



}
