package es.ceu.mpII.introduccion.ejerciciovideoclub;

public class PintorInformesHtml implements PintorInformes {

    public void pintarInforme(Alquiler[] alquileres, int contadorAlquileresRealizados) {
        StringBuilder htmlGenerado = new StringBuilder();
        htmlGenerado.append("<h1> Informe de alquileres del cliente</h1>\n");
        int importeTotal = 0;
        for (int i = 0; i < contadorAlquileresRealizados; i++) {
            Alquiler alquiler = alquileres[i];
            importeTotal += alquiler.importe();
            anadirParrafo(htmlGenerado, alquiler);
       }
       anadirEncabezadoH3(htmlGenerado, importeTotal);
       System.out.println(htmlGenerado.toString());
    }

    private void anadirEncabezadoH3(StringBuilder htmlGenerado, int importeTotal) {
        htmlGenerado.append("<h3>total importe: ");
        htmlGenerado.append(importeTotal);
        htmlGenerado.append("</h3>\n");
    }

    private void anadirParrafo(StringBuilder htmlGenerado, Alquiler alquiler) {
        htmlGenerado.append("<p>");
        htmlGenerado.append(alquiler);
        htmlGenerado.append("</p>\n");
    }

    public String formatoSoportado() {
        return "html";
    }


}
