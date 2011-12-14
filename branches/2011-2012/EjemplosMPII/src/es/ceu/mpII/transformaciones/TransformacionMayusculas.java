package es.ceu.mpII.transformaciones;

public class TransformacionMayusculas implements Transformacion {

    public String transformar(String cadenaATransformar) {
        return cadenaATransformar.toUpperCase();
    }

}
