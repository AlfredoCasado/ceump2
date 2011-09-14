package es.ceu.mpII.calculodenominas;

public class EmpleadoPorHoras extends Empleado {

    private int numeroHoras;
    private int sueldoPorHora;

    public EmpleadoPorHoras(String nombre, int numeroHoras, int sueldoPorHora) {
        super(nombre);
        this.numeroHoras = numeroHoras;
        this.sueldoPorHora = sueldoPorHora;
    }

    @Override
    public long calcularNomina() {
        return numeroHoras * sueldoPorHora;
    }

    @Override
    public String getTipo() {
        return "POR_HORAS";
    }

}
