package es.ceu.mpII.examenPrimerParcial;

import java.util.List;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

public class PorraTest {

    public static final int ADMITE_UNA_APUESTA_REPETIDA = 1;
    public static final int NUMERO_DE_GANADORES_ESPERADO = 1;
    public static final int ADMITE_DOS_APUESTAS_REPETIDA = 2;


    final Usuario julian = new Usuario("Julian");
    final Usuario alfredo = new Usuario("Alfredo");
    final Partido barsaMadrid = new Partido("Barsa", "Madrid");
    final Resultado resultadoOptimista = new Resultado(1,2);
    final Resultado elBarsaArrasa = new Resultado(5,0);

    @Test
    public void hacemosVariasPuestasYNosDevuelveElGanadorCuandoNosDicenElResultadoDelPartido() {
        Porra porraBarsaMadrid = new Porra(barsaMadrid, ADMITE_UNA_APUESTA_REPETIDA);

        porraBarsaMadrid.nuevaApuesta(alfredo, resultadoOptimista);
        porraBarsaMadrid.nuevaApuesta(julian, elBarsaArrasa);

        Set<Usuario> ganadores = porraBarsaMadrid.resultadoDelPartido(new Resultado(5, 0));

        assertEquals(NUMERO_DE_GANADORES_ESPERADO, ganadores.size());
        for (Usuario usuario : ganadores) {
            if (usuario.equals(julian)) {
                return;
            }
        }
        fail("julian debería ser el ganador");
    }

    @Test
    public void siNoTenemosNingunAcertanteDevolvemosUnaListaVaciaDeGanadores() {
        Porra porraBarsaMadrid = new Porra(barsaMadrid, ADMITE_UNA_APUESTA_REPETIDA);
        Set<Usuario> ganadores = porraBarsaMadrid.resultadoDelPartido(new Resultado(5, 0));
        assertTrue(ganadores.isEmpty());
    }

    @Test
    public void laPorraSoloAdmiteLasApuestasRepetidasQueSeLeIndiquen() {
        Porra porraBarsaMadrid = new Porra(barsaMadrid, ADMITE_UNA_APUESTA_REPETIDA);

        assertTrue(porraBarsaMadrid.nuevaApuesta(alfredo, resultadoOptimista));
        assertFalse(porraBarsaMadrid.nuevaApuesta(julian, resultadoOptimista));
    }

    @Test
    public void laPorraSoloAdmiteLasApuestasRepetidasQueSeLeIndiquenConDosApuestas() {
        Porra porraBarsaMadrid = new Porra(barsaMadrid, ADMITE_DOS_APUESTAS_REPETIDA);

        assertTrue(porraBarsaMadrid.nuevaApuesta(alfredo, resultadoOptimista));
        assertTrue(porraBarsaMadrid.nuevaApuesta(alfredo, resultadoOptimista));
        assertFalse(porraBarsaMadrid.nuevaApuesta(julian, resultadoOptimista));
    }

}