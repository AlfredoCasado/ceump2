package es.ceu.mpII.introduccion.ejerciciocargatrenes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TrenTest {

   @Test
   public void elTrenMeDiceQueNoTieneEspacioDisponibleCuandoSeSuperaLaCargaMaxima() {
       Tren tren = new Tren(3);
       assertFalse(tren.tieneEspacioDisponiblePara(new Mercancia(4)));
   }

   @Test
   public void elTrenMeDiceQueTieneEspacioDisponible() {
       Tren tren = new Tren(1);
       assertTrue(tren.tieneEspacioDisponiblePara(new Mercancia(1)));
   }

   @Test
   public void anadoMercanciasAlTrenHastaQueMeDiceQueNoTieneEspacio() {
       Tren tren = new Tren(3);
       tren.guardar(new Mercancia(1));
       tren.guardar(new Mercancia(2));
       assertFalse(tren.tieneEspacioDisponiblePara(new Mercancia(1)));
   }
}