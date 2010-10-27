package es.ceu.mpII.transformacioncadenas;

public class TransformacionCompuesta implements Transformacion {
    private final Transformacion[] transformaciones;

    TransformacionCompuesta(Transformacion[] transformaciones) {
        this.transformaciones = transformaciones;
    }

    public String transformar(final String cadenaATransformar) {
        String cadenaTransformada = cadenaATransformar;
        for (Transformacion transformacion : transformaciones) {
            cadenaTransformada = transformacion.transformar(cadenaTransformada);
        }
        return cadenaTransformada;
    }

}
