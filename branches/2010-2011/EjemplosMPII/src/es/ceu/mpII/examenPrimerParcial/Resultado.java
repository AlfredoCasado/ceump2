package es.ceu.mpII.examenPrimerParcial;

class Resultado {

    private final int marcadorLocal;
    private final int marcadorVisitante;

    public Resultado(int marcadorLocal, int marcadorVisitante) {
        this.marcadorLocal = marcadorLocal;
        this.marcadorVisitante = marcadorVisitante;
    }

    @Override
    public boolean equals(Object obj) {
        Resultado resultado = (Resultado)obj;
        return resultado.marcadorLocal == marcadorLocal &&
               resultado.marcadorVisitante == marcadorVisitante;
    }



}
