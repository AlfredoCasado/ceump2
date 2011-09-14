package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class Copia {

    private boolean copiaDisponible;
    private Pelicula pelicula;

    public Copia(boolean copiaDisponible) {
        this.copiaDisponible = copiaDisponible;

    }

    void eresCopiaDe(Pelicula pelicula) {
       this.pelicula = pelicula;
    }

    public boolean estaDisponibleParaAlquilar() {
        return copiaDisponible;
    }

    @Override
    public String toString() {
        return "copia n de la pelicula " + pelicula;
    }


}
