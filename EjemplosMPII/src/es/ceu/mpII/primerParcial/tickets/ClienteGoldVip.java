package es.ceu.mpII.primerParcial.tickets;

public class ClienteGoldVip extends Cliente {

    public ClienteGoldVip(String nombre, Integer dineroGastado) {
        super(nombre,dineroGastado);
        this.porcetanjeChequesRegalo = 0.5f;
    }

    @Override
    public Integer calcularImporteTickets() {
        return super.calcularImporteTickets() + 20;
    }

    

}
