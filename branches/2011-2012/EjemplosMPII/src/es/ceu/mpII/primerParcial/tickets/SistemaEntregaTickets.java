package es.ceu.mpII.primerParcial.tickets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SistemaEntregaTickets {

    private AlmacenClientes almacenClientes;

    public SistemaEntregaTickets(AlmacenClientes almacenClientes) {
        this.almacenClientes = almacenClientes;
    }

    public Map<Cliente, Integer> calcularImporte() {

        Map<Cliente, Integer> clientesConTicketsCalculados = new HashMap();

        Set<Cliente> todosLosClientes = almacenClientes.dameTodos();
        for (Cliente cliente : todosLosClientes) {
            clientesConTicketsCalculados.put(cliente, cliente.calcularImporteTickets());
        }

        return clientesConTicketsCalculados;
    }

}
