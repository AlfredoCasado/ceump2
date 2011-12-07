package es.ceu.mpII.carteras;

public class ActualizadorCarteras {
    private final AlmacenCarteras almacen;

    public ActualizadorCarteras(AlmacenCarteras almacen) {
        this.almacen = almacen;
    }

    public void ActualizarTodasLasCarteras() {
        while(almacen.haySiguiente()) {
            Cartera carteraAActualizar = almacen.siguienteCartera();
            carteraAActualizar.actualizar();
            almacen.guardarActualizada(carteraAActualizar);
        }
    }

}
