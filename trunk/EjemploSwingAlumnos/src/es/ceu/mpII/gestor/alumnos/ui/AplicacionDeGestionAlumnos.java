package es.ceu.mpII.gestor.alumnos.ui;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class AplicacionDeGestionAlumnos {

    ListadoDeAlumnos listadoDeAlumnos;

    public static void main(String[] args) {
        new AplicacionDeGestionAlumnos().iniciar();
    }

    private void iniciar() {
        JFrame ventanaPrincipal = construirVentanaPrincipal();
        agregarListadoDeAlumnosA(ventanaPrincipal);
        listadoDeAlumnos.cargarTodosLosAlumnos();
    }

    private JFrame construirVentanaPrincipal() throws HeadlessException {
        JFrame ventanaPrincipal = new JFrame("Gestión de Alumnos");
        ventanaPrincipal.setLayout(new BorderLayout());
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return ventanaPrincipal;
    }

    private void agregarListadoDeAlumnosA(JFrame ventanaPrincipal) {
        ListadoDeAlumnosView vistaDelListadoDeAlumnos = new ListadoDeAlumnosView();
        listadoDeAlumnos = new ListadoDeAlumnos(vistaDelListadoDeAlumnos);
        ventanaPrincipal.getContentPane().add(vistaDelListadoDeAlumnos, BorderLayout.CENTER);
        ventanaPrincipal.pack();
    }



}
