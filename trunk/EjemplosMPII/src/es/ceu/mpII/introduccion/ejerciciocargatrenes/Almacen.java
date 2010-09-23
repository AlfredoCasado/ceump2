package es.ceu.mpII.introduccion.ejerciciocargatrenes;

class Almacen {

    private final Mercancia[] mercancias;
    private int mercanciaActual = 0;

    public Almacen(Mercancia[] mercancias) {
        this.mercancias = mercancias;
    }

    boolean noEstaVacio() {
        return mercanciaActual < mercancias.length;
    }

    Mercancia dameLaSiguienteMercancia() {
        Mercancia mercancia = mercancias[mercanciaActual];
        mercanciaActual++;
        return mercancia;
    }

}
