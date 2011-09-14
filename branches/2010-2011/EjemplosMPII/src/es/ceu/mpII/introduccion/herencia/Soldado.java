package es.ceu.mpII.introduccion.herencia;

public class Soldado extends Persona {

    private final String rango;

    public Soldado(String nombre, String rango) {
        super(nombre);
        this.rango = rango;
    }

     @Override
     public void saludar() {
        System.out.println("soy un soldado de rango " + rango 
                            + " y me llamo: " + this.nombre());
     }

     public void ponerseFirme() {
         
     }

}
