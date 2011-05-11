package es.ceu.mpII.algoritmia.voraz;

import java.util.ArrayList;
import java.util.List;

public class OrdenadorVoraz {

    public List<Integer> ordenar(List<Integer> listaDesordenada) {
        List<Integer> listaOrdenada = new ArrayList();

        while(!listaDesordenada.isEmpty()) {
            Integer mayor = mayorDe(listaDesordenada);
            listaOrdenada.add(mayor);
            listaDesordenada.remove(mayor);
        }

        return listaOrdenada;
    }

    private Integer mayorDe(List<Integer> listaDesordenada) {
        Integer mayor = Integer.MIN_VALUE;
        for (Integer numero : listaDesordenada) {
            if (numero > mayor) mayor = numero;
        }
        return mayor;
    }

}
