package es.ceu.mpII.taller;

class Reparacion {

    private long costo;
    private String fecha;
    private String descripcion;

    public Reparacion(long costo, String fecha, String descripcion) {
        this.costo = costo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public long costo() {
        return costo;
    }

}
