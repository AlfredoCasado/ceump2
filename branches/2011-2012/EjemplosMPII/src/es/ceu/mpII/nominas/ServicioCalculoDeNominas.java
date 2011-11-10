package es.ceu.mpII.nominas;

public class ServicioCalculoDeNominas {

    private ListadoEmpleados empleados;

    public ServicioCalculoDeNominas(ListadoEmpleados empleados) {
        this.empleados = empleados;
    }

    public void calcularTodasLasNominas() {
        Empleado[] todosLosEmpleados = empleados.dameTodosLosEmpleados();

        for (Empleado empleado : todosLosEmpleados) {
            empleado.pintarNomina();
        }
    }

}
