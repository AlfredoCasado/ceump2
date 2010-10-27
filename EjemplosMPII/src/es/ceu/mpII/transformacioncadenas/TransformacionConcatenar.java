package es.ceu.mpII.transformacioncadenas;

public class TransformacionConcatenar implements Transformacion {

    final String cadenaAConcatenar;

    public TransformacionConcatenar(String cadenaAConcatenar) {
        this.cadenaAConcatenar = cadenaAConcatenar;
    }

    public String transformar(String cadenaATransformar) {
        return cadenaATransformar.concat(cadenaAConcatenar);
    }



}
