package es.ceu.mpII.examenPrimerParcial;

import java.util.HashSet;
import java.util.Set;

public class Porra {
    private final Partido partido;
    private Set<Apuesta> apuestas = new HashSet();
    private final int apuestasRepetidasQueAdmiteLaPorra;

    public Porra(Partido partido, int apuestasRepetidasQueAdmiteLaPorra) {
        this.partido = partido;
        this.apuestasRepetidasQueAdmiteLaPorra = apuestasRepetidasQueAdmiteLaPorra;
    }

    public boolean nuevaApuesta(Usuario usuario, Resultado resultado) {
        int apuestasRepetidas = contarResultadosRepetidos(resultado);

        if (superaElMaximoDeApuestasPermitidas(apuestasRepetidas)) {
            return false;
        }

        apuestas.add(new Apuesta(usuario,resultado));
        return true;
    }

    private boolean superaElMaximoDeApuestasPermitidas(int apuestasRepetidas) {
        return apuestasRepetidasQueAdmiteLaPorra <= apuestasRepetidas;
    }

    private int contarResultadosRepetidos(Resultado resultado) {
        int apuestasRepetidas = 0;
        for (Apuesta apuesta : apuestas) {
            if (apuesta.tieneElResultado(resultado)) {
                apuestasRepetidas++;
            }
        }
        return apuestasRepetidas;
    }

    public Set<Usuario> resultadoDelPartido(Resultado resultadoFinalDelPartido) {
        Set<Usuario> ganadores = new HashSet();
        for (Apuesta apuesta : apuestas) {
            if (apuesta.tieneElResultado(resultadoFinalDelPartido)) {
                ganadores.add(apuesta.usuario());
            }
        }
        return ganadores;
    }

}
