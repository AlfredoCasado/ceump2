package es.ceu.mpII.polimorfismo.compra;

import org.junit.Test;

public class CompraTest {

    @Test
    public void imprimir_una_compra_en_html() {

        Producto coca_cola = new Producto("coca-cola", 2);
        Producto yogurt = new Producto("yogurt", 1);

        LineaDeCompra[] lineasDeCompra = new LineaDeCompra[2];
        lineasDeCompra[0] = new LineaDeCompra(coca_cola, 2);
        lineasDeCompra[1] = new LineaDeCompra(yogurt, 9);

        Compra compra = new Compra("mi_lista_de_la_compra", lineasDeCompra);

        String htmlDeLaCompra = compra.imprimir(new FormatoHtml());

        System.out.println(htmlDeLaCompra);
    }

}