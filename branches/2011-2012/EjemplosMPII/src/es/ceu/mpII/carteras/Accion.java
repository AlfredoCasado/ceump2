package es.ceu.mpII.carteras;

class Accion {

    private int cotizacion;
    private final ActualizadorCotizaciones actualizador;

    public Accion(int cotizacion, ActualizadorCotizaciones actualizador) {
        this.cotizacion = cotizacion;
        this.actualizador = actualizador;
    }

    

    long valorPara(int unidades) {
        return cotizacion*unidades;
    }

    void actualizar() {
        cotizacion = actualizador.cotizacionActualDe(this);
    }

}
