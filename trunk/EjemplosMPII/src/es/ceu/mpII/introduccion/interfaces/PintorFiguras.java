package es.ceu.mpII.introduccion.interfaces;

public class PintorFiguras {

    private final Figura[] figurasQueTengoQuePintar;

    public PintorFiguras(Figura[] figurasQueTengoQuePintar) {
        this.figurasQueTengoQuePintar = figurasQueTengoQuePintar;
    }

    public void pintarFiguras() {
        for (Figura figura : figurasQueTengoQuePintar) {
            figura.pintar();
        }
    }

}
