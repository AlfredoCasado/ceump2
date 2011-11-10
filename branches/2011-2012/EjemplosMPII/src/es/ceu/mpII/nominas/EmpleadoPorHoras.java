package es.ceu.mpII.nominas;

class EmpleadoPorHoras implements Empleado {
    private final String nombre;
    private final int numeroHoras;
    private final int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int importePorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.numeroHoras = importePorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public void pintarNomina() {
        System.out.println(nombre + "Empleado por horas " + numeroHoras*horasTrabajadas);
    }

}
