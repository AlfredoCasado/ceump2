package es.ceu.mpII.calculodenominas;

public class RepositorioEmpleados {

    public Empleado[] obtenerTodosLosEmpleados() {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new EmpleadoConSalarioBase("alfredo", 4000);
        empleados[1] = new EmpleadoConSalarioBase("pedro", 3000);
        empleados[2] = new EmpleadoPorHoras("julian", 40, 30);
        return empleados;
    }

}
