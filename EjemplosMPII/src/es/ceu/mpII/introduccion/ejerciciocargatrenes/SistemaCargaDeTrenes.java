package es.ceu.mpII.introduccion.ejerciciocargatrenes;

public class SistemaCargaDeTrenes {

    void cargarTrenes(Almacen almacen, Tren[] trenes) {
        while(almacen.noEstaVacio()) {
            Mercancia mercancia = almacen.dameLaSiguienteMercancia();
            intentarGuardarLaMercanciaEnAlgunTren(trenes, mercancia);
        }
    }

    private void intentarGuardarLaMercanciaEnAlgunTren(Tren[] trenes, Mercancia mercancia) {
        for (Tren tren : trenes) {
            if (tren.tieneEspacioDisponiblePara(mercancia)) {
                tren.guardar(mercancia);
            }
        }
    }


}
