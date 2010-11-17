package es.ceu.mpII.cajero;

public class OpcionConsultaDeSaldo implements Opcion {

    public String dameNombre() {
       return "Consulta de saldo";
    }

    public void ejecutar() {
        System.out.println("su saldo es de 2000 euros");
    }

}
