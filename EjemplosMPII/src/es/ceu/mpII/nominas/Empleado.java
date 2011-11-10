package es.ceu.mpII.nominas;

abstract class Empleado {

    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    void pintarNomina() {
         System.out.println(nombre + " Empleado " + tipo() + ": " + nomina());
    }

    protected abstract String tipo();

    protected abstract int nomina();

}
