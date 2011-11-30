package es.ceu.mpII.carteras;

public class Inversion {

    private int unidades;
    private Accion accion;

    public Inversion(int unidades, Accion accion) {
        this.unidades = unidades;
        this.accion = accion;
    }

    public long total() {
        return accion.valorPara(unidades);
    }
}
