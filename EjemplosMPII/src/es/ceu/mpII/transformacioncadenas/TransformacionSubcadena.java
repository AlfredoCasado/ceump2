package es.ceu.mpII.transformacioncadenas;

public class TransformacionSubcadena implements Transformacion {

    private int inicio;
    private int fin;

    public TransformacionSubcadena(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public String transformar(String cadenaATransformar) {
        if (cadenaATransformar.length() < fin) {
            throw new TransformacionException("fin es: " + fin +
                                              " y la cadena solo tiene longitud: "
                                              + cadenaATransformar.length());
        }

        return cadenaATransformar.substring(inicio, fin);
    }

}
