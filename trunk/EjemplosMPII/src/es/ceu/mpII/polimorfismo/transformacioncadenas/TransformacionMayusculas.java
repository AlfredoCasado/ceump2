package es.ceu.mpII.polimorfismo.transformacioncadenas;

public class TransformacionMayusculas implements Transformacion {

    public String transformar(String cadenaATransformar) {
        return cadenaATransformar.toUpperCase();
    }

}
