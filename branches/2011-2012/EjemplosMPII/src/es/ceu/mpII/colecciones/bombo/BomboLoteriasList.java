package es.ceu.mpII.colecciones.bombo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class BomboLoteriasList implements BomboLoterias {

    private List<Integer> bombo = new ArrayList();

    public BomboLoteriasList(int numeroDeBolas) {
        for (int i = 1; i<=numeroDeBolas; i++) {
            bombo.add(i);
        }
    }

    public Integer siguienteBola() {
        if (!hayMasBolas()) {
            throw new ExcepcionNoHayMasBolas();
        }

        Random random = new Random();
        int numeroBolaASacar = random.nextInt(bombo.size());

        Integer bolaObtenida = bombo.get(numeroBolaASacar);
        bombo.remove(numeroBolaASacar);

        return bolaObtenida;
    }

    public boolean hayMasBolas() {
        return !bombo.isEmpty();
    }

}
