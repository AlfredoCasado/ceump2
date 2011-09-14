package es.ceu.mpII.colecciones.sorteopractica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SorteoPractica {

    List<String> grupos = Arrays.asList("Alvaro Del Rosal",
                                        "Manuel Conde y Miguel Angel Arquero",
                                        "Juan Antonio Ramos y Carlos Monedero",
                                        "Fausto Escrigas",
                                        "Luis Fernandez Canivell",
                                        "Hector Garrido y Jose Manuel Sanchez",
                                        "Bosco Smith Peñas");

    List<String> temas = Arrays.asList("Refactorizacion",
                                       "Patrones de diseño",
                                       "Métricas de calidad de programas OO",
                                       "Principios SOLID de diseño de clases",
                                       "Comparativa lenguajes tipado dinámico y tipado estático");

    List<String> fechas = Arrays.asList("Miercoles 2 de febrero - primer turno",
                                        "Miercoles 2 de febrero - segundo turno",
                                        "Viernes 4 de febrero - primer turno",
                                        "Viernes 4 de febrero - segundo turno",
                                        "Viernes 4 de febrero - tercer turno",
                                        "Miercoles 9 de febrero - primer turno",
                                        "Miercoles 9 de febrero - segundo turno");
    private int temaActual = 0;
    private int fechaActual = 0;


    public void sortearFechasDeEntregaYTemas() {
        desordenarTemasYFechas();
        for (String grupo: grupos) {
            final String tema = obtenerSiguienteTemaPara(grupo);
            final String fecha = obtenerSiguienteFecha();
            pintarResultado(grupo, tema, fecha);
        }
    }

    private void desordenarTemasYFechas() {
        Collections.shuffle(temas);
        Collections.shuffle(fechas);
    }

    private void pintarResultado(String grupo, final String tema, final String fecha) {
        System.out.println("==========================================");
        System.out.println("GRUPO:" + grupo);
        System.out.println("TEMA:" + tema);
        System.out.println("FECHA:" + fecha);
        System.out.println("==========================================");
    }

    private String obtenerSiguienteTemaPara(final String grupo) {
        if (grupo.equals("Alvaro Del Rosal")) return "top 10 problemas de programación en java y guias de estilo";
        if (grupo.equals("Luis Fernandez Canivell")) return "herencia multiple: problemas, posibilidades, alternativas";

        return temas.get(temaActual++);
    }

    private String obtenerSiguienteFecha() {
        return fechas.get(fechaActual++);
    }

    public static void main(String[] args) {
        new SorteoPractica().sortearFechasDeEntregaYTemas();
    }
}
