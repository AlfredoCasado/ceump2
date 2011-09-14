package es.ceu.mpII.swing.models;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.tree.TreeModel;

public class ExploradorArchivos {
    public static final String WINDOWS_LOOK_AND_FEEL = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";

    private final PanelExploradorArchivos panelExploradorArchivos = new PanelExploradorArchivos();
    private final TreeModel modeloArbolFicheros;
    private final AbstractTableModel modeloTablaFicheros;

    public ExploradorArchivos() {
        crearVentanaPrincipalDeLaAplicacion();

        File root = seleccionarDirectorioRaiz();
        modeloArbolFicheros = new ModeloArbolFicheros(root);
        modeloTablaFicheros = new ModeloTablaFichero(root);

        panelExploradorArchivos.establecerModeloArbol(modeloArbolFicheros);
     
        panelExploradorArchivos.addFileTreeSelectionListener(new TreeSelectionListener() {
          public void valueChanged(TreeSelectionEvent e) {
              File file = (File) e.getPath().getLastPathComponent();
              if (file.isDirectory()) {
                panelExploradorArchivos.establecerModeloTabla(new ModeloTablaFichero(file));
              }
            }
        });
    }

    private void crearVentanaPrincipalDeLaAplicacion() throws HeadlessException {
        JFrame ventanaPrincipal = new JFrame("Explorador de Archivos SWING");
        ventanaPrincipal.setLayout(new BorderLayout());
        ventanaPrincipal.getContentPane().add(panelExploradorArchivos);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        establecerLookAndFeel();
        new ExploradorArchivos();
    }

    private static void establecerLookAndFeel() {
        try {
            UIManager.setLookAndFeel(WINDOWS_LOOK_AND_FEEL);
        } catch (Exception e) {
            System.out.println("no se encuentra el look and feel: " + 
                                WINDOWS_LOOK_AND_FEEL + 
                                ", se utilizara el look and feel por defecto");
        }
    }

    private File seleccionarDirectorioRaiz() {
        return new File(System.getProperty("user.home"));
    }
}
