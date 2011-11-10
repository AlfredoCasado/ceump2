package es.ceu.mpII.nominas;

class EmpleadoSalarioBaseMasHoras implements Empleado {

    private final String nombre;
    private final int salarioBase;
    private final int importePorHora;
    private final int horasTrabajadas;

    public EmpleadoSalarioBaseMasHoras(String nombre,
                                       int salarioBase,
                                       int importePorHora,
                                       int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.importePorHora = importePorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public void pintarNomina() {
        long nomina = salarioBase + importePorHora*horasTrabajadas;
        System.out.println(nombre + "Empleado con salario base mas horas "
                           + nomina);

    }

}
