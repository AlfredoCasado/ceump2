package es.ceu.mpII.kata.bowling;

class MarcadorBolos {

    public static final char FALLO = '-';
    public static final char SEMIPLENO = '/';
    public static final char PLENO = 'X';

    public int puntuacionFinal(final String tiradas) {
        int puntuacionFinal = 0;
        int tiradaActual = 0;

        for (int frame = 1; frame<10;frame++) {
            char tirada = tiradas.charAt(tiradaActual);
            if (esUnPleno(tirada)) {
                puntuacionFinal+=puntosEnLaTirada(tiradaActual, tiradas);
                tiradaActual++;
            } else {
                puntuacionFinal+=puntosEnLaTirada(tiradaActual, tiradas);
                puntuacionFinal+=puntosEnLaTirada(tiradaActual+1, tiradas);
                tiradaActual+=2;
            }
        }

        return puntuacionEnUltimoFrame(tiradas, tiradaActual, puntuacionFinal);
    }

    private int puntuacionEnUltimoFrame(final String tiradas, int tiradaActual, int puntuacionFinal) {
        if (esUnPleno(tiradas.charAt(tiradaActual))) {
            puntuacionFinal += 10;
            tiradaActual++;
        }
        if (esUnSemipleno(tiradas.charAt(tiradaActual + 1))) {
            puntuacionFinal += bolosTirados(tiradaActual, tiradas);
            puntuacionFinal += bolosTirados(tiradaActual + 1, tiradas);
            puntuacionFinal += bolosTirados(tiradaActual + 2, tiradas);
        } else {
            puntuacionFinal += bolosTirados(tiradaActual, tiradas);
            puntuacionFinal += bolosTirados(tiradaActual + 1, tiradas);
        }
        return puntuacionFinal;
    }

    private int puntosEnLaTirada(int i, String tiradas) {
        char tirada = tiradas.charAt(i);
        if (esUnSemipleno(tirada)) {
            return bolosTirados(i, tiradas) +
                   bolosTirados(i+1, tiradas);
        }
        if (esUnPleno(tirada)) {
            return bolosTirados(i, tiradas) +
                   bolosTirados(i+1, tiradas) +
                   bolosTirados(i+2, tiradas);
        }
        return bolosTirados(i, tiradas);
    }

    private int bolosTirados(int i, String tiradas) {
        char tirada = tiradas.charAt(i);
        if (esUnFallo(tirada)) {
            return 0;
        }
        if (esUnSemipleno(tirada)) {
            return 10 - bolosTirados(i-1, tiradas);
        }
        if (esUnPleno(tirada)) {
            return 10;
        }
        return Character.getNumericValue(tirada);
    }

    private boolean esUnFallo(char tirada) {
        return tirada == FALLO;
    }

    private boolean esUnSemipleno(char tirada) {
        return tirada == SEMIPLENO;
    }

    private boolean esUnPleno(char tirada) {
        return tirada == PLENO;
    }
}
