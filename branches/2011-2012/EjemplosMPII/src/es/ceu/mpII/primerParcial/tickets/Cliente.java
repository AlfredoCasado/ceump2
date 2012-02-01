package es.ceu.mpII.primerParcial.tickets;

abstract class Cliente {

    private String nombre;
    private Integer dineroGastado;
    protected float porcetanjeChequesRegalo;

    public Cliente(String nombre, Integer dineroGastado) {
        this.nombre = nombre;
        this.dineroGastado = dineroGastado;
    }

    public Integer calcularImporteTickets() {
        return (int)(dineroGastado*porcetanjeChequesRegalo);
    }

}
