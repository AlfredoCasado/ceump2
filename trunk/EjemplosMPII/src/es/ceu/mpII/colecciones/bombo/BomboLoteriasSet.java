package es.ceu.mpII.colecciones.bombo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class BomboLoteriasSet implements BomboLoterias {

    private Set<Integer> bombo = new HashSet<Integer>();

    public BomboLoteriasSet(int numeroDeBolas) {
        for (int i = 1; i<=numeroDeBolas; i++) {
            bombo.add(i);
        }
    }


    public Integer siguienteBola() {
        if (!hayMasBolas()) throw new ExcepcionNoHayMasBolas();

        Random random = new Random();
        int numeroBolaASacar = random.nextInt(bombo.size());

        Iterator<Integer> it = bombo.iterator();
        Integer bolaExtraida = null;
        for (int i = 0; i<=numeroBolaASacar;i++) {
            bolaExtraida = it.next();
        }

        bombo.remove(bolaExtraida);

        return bolaExtraida;
    }

    public boolean hayMasBolas() {
        return !bombo.isEmpty();
    }

}
