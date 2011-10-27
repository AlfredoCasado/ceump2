package es.ceu.mpII.polimorfismo.compra;

public class Compra {

    private String nombre;
    private LineaDeCompra[] lineasDeCompra;

    public Compra(String nombre, LineaDeCompra[] lineasDeCompra) {
        this.nombre = nombre;
        this.lineasDeCompra = lineasDeCompra;
    }

    public String imprimir(Formato formato) {
        formato.EscribirNombre(nombre);

        for (LineaDeCompra linea : lineasDeCompra) {
            formato.EscribirLinea(linea);
        }

        formato.escribirTotal(total());

        return formato.comoCadena();
    }

    private int total() {
        int total = 0;
        for (LineaDeCompra linea : lineasDeCompra) {
            total += linea.total();
        }
        return total;
    }


}
