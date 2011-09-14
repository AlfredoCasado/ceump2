package es.ceu.mpII.hojacompra;

class EntradasProducto {

    private Producto producto;
    private int numeroUnidades = 0;

    void agregar(Producto producto) {
        this.producto = producto;
        numeroUnidades++;
    }

    boolean esEntradaDe(Producto producto) {
        return this.producto.equals(producto);
    }

    int unidades() {
        return numeroUnidades;
    }

    int total() {
        return numeroUnidades*producto.precio();
    }

}
