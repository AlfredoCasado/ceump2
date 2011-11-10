package es.ceu.mpII.nominas;

class ListadoEmpleados {

    Empleado[] dameTodosLosEmpleados() {

        Empleado[] todosLosEmpleados = new Empleado[3];
        todosLosEmpleados[0] = new EmpleadoSalarioBase("alfredo", 5000);
        todosLosEmpleados[1] = new EmpleadoPorHoras("julian", 100, 400);
        todosLosEmpleados[2] = new EmpleadoSalarioBaseMasHoras("alberto", 2000, 100, 50);
        return todosLosEmpleados;

    }

}
