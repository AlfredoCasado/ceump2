package es.ceu.mpII.hojacompra;

import org.junit.Test;
import static org.junit.Assert.*;

public class EntradasProductoTest {

    @Test
    public void debeCalcularElTotalDeLaEntrada() {
        EntradasProducto entrada = new EntradasProducto();
        Producto tv = new Producto("tv", 300);
        
        entrada.agregar(tv);
        entrada.agregar(tv);
        
        assertEquals(600, entrada.total());
        
    }

}