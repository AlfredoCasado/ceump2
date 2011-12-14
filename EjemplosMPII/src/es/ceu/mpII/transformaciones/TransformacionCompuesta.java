package es.ceu.mpII.transformaciones;

import java.util.Set;

public class TransformacionCompuesta implements Transformacion {

    Set<Transformacion> transformaciones;

    public TransformacionCompuesta(Set<Transformacion> transformaciones) {
        this.transformaciones = transformaciones;
    }

    public TransformacionCompuesta(Transformacion...transformacionesArray) {
        for (Transformacion transformacion : transformacionesArray) {
            transformaciones.add(transformacion);
        }
    }

    public String transformar(String cadenaATransformar) {
        String cadenaTransformada = cadenaATransformar;

        for (Transformacion transformacion : transformaciones) {
            cadenaTransformada = transformacion.transformar(cadenaTransformada);
        }

        return cadenaTransformada;
    }






}
