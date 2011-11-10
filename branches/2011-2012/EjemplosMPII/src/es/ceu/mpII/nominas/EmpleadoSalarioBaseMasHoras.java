package es.ceu.mpII.nominas;

class EmpleadoSalarioBaseMasHoras extends Empleado {

    private final int salarioBase;
    private final int importePorHora;
    private final int horasTrabajadas;

    public EmpleadoSalarioBaseMasHoras(String nombre,
                                       int salarioBase,
                                       int importePorHora,
                                       int horasTrabajadas) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.importePorHora = importePorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected String tipo() {
        return "con salario base mas horas";
    }

    @Override
    protected int nomina() {
        return salarioBase+importePorHora*horasTrabajadas;
    }

   
}
