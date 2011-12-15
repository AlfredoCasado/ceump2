package es.ceu.mpII.taller;

import java.util.Set;

class HistorialReparaciones {

    private Set<Reparacion> reparaciones;

    public HistorialReparaciones(Set<Reparacion> reparaciones) {
        this.reparaciones = reparaciones;
    }

    public long gastoRealizado() {
        long gasto = 0;
        for (Reparacion reparacion : reparaciones) {
            gasto+= reparacion.costo();
        }
        return gasto;
    }


}
