/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJPanel.java
 *
 * Created on 05-may-2010, 0:28:48
 */
package es.ceu.mpII.swing.models;

import javax.swing.event.TreeSelectionListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.tree.TreeModel;

/**
 *
 * @author CEU
 */
public class PanelExploradorArchivos extends javax.swing.JPanel {

    /** Creates new form NewJPanel */
    public PanelExploradorArchivos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFicheros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbolDirectorios = new javax.swing.JTree();

        tablaFicheros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaFicheros);

        jSplitPane1.setRightComponent(jScrollPane1);

        jScrollPane2.setViewportView(arbolDirectorios);

        jSplitPane1.setLeftComponent(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbolDirectorios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tablaFicheros;
    // End of variables declaration//GEN-END:variables

    void establecerModeloArbol(TreeModel modeloArbolFicheros) {
        arbolDirectorios.setModel(modeloArbolFicheros);
    }

    void establecerModeloTabla(AbstractTableModel modeloTablaFicheros) {
        tablaFicheros.setModel(modeloTablaFicheros);
    }

    void addFileTreeSelectionListener(TreeSelectionListener listener) {
        arbolDirectorios.addTreeSelectionListener(listener);
    }
}
