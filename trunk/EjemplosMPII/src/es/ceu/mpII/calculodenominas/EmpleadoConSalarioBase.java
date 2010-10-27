package es.ceu.mpII.calculodenominas;

public class EmpleadoConSalarioBase extends Empleado {

    private int salarioBase;

    public EmpleadoConSalarioBase(String nombre, int salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }


    @Override
    public long calcularNomina() {
        return salarioBase;
    }

    @Override
    public String getTipo() {
        return "SALARIO_BASE";
    }

}
