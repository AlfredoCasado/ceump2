
package es.ceu.mpII.swing.models;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

class ModeloTablaFichero extends AbstractTableModel {
  public static final int NUMERO_COLUMNAS_DE_LA_TABLA = 6;
  protected File dir;
  protected String[] filenames;

  protected String[] columnNames = new String[] {
    "nombre", "tamaño", "ultima modificación", "es directorio", "permiso lectura", "permiso escritura"
  };

  protected Class[] columnClasses = new Class[] {
    String.class, Long.class, Date.class, Boolean.class, Boolean.class, Boolean.class
  };

  public ModeloTablaFichero(File dir) {
    this.dir = dir;
    this.filenames = dir.list(new FilenameFilter() {
            public boolean accept(File file, String fileName) {
                return !fileName.startsWith(".");
            }
        });
  }

  public int getColumnCount() { 
      return NUMERO_COLUMNAS_DE_LA_TABLA;
  }
  public int getRowCount() { 
      return filenames.length;
  }

  public String getColumnName(int col) { 
      return columnNames[col];
  }

  public Class getColumnClass(int col) {
      return columnClasses[col];
  }

  public Object getValueAt(int row, int col) {
    File f = new File(dir, filenames[row]);
    switch(col) {
    case 0: return filenames[row];
    case 1: return new Long(f.length());
    case 2: return new Date(f.lastModified());
    case 3: return f.isDirectory() ? Boolean.TRUE : Boolean.FALSE;
    case 4: return f.canRead() ? Boolean.TRUE : Boolean.FALSE;
    case 5: return f.canWrite() ? Boolean.TRUE : Boolean.FALSE;
    default: return null;
    }
  }
}
