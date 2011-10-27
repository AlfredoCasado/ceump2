package es.ceu.mpII.polimorfismo.compra;

interface Formato {

    public void EscribirNombre(String nombre);

    public void EscribirLinea(LineaDeCompra linea);

    public void escribirTotal(int total);

    public String comoCadena();

}
