/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Excepciones.CampoVacio;
import Excepciones.ExceptionGenerica;
import Excepciones.ExceptionNumerica;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import main.Main;

/**
 *
 * @author Julen
 */
public class VentanaAlta extends javax.swing.JFrame {


    
    
    public VentanaAlta() {
        initComponents();
        Main.llenarCombobox(cbPuesto);
    }
    
    public void  vaciarCampos(){
        
        tfNombreEquipo.setText("");
        tfEscudo.setText("");
        tfNombreJugador.setText("");
        tfDorsal.setText("");
        cbPuesto.setSelectedIndex(-1);
        
        
    }
    
 public void validarNombreEquipo()throws Exception{
       int comboPuestos;
  
            if (tfNombreEquipo.getText().isEmpty()){
               throw new CampoVacio(); 
            }           
            else {    
              Pattern pat = Pattern.compile("^[A-Z][a-z]{1,}");
              Matcher mat = pat.matcher(tfNombreEquipo.getText());
   
                 if (mat.matches()==false) {
                 throw new ExceptionGenerica();

        }      
           
            }
           
 }
 public void  validarEscudo() throws Exception{
  
     if (tfEscudo.getText().isEmpty()){
            throw new CampoVacio();
            
     }
     else {
          Pattern pat = Pattern.compile("^[A-Z][a-z]{1,}");
          Matcher mat = pat.matcher(tfEscudo.getText());
   
                 if (mat.matches()==false) {
                 throw new ExceptionGenerica();
     }
 }
 }
   public void  validarNombreJugador() throws Exception{
      if(tfNombreJugador.getText().isEmpty()) {
          throw new CampoVacio();
      }
       else {
          Pattern pat = Pattern.compile("^[A-Z][a-z]{1,}");
          Matcher mat = pat.matcher(tfNombreJugador.getText());
   
                 if (mat.matches()==false) {
                 throw new ExceptionGenerica();
      
   }
      }
   }
   
   public void validarDorsal() throws Exception {
       if(tfDorsal.getText().isEmpty()){
           throw new CampoVacio();
           
       }
       else {
           Pattern pat = Pattern.compile("^[1-9]$");
          Matcher mat = pat.matcher(tfDorsal.getText());
   
                 if (mat.matches()==false) {
                 throw new ExceptionNumerica();
           
       }
   }
   }
 
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNombreEquipo = new javax.swing.JTextField();
        tfNombreJugador = new javax.swing.JTextField();
        cbPuesto = new javax.swing.JComboBox<>();
        bMasJugadores = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        tfDorsal = new javax.swing.JTextField();
        tfEscudo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Noombre de equipo:");

        jLabel2.setText("Escudo:");

        jLabel3.setText("------------------------------------- Jugadores -----------------------------------");

        jLabel4.setText("Jugador:");

        jLabel5.setText("Puesto:");

        jLabel6.setText("Dorsal:");

        tfNombreEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreEquipoActionPerformed(evt);
            }
        });

        tfNombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreJugadorActionPerformed(evt);
            }
        });

        cbPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPuestoActionPerformed(evt);
            }
        });

        bMasJugadores.setText("Mas Jugadores");
        bMasJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasJugadoresActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        tfDorsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDorsalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bMasJugadores)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(bAceptar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bSalir))
                                .addComponent(tfNombreEquipo)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(cbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfNombreJugador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfEscudo, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                            .addGap(0, 17, Short.MAX_VALUE))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMasJugadores)
                    .addComponent(bAceptar)
                    .addComponent(bSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreEquipoActionPerformed

    private void tfNombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreJugadorActionPerformed
       
    }//GEN-LAST:event_tfNombreJugadorActionPerformed

    private void cbPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPuestoActionPerformed
      
    }//GEN-LAST:event_cbPuestoActionPerformed

    private void tfDorsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDorsalActionPerformed
       
    }//GEN-LAST:event_tfDorsalActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
      

 
        
        try {

       validarNombreEquipo();
       validarEscudo();
       validarNombreJugador();
       validarDorsal();
       
       int comboPuestos;

            comboPuestos = cbPuesto.getSelectedIndex();
            Main.darAlta(tfNombreEquipo.getText(),tfEscudo.getText(),tfNombreJugador.getText(),comboPuestos,tfDorsal.getText());
            vaciarCampos();   
   
           
       }
       catch (CampoVacio e){
           JOptionPane.showMessageDialog(null, "Campo Obligatorio");
                 tfNombreEquipo.setBackground(Color.YELLOW);
                  tfNombreJugador.setBackground(Color.YELLOW);
                  tfEscudo.setBackground(Color.YELLOW);      
                 tfDorsal.setBackground(Color.YELLOW);
       }
       catch (ExceptionGenerica e){
           
             JOptionPane.showMessageDialog(null, "Error: La primera letra tiene que ser Mayuscula y el resto minusculas");
                  tfNombreEquipo.setBackground(Color.RED);
                  tfNombreJugador.setBackground(Color.RED);
                  tfEscudo.setBackground(Color.RED);
       }
        
        catch (ExceptionNumerica e){
            JOptionPane.showMessageDialog(null, "Error: Numeros del 1 al 9");
            tfDorsal.setBackground(Color.RED);
            
        }
       catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DESCONOCIDO");
           
       }
   
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
       
        
      JOptionPane.showMessageDialog(this,Main.mostrarDatos());
        
        Main.Salir();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bMasJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasJugadoresActionPerformed
    int comboPuestos;
     comboPuestos = cbPuesto.getSelectedIndex();
        
        tfNombreEquipo.setEnabled(false);
       tfEscudo.setEnabled(false);
      /*  Main.darAltaJugadores(tfNombreJugador.getText(),comboPuestos, tfDorsal.getText());*/
      
      Main.darAlta(tfNombreEquipo.getText(),tfEscudo.getText(),tfNombreJugador.getText(),comboPuestos,tfDorsal.getText());
       tfNombreJugador.setText("");
       tfDorsal.setText("");
       cbPuesto.setSelectedIndex(-1);
    }//GEN-LAST:event_bMasJugadoresActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAlta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bMasJugadores;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfDorsal;
    private javax.swing.JTextField tfEscudo;
    private javax.swing.JTextField tfNombreEquipo;
    private javax.swing.JTextField tfNombreJugador;
    // End of variables declaration//GEN-END:variables


}
