package es.ceu.mpII.taller;

import java.util.Set;

class Cliente {

    private HistorialReparaciones historial;
    private Set<Vehiculo> vehiculos;
    private String nombre;

    public Cliente(HistorialReparaciones historial, Set<Vehiculo> vehiculos, String nombre) {
        this.historial = historial;
        this.vehiculos = vehiculos;
        this.nombre = nombre;
    }

    public long gastoRealizado() {
        return historial.gastoRealizado();
    }

    int porcentajeCochesDiesel() {
        float numeroVehiculosDiesel = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.esDiesel()) {
                numeroVehiculosDiesel++;
            }
        }

        return (int) ((numeroVehiculosDiesel/vehiculos.size()) * 100);

    }

    boolean es(String nombre) {
        return nombre.equals(this.nombre);
    }


}
