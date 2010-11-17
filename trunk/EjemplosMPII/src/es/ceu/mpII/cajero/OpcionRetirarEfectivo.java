package es.ceu.mpII.cajero;

public class OpcionRetirarEfectivo implements Opcion {

    public String dameNombre() {
        return "Retirada de efectivo";
    }

    public void ejecutar() {
        System.out.println("no hay dinero disponible en el cajero");
    }

}
