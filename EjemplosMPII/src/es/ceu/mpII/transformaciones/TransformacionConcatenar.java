package es.ceu.mpII.transformaciones;

public class TransformacionConcatenar implements Transformacion {

    private String cadenaAConcatenar;

    public TransformacionConcatenar(String cadenaAConcatenar) {
        this.cadenaAConcatenar = cadenaAConcatenar;
    }

    public String transformar(String cadenaATransformar) {
        return cadenaATransformar + cadenaAConcatenar;
    }



}
