package es.ceu.mpII.gestor.alumnos.ui;

import es.ceu.mpII.gestor.alumnos.modelo.ModeloTablaAlumnos;
import es.ceu.mpII.gestor.alumnos.infraestructura.RepositorioAlumnosEnMemoria;

class ListadoDeAlumnos {
    private final ListadoDeAlumnosView vistaDelListadoDeAlumnos;

    ListadoDeAlumnos(ListadoDeAlumnosView vistaDelListadoDeAlumnos) {
        this.vistaDelListadoDeAlumnos = vistaDelListadoDeAlumnos;
        
    }

    public void cargarTodosLosAlumnos() {
        ModeloTablaAlumnos modeloAlumnos = new ModeloTablaAlumnos(new RepositorioAlumnosEnMemoria());
        vistaDelListadoDeAlumnos.asociarModeloDeAlumnos(modeloAlumnos);
    }


}
