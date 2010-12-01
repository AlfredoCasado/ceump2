package es.ceu.mpII.examenPrimerParcial;

import java.util.HashSet;
import java.util.Set;

public class Porra {
    private final Partido partido;
    private Set<Apuesta> apuestas = new HashSet();

    public Porra(Partido partido) {
        this.partido = partido;
    }

    public void nuevaApuesta(Usuario usuario, Resultado resultado) {
        apuestas.add(new Apuesta(usuario,resultado));
    }

    public Usuario resultadoDelPartido(Resultado resultadoFinalDelPartido) {
        for (Apuesta apuesta : apuestas) {
            if (apuesta.tieneElResultado(resultadoFinalDelPartido)) {
                return apuesta.usuario();
            }
        }
        return null;
    }

}
