/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.onlinerestaurant.client.presentation;

import co.unicauca.onlinerestaurant.client.domain.chainofResponsibility.Claim;
import co.unicauca.onlinerestaurant.client.domain.chainofResponsibility.ClaimManager;
import co.unicauca.onlinerestaurant.client.domain.chainofResponsibility.TypeEnum;
import javax.swing.JOptionPane;

/**
 *
 * @author JOTA
 */
public class GUIReclamos extends javax.swing.JFrame {

    /**
     * Creates new form GUIReclamos
     */
    public GUIReclamos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLCausa = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jTexDescripcion = new javax.swing.JTextField();
        jBtnEnviarReclamo = new javax.swing.JButton();
        jLRestaurante = new javax.swing.JLabel();
        jTexCausa = new javax.swing.JTextField();
        jComboRestauran = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RECLAMOS");

        jLCausa.setText("Causa");

        jLDescripcion.setText("Descripción:");

        jBtnEnviarReclamo.setText("Enviar");
        jBtnEnviarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEnviarReclamoActionPerformed(evt);
            }
        });

        jLRestaurante.setText("Restaurante:");

        jComboRestauran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mister Pollo", "Cafeto", "Hunngry", "Pio Pio", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLCausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboRestauran, 0, 261, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jBtnEnviarReclamo))
                            .addComponent(jTexCausa)
                            .addComponent(jTexDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboRestauran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTexDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jBtnEnviarReclamo)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEnviarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEnviarReclamoActionPerformed
       
        /**
         * varibale para el Id del pedido
         */ 
        
        int idReclamo=1;
        /**
         * Variable para la Causa del reclamo
         */
        String causa = jTexCausa.getText();
        /**
         * variable para la descripcion del reclamo
         */
        String descripcion = jTexDescripcion.getText();
        /**
         * Variable para la clasificacion del reclamo
         */
        TypeEnum type; 
       
       
        if(causa != null & descripcion != null)
        {
           ClaimManager manager = new ClaimManager();
           manager.createAthentionFlow();

           Claim claim = new Claim(1, causa, descripcion,clasificacion());
           manager.getLevelOne().attend(claim); 
           
           //JOptionPane.showMessageDialog(rootPane, manager, causa, HEIGHT, icon);
            JOptionPane.showMessageDialog(this,manager.getLevelOne().attend(claim));
           idReclamo++;
           
        }
        else
        {
        
        }        
        
    }//GEN-LAST:event_jBtnEnviarReclamoActionPerformed
  /*
    maetodo publico encargado de claficar el tipo de reclamo
    */
    public TypeEnum clasificacion(){
       int numero = (int)(Math.random()*5+1);
       if(numero ==1){
         return TypeEnum.UNCLASSIFIED;
       } else if(numero ==2){
         return TypeEnum.BASIC;
       } else if (numero ==3){
         return TypeEnum.DELIVERY;
       } else if (numero ==4){
         return TypeEnum.HIGH;
       }
       else
       {
         return TypeEnum.HIGHER;
       }
    }
    public void clasificarNivel()
    {
    
    
    }
    
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
            java.util.logging.Logger.getLogger(GUIReclamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIReclamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIReclamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIReclamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIReclamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEnviarReclamo;
    private javax.swing.JComboBox<String> jComboRestauran;
    private javax.swing.JLabel jLCausa;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLRestaurante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTexCausa;
    private javax.swing.JTextField jTexDescripcion;
    // End of variables declaration//GEN-END:variables
}
