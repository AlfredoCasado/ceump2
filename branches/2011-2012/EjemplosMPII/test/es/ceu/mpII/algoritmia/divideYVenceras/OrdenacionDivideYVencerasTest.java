package es.ceu.mpII.algoritmia.divideYVenceras;

import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacionDivideYVencerasTest {
    

    @Test
    public void es_capaz_de_devolver_una_nueva_lista_de_ordenada() {

        List<Integer> listaDesordenada = new ArrayList();
        listaDesordenada.add(5);
        listaDesordenada.add(1);
        listaDesordenada.add(7);
        listaDesordenada.add(4);
        

        OrdenadorDivideYVenceras ordenador = new OrdenadorDivideYVenceras();
        List<Integer> listaOrdenada = ordenador.ordenar(listaDesordenada);

     
    }

    @Test
    public void ordenacion_nativa_java() {

        List<Integer> listaDesordenada = new ArrayList();
        for (int i=0; i<100000;i++) {
            listaDesordenada.add(i);
        }

        Collections.sort(listaDesordenada, new Comparator<Integer>(){
            public int compare(Integer t, Integer t1) {
                if (t > t1) return -1;
                if (t < t1) return 1;
                return 0;
            }
        });


        for (int i=99999; i>=0;i--) {
            assertEquals(new Integer(i), listaDesordenada.get(99999-i));
        }

    }

}
