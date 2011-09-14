package es.ceu.mpII.introduccion.ejerciciocargatrenes;

class Mercancia {
    private final int peso;
    private final boolean peligrosa;

    Mercancia(int peso) {
        this.peso = peso;
        this.peligrosa = false;
    }

    Mercancia(int peso, boolean peligrosa) {
        this.peso = peso;
        this.peligrosa = peligrosa;
    }


    int dameTuPeso() {
        return peso;
    }

    public boolean esPeligrosa() {
        return peligrosa;
    }



}
