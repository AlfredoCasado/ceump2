package es.ceu.mpII.taller;

import java.util.Set;

public class Taller {

    private Set<Cliente> clientes;

    public Taller(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public long gananciasTotales() {
        long ganancias = 0;
        for (Cliente cliente : clientes) {
            ganancias+= cliente.gastoRealizado();
        }
        return ganancias;
    }

    public int porcentajeCochesDiesel() {

        int porcentaje = 0;
        for (Cliente cliente : clientes) {
            porcentaje += cliente.porcentajeCochesDiesel();
        }

        return porcentaje/clientes.size();
    }

    public long gastoDeCliente(String nombre) {

        for (Cliente cliente : clientes) {
            if (cliente.es(nombre)) {
                return cliente.gastoRealizado();
            }
        }
        

        throw new ClienteNoEncontradoExcepcion();
    }

}
