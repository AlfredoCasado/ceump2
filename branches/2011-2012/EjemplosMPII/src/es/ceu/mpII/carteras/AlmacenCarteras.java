package es.ceu.mpII.carteras;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AlmacenCarteras {

    public static final int COTIZACION_100_PUNTOS = 100;
    public static final int COTIZACION_10_PUNTOS = 10;
    public static final int UNIDADES_10 = 10;
    public static final int UNIDADES_20 = 20;


    private Set<Cartera> carteras = new HashSet();
    private Iterator<Cartera> it_cartera;

    public AlmacenCarteras() {
        carteras.add(crearCarteraTecnologicas());
        it_cartera = carteras.iterator();
    }

    boolean haySiguiente() {
        return it_cartera.hasNext();
    }

    Cartera siguienteCartera() {
        return it_cartera.next();
    }

    void guardarActualizada(Cartera carteraAActualizar) {
        carteras.add(carteraAActualizar);
    }

    void volverAlPrincipio() {
        it_cartera = carteras.iterator();
    }

    private Cartera crearCarteraTecnologicas() {
        ActualizadorCotizaciones actualizadorCotizaciones = new ActualizadorCotizaciones();
        ActualizadorMovimientos yoodle = new Yoddle();
        ActualizadorMovimientos eurobits = new Eurobits();

        Accion ibm = new Accion(COTIZACION_100_PUNTOS, actualizadorCotizaciones);
        Accion telefonica = new Accion(COTIZACION_10_PUNTOS, actualizadorCotizaciones);

        Set<Inversion> inversionesTecnologicas = new HashSet();
        inversionesTecnologicas.add(new Inversion(UNIDADES_10, ibm, yoodle));
        inversionesTecnologicas.add(new Inversion(UNIDADES_20, telefonica, eurobits));

        return new Cartera(inversionesTecnologicas);
    }

}
