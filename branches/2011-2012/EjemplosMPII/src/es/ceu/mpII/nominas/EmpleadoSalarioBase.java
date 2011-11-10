package es.ceu.mpII.nominas;

class EmpleadoSalarioBase extends Empleado {

    private final int salarioBase;

    public EmpleadoSalarioBase(String nombre, int salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    protected String tipo() {
        return "con salario base";
    }

    @Override
    protected int nomina() {
        return salarioBase;
    }

}
