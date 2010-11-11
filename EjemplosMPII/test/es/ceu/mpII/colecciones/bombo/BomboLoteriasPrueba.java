package es.ceu.mpII.colecciones.bombo;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

public abstract class BomboLoteriasPrueba {
    
    public static final int NUMERO_DE_BOLAS = 2;
    protected abstract BomboLoterias crearBomboDeTest(int numeroDeBolas);

    @Test
    public void LePidoNBolasYMeDevuelveNDistintas() {

        Set<Integer> bolasExtraidas = new HashSet();
        BomboLoterias bombo = crearBomboDeTest(NUMERO_DE_BOLAS);

        for (int i = 0;i<NUMERO_DE_BOLAS;i++) {
            extraerSiguienteBola(bombo, bolasExtraidas);
        }
                       
        assertEquals(NUMERO_DE_BOLAS, bolasExtraidas.size());
    }

    @Test(expected=ExcepcionNoHayMasBolas.class)
    public void cuandoLePidaUnaBolaYNoTengaMeDevuelvaUnaExcepcion() {
        BomboLoterias bombo = crearBomboDeTest(1);
        bombo.siguienteBola();
        bombo.siguienteBola();
    }

    private void extraerSiguienteBola(BomboLoterias bombo, Set<Integer> bolasExtraidas) {
        Integer bolaExtraida = bombo.siguienteBola();
        System.out.println(bolaExtraida);
        bolasExtraidas.add(bolaExtraida);
    }
}