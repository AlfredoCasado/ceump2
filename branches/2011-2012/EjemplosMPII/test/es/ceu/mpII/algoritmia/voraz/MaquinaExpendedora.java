package es.ceu.mpII.algoritmia.voraz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MaquinaExpendedora {

    private static Map<String, Integer> productos = new HashMap();
    static {
        productos.put("coca-cola", 60);
    }

    List<Moneda> comprar(String producto, int dineroInsertado) {

        int cambioADevolver = cambioADevolver(producto,dineroInsertado);

        List<Moneda> cambio = new ArrayList();
        while(cambioADevolver != 0) {
            Moneda monedaElegida = mayorMonedaMenorQue(cambioADevolver);
            cambio.add(monedaElegida);
            cambioADevolver-=monedaElegida.getCentimos();
        }

        return cambio;
    }

    private Moneda mayorMonedaMenorQue(int cambioADevolver) {
        for (Moneda moneda : Moneda.values()) {
            if (moneda.getCentimos() <= cambioADevolver) {
                return moneda;
            }
        }

        throw new RuntimeException("no hay moneda posible para devolver: " + cambioADevolver);
    }

    private int cambioADevolver(String producto, int dineroInsertado) {
        int precioDelProducto = productos.get(producto);
        return dineroInsertado - precioDelProducto;
    }



}
