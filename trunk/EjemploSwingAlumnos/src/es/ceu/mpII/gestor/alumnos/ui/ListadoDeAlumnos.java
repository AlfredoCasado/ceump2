package es.ceu.mpII.gestor.alumnos.ui;

import es.ceu.mpII.gestor.alumnos.infraestructura.ConfiguracionConexionABaseDeDatos;
import es.ceu.mpII.gestor.alumnos.infraestructura.ProveedorDeConexionesABaseDeDatos;
import es.ceu.mpII.gestor.alumnos.modelo.ModeloTablaAlumnos;
import es.ceu.mpII.gestor.alumnos.infraestructura.RepositorioDeAlumnosEnBaseDeDatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListadoDeAlumnos {
    private final ListadoDeAlumnosView vistaDelListadoDeAlumnos;

    ListadoDeAlumnos(ListadoDeAlumnosView vistaDelListadoDeAlumnos) {
        this.vistaDelListadoDeAlumnos = vistaDelListadoDeAlumnos;
        
    }

    public void cargarTodosLosAlumnos() {
        final ModeloTablaAlumnos modeloAlumnos = new ModeloTablaAlumnos(
                                                    new RepositorioDeAlumnosEnBaseDeDatos(
                                                        new ProveedorDeConexionesABaseDeDatos(
                                                            new ConfiguracionConexionABaseDeDatos())));

       vistaDelListadoDeAlumnos.asociarModeloDeAlumnos(modeloAlumnos);

       vistaDelListadoDeAlumnos.buttonActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                modeloAlumnos.actualizar();
            }
        });
    }


}
