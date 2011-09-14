package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class Alquiler {
    public static final int IMPORTE_DIARIO = 1;
    private final Copia copia;
    private final int numeroDias;

    public Alquiler(Copia copia, int numeroDias) {
        this.copia = copia;
        this.numeroDias = numeroDias;
    }

    public int importe() {
        return numeroDias * IMPORTE_DIARIO;
    }

    @Override
    public String toString() {
        return "copia alquilada: " + copia + " por: " + numeroDias + 
               " dias, importe: " + importe();
    }
}
