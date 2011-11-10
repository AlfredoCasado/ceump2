package es.ceu.mpII.nominas;

class EmpleadoPorHoras extends Empleado {
    private final int importePorHora;
    private final int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int importePorHora, int horasTrabajadas) {
        super(nombre);
        this.importePorHora = importePorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected String tipo() {
        return "por horas";
    }

    @Override
    protected int nomina() {
        return importePorHora*horasTrabajadas;
    }

}
