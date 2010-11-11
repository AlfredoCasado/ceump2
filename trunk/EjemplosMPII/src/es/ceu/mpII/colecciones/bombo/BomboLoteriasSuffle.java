package es.ceu.mpII.colecciones.bombo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BomboLoteriasSuffle implements BomboLoterias {
    
    private List<Integer> bombo = new LinkedList<Integer>();
    Iterator<Integer> iterador;

    public BomboLoteriasSuffle(int numeroDeBolas) {
        for (int i = 1; i<=numeroDeBolas; i++) {
            bombo.add(i);
        }

        Collections.shuffle(bombo);
        iterador = bombo.iterator();
    }

    public Integer siguienteBola() {
        if (!hayMasBolas()) throw new ExcepcionNoHayMasBolas();

        return iterador.next();
    }

    public boolean hayMasBolas() {
        return iterador.hasNext();
    }



}
