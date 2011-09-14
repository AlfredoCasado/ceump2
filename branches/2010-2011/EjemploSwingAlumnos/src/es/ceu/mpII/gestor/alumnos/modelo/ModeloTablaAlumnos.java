package es.ceu.mpII.gestor.alumnos.modelo;

import es.ceu.mpII.gestor.alumnos.infraestructura.RepositorioAlumnos;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaAlumnos extends AbstractTableModel {

    private Alumno[] alumnos;
    private final RepositorioAlumnos repositorioAlumnos;

    public ModeloTablaAlumnos(RepositorioAlumnos repositorioAlumnos) {
         alumnos = repositorioAlumnos.dameTodosLosAlumnos();
         this.repositorioAlumnos = repositorioAlumnos;
    }

    public int getRowCount() {
        return alumnos.length;
    }

    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int row, int col) {
        if (col == 0) return alumnos[row].nombre();
        if (col == 1) return alumnos[row].direccion();
        if (col == 2) return alumnos[row].notaMedia();
        throw new RuntimeException("no se que me estas pidiendo");
    }

    @Override
    public String getColumnName(int col) {
        if (col == 0) return "Nombre";
        if (col == 1) return "Direccion";
        if (col == 2) return "Nota Media";
        throw new RuntimeException();
    }

    public void actualizar() {
        alumnos = repositorioAlumnos.dameTodosLosAlumnos();
        fireTableDataChanged();
    }




}
