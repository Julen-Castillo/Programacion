/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ModeloBD.GenericoBD;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1gdaw03
 */
public class Menu extends javax.swing.JFrame {
public Alta vAlta;
public String operacion;
public Menu vMenu;
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JSeparator();
        bModificar = new javax.swing.JButton();
        bAlta = new javax.swing.JButton();
        bBaja = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mAltaCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mAltaAbogado = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mAltaCaso = new javax.swing.JMenuItem();
        mBajaCliente = new javax.swing.JMenu();
        mBajaClient = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mBajaAbogado = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mBajaCaso = new javax.swing.JMenuItem();
        mModificarCliente = new javax.swing.JMenu();
        mModificarClient = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mModificarAbogado = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mModificarCaso = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/martillo.png"))); // NOI18N

        bAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapizs.png"))); // NOI18N

        bBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calavera.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setText("SOLO DIOS PUEDE JUZGARTE");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iluminati.png"))); // NOI18N

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("SALIR");

        jMenu1.setText("Alta");

        mAltaCliente.setText("Cliente");
        mAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAltaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mAltaCliente);
        jMenu1.add(jSeparator1);

        mAltaAbogado.setText("Abogado");
        jMenu1.add(mAltaAbogado);
        jMenu1.add(jSeparator2);

        mAltaCaso.setText("Caso");
        mAltaCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAltaCasoActionPerformed(evt);
            }
        });
        jMenu1.add(mAltaCaso);

        jMenuBar1.add(jMenu1);

        mBajaCliente.setText("Baja");

        mBajaClient.setText("Cliente");
        mBajaClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBajaClientActionPerformed(evt);
            }
        });
        mBajaCliente.add(mBajaClient);
        mBajaCliente.add(jSeparator3);

        mBajaAbogado.setText("Abogado");
        mBajaCliente.add(mBajaAbogado);
        mBajaCliente.add(jSeparator4);

        mBajaCaso.setText("Caso");
        mBajaCliente.add(mBajaCaso);

        jMenuBar1.add(mBajaCliente);

        mModificarCliente.setText("Modificar");

        mModificarClient.setText("Cliente");
        mModificarCliente.add(mModificarClient);
        mModificarCliente.add(jSeparator5);

        mModificarAbogado.setText("Abogado");
        mModificarAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModificarAbogadoActionPerformed(evt);
            }
        });
        mModificarCliente.add(mModificarAbogado);
        mModificarCliente.add(jSeparator7);

        mModificarCaso.setText("Caso");
        mModificarCliente.add(mModificarCaso);

        jMenuBar1.add(mModificarCliente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bAlta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBaja))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bBaja)
                            .addComponent(bModificar)
                            .addComponent(bAlta))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAltaCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAltaCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mAltaCasoActionPerformed

    private void mAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAltaClienteActionPerformed
     // operacion = "cliente";
      vAlta = new Alta("altacliente");
      vAlta.setVisible(true);
       
       
       
       
    }//GEN-LAST:event_mAltaClienteActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
    try {
       // GenericoBD.cerrarBD();
        System.exit(0);
    } catch (Exception ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_bSalirActionPerformed

    private void mBajaClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBajaClientActionPerformed
        vAlta = new Alta("bajacliente");
        vAlta.setVisible(true);
    }//GEN-LAST:event_mBajaClientActionPerformed

    private void mModificarAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModificarAbogadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mModificarAbogadoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlta;
    private javax.swing.JButton bBaja;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JMenuItem mAltaAbogado;
    private javax.swing.JMenuItem mAltaCaso;
    private javax.swing.JMenuItem mAltaCliente;
    private javax.swing.JMenuItem mBajaAbogado;
    private javax.swing.JMenuItem mBajaCaso;
    private javax.swing.JMenuItem mBajaClient;
    private javax.swing.JMenu mBajaCliente;
    private javax.swing.JMenuItem mModificarAbogado;
    private javax.swing.JMenuItem mModificarCaso;
    private javax.swing.JMenuItem mModificarClient;
    private javax.swing.JMenu mModificarCliente;
    // End of variables declaration//GEN-END:variables
}
