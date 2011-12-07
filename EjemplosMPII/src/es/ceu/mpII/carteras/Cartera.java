package es.ceu.mpII.carteras;

import java.util.Set;

public class Cartera {

    private Set<Inversion> inversiones;

    public Cartera(Set<Inversion> inversiones) {
        this.inversiones = inversiones;
    }

    public long total() {
        long total = 0;
        for (Inversion inversion : inversiones) {
            total+= inversion.total();
        }
        return total;
    }

    public void actualizar() {
        for (Inversion inversion : inversiones) {
            inversion.actualizar();
        }
    }

}
