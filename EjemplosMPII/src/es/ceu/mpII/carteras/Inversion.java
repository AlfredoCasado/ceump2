package es.ceu.mpII.carteras;

public class Inversion {

    private int unidades;
    private final Accion accion;
    private final ActualizadorMovimientos actualizador;

    public Inversion(int unidades, Accion accion, ActualizadorMovimientos actualizador) {
        this.unidades = unidades;
        this.accion = accion;
        this.actualizador = actualizador;
    }

    public long total() {
        return accion.valorPara(unidades);
    }

    void actualizar() {
        unidades += actualizador.movimientosDe(accion);
        accion.actualizar();
    }
}
