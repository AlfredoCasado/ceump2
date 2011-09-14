package es.ceu.mpII.algoritmia.divideYVenceras;

import java.util.List;

class OrdenadorDivideYVenceras {

    private List<Integer> listaAOrdenar;
    private int limite;

    List<Integer> ordenar(List<Integer> listaAOrdenar) {

        this.listaAOrdenar = listaAOrdenar;
        this.limite = listaAOrdenar.size();

        mergeSort(0, limite-1);

        return listaAOrdenar;
    }

    private void mergeSort(int limiteInferior, int limiteSuperior) {
        if (limiteInferior < limiteSuperior) {

            int puntoMedio = (limiteSuperior+limiteInferior) / 2;

            mergeSort(limiteInferior, puntoMedio);
            mergeSort(puntoMedio+1, limiteSuperior);

            mezclar(limiteInferior, puntoMedio, limiteSuperior);
        }
    }

    private void mezclar(int limiteInferior, int puntoMedio, int limiteSuperior) {

        int[] helper = new int[limite];

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            helper[i] = listaAOrdenar.get(i);
        }

        int i = limiteInferior;
        int j = puntoMedio + 1;
        int k = limiteInferior;
        while (i <= puntoMedio && j <= limiteSuperior) {
            if (helper[i] >= helper[j]) {
                listaAOrdenar.set(k, helper[i]);
                i++;
            } else {
                listaAOrdenar.set(k, helper[j]);
                j++;
            }
            k++;
        }

        while (i <= puntoMedio) {
            listaAOrdenar.set(k, helper[i]);
            k++;
            i++;
        }
        helper = null;



    }

    

}
