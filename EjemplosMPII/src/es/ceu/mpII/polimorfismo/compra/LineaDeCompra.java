package es.ceu.mpII.polimorfismo.compra;

class LineaDeCompra {

    private Producto producto;
    private int unidades;

    public LineaDeCompra(Producto producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
    }

    public int total(){
        return producto.precio() * unidades;
    }

    String nombreProducto() {
        return producto.nombre();
    }

    int precioProducto() {
        return producto.precio();
    }

    int numeroUnidades() {
        return unidades;
    }

}
