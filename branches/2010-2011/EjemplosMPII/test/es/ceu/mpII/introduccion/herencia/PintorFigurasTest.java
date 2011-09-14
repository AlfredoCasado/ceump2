package es.ceu.mpII.introduccion.herencia;

import org.junit.Test;

public class PintorFigurasTest {

    @Test
    public void pintorFigurasTest() {
        
        Figura[] figuras = new Figura[2];
        figuras[0] = new Cuadrado(3);
        figuras[1] = new Circulo(2);
        PintorFiguras pf = new PintorFiguras(figuras);
        pf.pintarFiguras();
    }


}