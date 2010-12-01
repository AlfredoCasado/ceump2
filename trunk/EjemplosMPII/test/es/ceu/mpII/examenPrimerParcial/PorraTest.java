package es.ceu.mpII.examenPrimerParcial;

import org.junit.Test;
import static org.junit.Assert.*;

public class PorraTest {

    final Usuario julian = new Usuario("Julian");
    final Usuario alfredo = new Usuario("Alfredo");
    final Partido barsaMadrid = new Partido("Barsa", "Madrid");
    final Resultado resultadoOptimista = new Resultado(1,2);
    final Resultado elBarsaArrasa = new Resultado(5,0);

    @Test
    public void hacemosVariasPuestasYNosDevuelveElGanadorCuandoNosDicenElResultadoDelPartido() {

        Porra porraBarsaMadrid = new Porra(barsaMadrid);

        porraBarsaMadrid.nuevaApuesta(alfredo, resultadoOptimista);
        porraBarsaMadrid.nuevaApuesta(julian, elBarsaArrasa);

        Usuario usuarioGanador = porraBarsaMadrid.resultadoDelPartido(new Resultado(5, 0));

        assertEquals(julian, usuarioGanador);
    }

}