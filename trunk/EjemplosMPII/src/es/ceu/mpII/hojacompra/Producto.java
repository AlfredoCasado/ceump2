package es.ceu.mpII.hojacompra;

class Producto {

    private final String nombre;
    private final int precio;

    Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    int precio() {
        return precio;
    }

}
