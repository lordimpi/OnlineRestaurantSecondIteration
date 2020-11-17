package co.unicauca.onlinerestaurant.client.presentation;

import co.unicauca.common.domain.entity.User;
import co.unicauca.onlinerestaurant.client.access.Factory;
import co.unicauca.onlinerestaurant.client.access.IUserAccess;
import co.unicauca.onlinerestaurant.client.domain.services.UserService;
import co.unicauca.onlinerestaurant.client.infra.Messages;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Acuña
 */
public class GUICreateUser extends javax.swing.JFrame {

    /**
     * Creates new form GUICreateUser
     */
    public GUICreateUser() {
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

        jPnNorte = new javax.swing.JPanel();
        jPnSur = new javax.swing.JPanel();
        jBtnRegistrarse = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jPnCentro = new javax.swing.JPanel();
        jLbNombre = new javax.swing.JLabel();
        jTxfNombre = new javax.swing.JTextField();
        jLbApellido = new javax.swing.JLabel();
        jTxfApellido = new javax.swing.JTextField();
        jLbDireccion = new javax.swing.JLabel();
        JTxfDireccion = new javax.swing.JTextField();
        jLbEmail = new javax.swing.JLabel();
        jTxfEmail = new javax.swing.JTextField();
        jLbTelefono = new javax.swing.JLabel();
        jTxfTelefono = new javax.swing.JTextField();
        jLbPassword = new javax.swing.JLabel();
        jTxfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 336));
        setResizable(false);

        jPnNorte.setBackground(new java.awt.Color(54, 33, 88));
        jPnNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnNorte.setPreferredSize(new java.awt.Dimension(450, 50));

        javax.swing.GroupLayout jPnNorteLayout = new javax.swing.GroupLayout(jPnNorte);
        jPnNorte.setLayout(jPnNorteLayout);
        jPnNorteLayout.setHorizontalGroup(
            jPnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
        jPnNorteLayout.setVerticalGroup(
            jPnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        getContentPane().add(jPnNorte, java.awt.BorderLayout.PAGE_START);

        jPnSur.setBackground(new java.awt.Color(54, 33, 88));
        jPnSur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnSur.setPreferredSize(new java.awt.Dimension(450, 50));

        jBtnRegistrarse.setText("Registrarse");
        jBtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarseActionPerformed(evt);
            }
        });
        jPnSur.add(jBtnRegistrarse);

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPnSur.add(jBtnCancelar);

        getContentPane().add(jPnSur, java.awt.BorderLayout.PAGE_END);

        jPnCentro.setLayout(new java.awt.GridLayout(6, 2));

        jLbNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbNombre.setText("Nombre:");
        jPnCentro.add(jLbNombre);

        jTxfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxfNombre.setToolTipText("txt_id");
        jPnCentro.add(jTxfNombre);

        jLbApellido.setBackground(new java.awt.Color(255, 255, 255));
        jLbApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbApellido.setText("Apellido:");
        jPnCentro.add(jLbApellido);

        jTxfApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPnCentro.add(jTxfApellido);

        jLbDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jLbDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbDireccion.setText("Direccion:");
        jPnCentro.add(jLbDireccion);

        JTxfDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPnCentro.add(JTxfDireccion);

        jLbEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbEmail.setText("Email:");
        jLbEmail.setToolTipText("");
        jPnCentro.add(jLbEmail);

        jTxfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPnCentro.add(jTxfEmail);

        jLbTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTelefono.setText("Telefono:");
        jLbTelefono.setToolTipText("");
        jPnCentro.add(jLbTelefono);

        jTxfTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPnCentro.add(jTxfTelefono);

        jLbPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbPassword.setText("Contraseña:");
        jLbPassword.setToolTipText("");
        jPnCentro.add(jLbPassword);

        jTxfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPnCentro.add(jTxfPassword);

        getContentPane().add(jPnCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarseActionPerformed
        if (JTxfDireccion.getText().isEmpty() || jTxfApellido.getText().isEmpty() || jTxfEmail.getText().isEmpty()
                || jTxfNombre.getText().isEmpty() || jTxfPassword.getText().isEmpty() || jTxfTelefono.getText().isEmpty()) {
            Messages.warningMessage("ERROR: Campos vacios", "Warning");
            return;
        }
        
        IUserAccess repo = Factory.getInstance().getUserService();
        UserService service = new UserService(repo);
        User user = new User();
        user.setAddress(this.JTxfDireccion.getText());
        user.setEmail(this.jTxfEmail.getText());
        user.setFirstName(this.jTxfNombre.getText());
        user.setLastName(this.jTxfApellido.getText());
        user.setMobile(this.jTxfTelefono.getText());
        user.setPws(this.jTxfPassword.getText());
        user.setRol("user");
        
        if (jTxfEmail.getText().contains("@")) {
            try {
                if (service.createUser(user)) {
                    Messages.successMessage("Usuario registrado con exito", "Exito");
                }else{
                    Messages.warningMessage("ERROR: No se pudo registrar el usuario", "Error");
                }
            } catch (Exception ex) {
                Logger.getLogger(GUICreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Messages.warningMessage("El Email ingresado no es valido", "Warning");
        }

    }//GEN-LAST:event_jBtnRegistrarseActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(GUICreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxfDireccion;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnRegistrarse;
    private javax.swing.JLabel jLbApellido;
    private javax.swing.JLabel jLbDireccion;
    private javax.swing.JLabel jLbEmail;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JLabel jLbPassword;
    private javax.swing.JLabel jLbTelefono;
    private javax.swing.JPanel jPnCentro;
    private javax.swing.JPanel jPnNorte;
    private javax.swing.JPanel jPnSur;
    private javax.swing.JTextField jTxfApellido;
    private javax.swing.JTextField jTxfEmail;
    private javax.swing.JTextField jTxfNombre;
    private javax.swing.JPasswordField jTxfPassword;
    private javax.swing.JTextField jTxfTelefono;
    // End of variables declaration//GEN-END:variables
}
