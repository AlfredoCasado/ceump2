package es.ceu.mpII.calculodenominas;

import java.text.MessageFormat;

public class ServicioCalculoNominas {

    RepositorioEmpleados empleados;

    public ServicioCalculoNominas(RepositorioEmpleados empleados) {
        this.empleados = empleados;
    }

    public void pintarLasNominasDeLosEmpleados() {
        Empleado[] todosLosEmpleados = empleados.obtenerTodosLosEmpleados();
        for (Empleado empleado : todosLosEmpleados) {
            final String nombre = empleado.obtenerNombre();
            final long nomina = empleado.calcularNomina();
            final String tipo = empleado.getTipo();

            System.out.println(MessageFormat.format("el empleado {0} de tipo {2} tiene este mes una nomina de {1}", nombre, nomina, tipo));
        }
    }

}
