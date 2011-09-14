package es.ceu.mpII.introduccion.ejerciciocargatrenes;

public class SistemaCargaDeTrenes {

    private final Almacen almacen;

    public SistemaCargaDeTrenes(Almacen almacen) {
        this.almacen = almacen;
    }

    void cargarTrenes(Tren[] trenes) {
        while(almacen.noEstaVacio()) {
            Mercancia mercancia = almacen.dameLaSiguienteMercancia();
            intentarGuardarLaMercanciaEnAlgunTren(trenes, mercancia);
        }
    }

    private void intentarGuardarLaMercanciaEnAlgunTren(Tren[] trenes, Mercancia mercancia) {
        for (Tren tren : trenes) {
            if (tren.tieneEspacioDisponiblePara(mercancia)) {
                tren.guardar(mercancia);
                break;
            }
        }
    }

}
