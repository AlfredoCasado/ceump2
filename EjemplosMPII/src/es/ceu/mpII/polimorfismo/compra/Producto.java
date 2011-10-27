package es.ceu.mpII.polimorfismo.compra;

class Producto {

    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    int precio() {
        return precio;
    }

    String nombre() {
        return nombre;
    }

}
