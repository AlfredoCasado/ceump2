package es.ceu.mpII.hojacompra;

import org.junit.Test;
import static org.junit.Assert.*;

public class HojaDeCompraTest {

    HojaDeCompra hojaDeCompra = new HojaDeCompra();
    Producto television = new Producto("tv", 300);
    Producto ipod = new Producto("ipod", 180);
    Producto disco = new Producto("disco", 100);

    @Test
    public void debe_permitir_que_se_le_agrege_un_producto() {
        hojaDeCompra.agregar(television);
        assertEquals(1, hojaDeCompra.unidadesDe(television));
    }

    @Test
    public void debe_permitir_que_se_le_agregen_varios_producto_del_mismo_tipo() {
        hojaDeCompra.agregar(television);
        hojaDeCompra.agregar(television);

        assertEquals(2, hojaDeCompra.unidadesDe(television));
    }

    @Test
    public void debe_permitir_que_se_le_agregen_varios_productos_de_tipos_diferentes() {
        hojaDeCompra.agregar(television);
        hojaDeCompra.agregar(ipod);
        hojaDeCompra.agregar(disco);

        assertEquals(1, hojaDeCompra.unidadesDe(television));
        assertEquals(1, hojaDeCompra.unidadesDe(ipod));
        assertEquals(1, hojaDeCompra.unidadesDe(disco));
    }

    @Test
    public void debe_calcular_el_importe_total() {
        hojaDeCompra.agregar(ipod);
        hojaDeCompra.agregar(ipod);
        hojaDeCompra.agregar(television);

        assertEquals(660, hojaDeCompra.total());
    }
}
