package es.ceu.mpII.calculodenominas;

public abstract class Empleado {

    final String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public abstract long calcularNomina();
    public abstract String getTipo();

}
