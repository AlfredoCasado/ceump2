/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ListadoDeAlumnosView.java
 *
 * Created on 01-abr-2011, 19:28:36
 */

package es.ceu.mpII.gestor.alumnos.ui;

import es.ceu.mpII.gestor.alumnos.modelo.ModeloTablaAlumnos;

/**
 *
 * @author alfredocasado
 */
public class ListadoDeAlumnosView extends javax.swing.JPanel {

    /** Creates new form ListadoDeAlumnosView */
    public ListadoDeAlumnosView() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableListadoDeAlumnos = new javax.swing.JTable();
        buttonActualizar = new javax.swing.JButton();

        tableListadoDeAlumnos.setColumnSelectionAllowed(true);
        tableListadoDeAlumnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tableListadoDeAlumnos);
        tableListadoDeAlumnos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        buttonActualizar.setText("Actualizar");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .add(buttonActualizar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(buttonActualizar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buttonActualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListadoDeAlumnos;
    // End of variables declaration//GEN-END:variables

    void asociarModeloDeAlumnos(ModeloTablaAlumnos modeloAlumnos) {
        tableListadoDeAlumnos.setModel(modeloAlumnos);
    }

}
