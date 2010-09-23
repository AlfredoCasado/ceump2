package es.ceu.mpII.introduccion.ejerciciocargatrenes;

public class Tren {

    private final int pesoMaximo;
    private int cargaActual = 0;

    public Tren(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    boolean tieneEspacioDisponiblePara(Mercancia mercancia) {
        int pesoDeLaMercancia = mercancia.dameTuPeso();
        return pesoDeLaMercancia + cargaActual <= pesoMaximo;
    }

    void guardar(Mercancia mercancia) {
        cargaActual+= mercancia.dameTuPeso();
    }

    int dameCargaActual() {
        return cargaActual;
    }

}
