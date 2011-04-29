package es.ceu.mpII.algoritmia.voraz;

import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacionVorazTest {
    

    @Test
    public void es_capaz_de_devolver_una_nueva_lista_de_ordenada() {

        List<Integer> listaDesordenada = new ArrayList();
        for (int i=0; i<100000;i++) {
            listaDesordenada.add(i);
        }

        OrdenadorVoraz ordenador = new OrdenadorVoraz();
        List<Integer> listaOrdenada = ordenador.ordenar(listaDesordenada);

        for (int i=99999; i>=0;i--) {
            assertEquals(new Integer(i), listaOrdenada.get(99999-i));
        }

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
