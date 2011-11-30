package es.ceu.mpII.carteras;

class Accion {

    private int cotizacion;

    public Accion(int cotizacion) {
        this.cotizacion = cotizacion;
    }

    

    long valorPara(int unidades) {
        return cotizacion*unidades;
    }

}
