package es.ceu.mpII.nominas;

class EmpleadoSalarioBase implements Empleado {

    private final String nombre;
    private final int salarioBase;

    public EmpleadoSalarioBase(String nombre, int salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void pintarNomina() {
        System.out.println(nombre + "Empleado con salario base " + salarioBase);
    }

}
