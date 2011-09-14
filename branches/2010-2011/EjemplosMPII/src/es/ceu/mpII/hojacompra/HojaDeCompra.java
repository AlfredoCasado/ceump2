package es.ceu.mpII.hojacompra;

import java.util.HashSet;
import java.util.Set;

class HojaDeCompra {

    Set<EntradasProducto> entradas = new HashSet();
    
    void agregar(Producto producto) {
        EntradasProducto entrada =  buscarEntrada(producto);
        if (entrada == null) {
            entrada = new EntradasProducto();
            entradas.add(entrada);
        }
        entrada.agregar(producto);
    }

    int unidadesDe(Producto producto) {
        EntradasProducto entrada =  buscarEntrada(producto);
        if (entrada != null) {
            return entrada.unidades();
        }
        return 0;
    }

    int total() {
        int total = 0;
        for (EntradasProducto entradaProducto : entradas) {
            total+=entradaProducto.total();
        }
        return total;
    }

    private EntradasProducto buscarEntrada(Producto producto) {
        for (EntradasProducto entradaProducto : entradas) {
            if (entradaProducto.esEntradaDe(producto)) {
                return entradaProducto;
            }
        }
        return null;
    }

}
