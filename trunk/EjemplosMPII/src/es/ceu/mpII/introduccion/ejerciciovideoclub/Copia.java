package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class Copia {

    private boolean copiaDisponible;

    public Copia(boolean copiaDisponible) {
        this.copiaDisponible = copiaDisponible;

    }

    public boolean estaDisponibleParaAlquilar() {
        return copiaDisponible;
    }

}
