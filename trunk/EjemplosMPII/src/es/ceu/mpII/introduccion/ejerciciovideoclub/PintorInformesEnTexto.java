package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class PintorInformesEnTexto implements PintorInformes {

    public void pintarInforme(Alquiler[] alquileres, int contadorAlquileresRealizados) {
        int importeTotal = 0;
        for (int i = 0; i < contadorAlquileresRealizados; i++) {
            Alquiler alquiler = alquileres[i];
            importeTotal += alquiler.importe();
            System.out.println(alquiler);
        }
        System.out.println("total: " + importeTotal);
    }

    public String formatoSoportado() {
        return "texto";
    }

}
