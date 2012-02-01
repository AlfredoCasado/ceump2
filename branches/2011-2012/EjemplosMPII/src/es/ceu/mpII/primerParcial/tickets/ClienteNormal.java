package es.ceu.mpII.primerParcial.tickets;

public class ClienteNormal extends Cliente {

    public ClienteNormal(String nombre, Integer dineroGastado) {
        super(nombre,dineroGastado);
        this.porcetanjeChequesRegalo = 0.2f;
    }
 

}
