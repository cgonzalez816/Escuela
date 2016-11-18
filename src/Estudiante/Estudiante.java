/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiante;

import ConexionBD.conexión_postgres;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import java.util.logging.*;
import java.sql.*;

/**
 *
 * @author treznor
 */
public class Estudiante extends javax.swing.JFrame {

    
    /**
     * Creates new form Estudiante
     */
   
//Se Crea Conexión con la Base de Datos
    ConexionBD.conexión_postgres CP = new conexión_postgres("Colegio", "postgres", "cesar");
    
    public Estudiante() throws ClassNotFoundException, SQLException {
        
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPanelPrincipal = new javax.swing.JTabbedPane();
        pnDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDatos = new javax.swing.JTextArea();
        bnDatos = new javax.swing.JButton();
        pnInsertar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCédula = new javax.swing.JTextField();
        txtCarnet = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnModificar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreModificar = new javax.swing.JTextField();
        txCedulaModificar = new javax.swing.JTextField();
        bnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIdBorrar = new javax.swing.JTextField();
        bnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaDatos.setColumns(20);
        txtAreaDatos.setRows(5);
        jScrollPane1.setViewportView(txtAreaDatos);

        bnDatos.setText("Ver Datos");
        bnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDatosLayout = new javax.swing.GroupLayout(pnDatos);
        pnDatos.setLayout(pnDatosLayout);
        pnDatosLayout.setHorizontalGroup(
            pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addGroup(pnDatosLayout.createSequentialGroup()
                        .addComponent(bnDatos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnDatosLayout.setVerticalGroup(
            pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatosLayout.createSequentialGroup()
                .addComponent(bnDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbPanelPrincipal.addTab("DATOS", pnDatos);

        jLabel1.setText("-ID:");

        jLabel2.setText("-Cédula:");

        jLabel3.setText("-Nombre:");

        jButton1.setText("INSERTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInsertarLayout = new javax.swing.GroupLayout(pnInsertar);
        pnInsertar.setLayout(pnInsertarLayout);
        pnInsertarLayout.setHorizontalGroup(
            pnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnInsertarLayout.createSequentialGroup()
                        .addGroup(pnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnInsertarLayout.createSequentialGroup()
                                .addGroup(pnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(6, 6, 6))
                            .addGroup(pnInsertarLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(pnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCédula, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtCarnet)
                            .addComponent(txtNombre))))
                .addGap(206, 206, 206))
        );
        pnInsertarLayout.setVerticalGroup(
            pnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCédula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        tbPanelPrincipal.addTab("INSERTAR", pnInsertar);

        jLabel5.setText("-Cédula: ");

        jLabel6.setText("-Nombre:");

        bnModificar.setText("MODIFICAR");
        bnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnModificarLayout = new javax.swing.GroupLayout(pnModificar);
        pnModificar.setLayout(pnModificarLayout);
        pnModificarLayout.setHorizontalGroup(
            pnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnModificarLayout.createSequentialGroup()
                .addGroup(pnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnModificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnModificarLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txCedulaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnModificarLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(bnModificar))))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        pnModificarLayout.setVerticalGroup(
            pnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txCedulaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnModificar)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        tbPanelPrincipal.addTab("MODIFICAR", pnModificar);

        jLabel4.setText("-ID:");

        bnBorrar.setText("BORRAR");
        bnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnBorrar)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnBorrar))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        tbPanelPrincipal.addTab("BORRAR", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPanelPrincipal))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPanelPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDatosActionPerformed
        // TODO add your handling code here:
        try {
            ResultSet datos = this.CP.select("*", "\"public\".Estudiante", "");
            while (datos.next());
            {
                this.txtAreaDatos.append("ID: " + datos.getString(1) + "Cédula: " + datos.getString(2) + "Nombre: " + datos.getString(3) + "\n");
           
            }
          
        } catch (Exception e) {
            System.err.println("Error: " + e.toString());
        }
    }//GEN-LAST:event_bnDatosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String datos="";
        datos = "('" + this.txtCédula.getText()
        + "' , '" + this.txtCarnet.getText()
        + "' , '" + this.txtNombre.getText()
        + "')";

        this.CP.insertar("\"schUTN\".alumno", datos);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnModificarActionPerformed
        // TODO add your handling code here:
        String estado;
        String datos;

        datos = "set \"nombre\" = '" + this.txtNombreModificar.getText() + "' where \"cédula\" = '"
        + this.txCedulaModificar.getText() + "'";

        estado = this.CP.Modificar("\"schUTN\".alumno", datos);
        System.out.println(estado);
    }//GEN-LAST:event_bnModificarActionPerformed

    private void bnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnBorrarActionPerformed
        // TODO add your handling code here:
        String estado;
        String datos;

        datos = " where \"id\" = '" + this.txtIdBorrar.getText() + "'";

        estado = this.CP.Borrar("\"schUTN\".alumno", datos);

        System.out.println(estado);
    }//GEN-LAST:event_bnBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnBorrar;
    private javax.swing.JButton bnDatos;
    private javax.swing.JButton bnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnDatos;
    private javax.swing.JPanel pnInsertar;
    private javax.swing.JPanel pnModificar;
    private javax.swing.JTabbedPane tbPanelPrincipal;
    private javax.swing.JTextField txCedulaModificar;
    private javax.swing.JTextArea txtAreaDatos;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCédula;
    private javax.swing.JTextField txtIdBorrar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreModificar;
    // End of variables declaration//GEN-END:variables
}
