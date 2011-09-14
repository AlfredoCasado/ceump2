package es.ceu.mpII.introduccion.ejerciciocargatrenes;

import java.util.Set;

public class Almacen {

    private final Set<Mercancia> mercancias;
    private int mercanciaActual = 0;

    public Almacen(Set<Mercancia> mercancias) {
        this.mercancias = mercancias;
    }

    boolean noEstaVacio() {
        return !mercancias.isEmpty();
    }

    Mercancia dameLaSiguienteMercancia() {
        Mercancia mercancia = mercancias.iterator().next();
        mercancias.remove(mercancia);
        return mercancia;
    }
}
