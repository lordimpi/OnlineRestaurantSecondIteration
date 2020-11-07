package co.unicauca.onlinerestaurant.client.presentation;

import co.unicauca.onlinerestaurant.client.infra.Messages;
import static co.unicauca.onlinerestaurant.client.infra.Messages.successMessage;

/**
 * Crea una jframe para crear un usuario
 * @author Santiago Acuña
 */
public class GUICreateSalad extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICreateDishe2
     */
    public GUICreateSalad() {
        initComponents();
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
        jBtnAgregar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jPnCentro = new javax.swing.JPanel();
        jLbIdSalad = new javax.swing.JLabel();
        jTxfId = new javax.swing.JTextField();
        jLbNombre = new javax.swing.JLabel();
        jTxfNombre = new javax.swing.JTextField();
        jLbPrecio = new javax.swing.JLabel();
        JTxfPrecio = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear Ensalada");
        setPreferredSize(new java.awt.Dimension(495, 230));

        jPnNorte.setBackground(new java.awt.Color(54, 33, 88));
        jPnNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnNorte.setPreferredSize(new java.awt.Dimension(450, 50));

        javax.swing.GroupLayout jPnNorteLayout = new javax.swing.GroupLayout(jPnNorte);
        jPnNorte.setLayout(jPnNorteLayout);
        jPnNorteLayout.setHorizontalGroup(
            jPnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        jPnNorteLayout.setVerticalGroup(
            jPnNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        getContentPane().add(jPnNorte, java.awt.BorderLayout.PAGE_START);

        jPnSur.setBackground(new java.awt.Color(54, 33, 88));
        jPnSur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnSur.setPreferredSize(new java.awt.Dimension(450, 50));

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        jPnSur.add(jBtnAgregar);

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPnSur.add(jBtnCancelar);

        getContentPane().add(jPnSur, java.awt.BorderLayout.PAGE_END);

        jPnCentro.setLayout(new java.awt.GridLayout(3, 2));

        jLbIdSalad.setBackground(new java.awt.Color(255, 255, 255));
        jLbIdSalad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbIdSalad.setText("Id:");
        jPnCentro.add(jLbIdSalad);

        jTxfId.setToolTipText("txt_id");
        jPnCentro.add(jTxfId);
        jTxfId.getAccessibleContext().setAccessibleName("");

        jLbNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbNombre.setText("Nombre:");
        jPnCentro.add(jLbNombre);
        jPnCentro.add(jTxfNombre);

        jLbPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jLbPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbPrecio.setText("Precio:");
        jPnCentro.add(jLbPrecio);
        jPnCentro.add(JTxfPrecio);

        getContentPane().add(jPnCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton para cancelar la creacion de un plato
     *
     * @param evt Evento para crear un plato
     */
    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed

        this.doDefaultCloseAction();

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    /**
     * Limpia los controlles del formulario
     */
    public void clearControls() {
        jTxfId.setText("");
        jTxfNombre.setText("");
        JTxfPrecio.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxfPrecio;
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JLabel jLbIdSalad;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JLabel jLbPrecio;
    private javax.swing.JPanel jPnCentro;
    private javax.swing.JPanel jPnNorte;
    private javax.swing.JPanel jPnSur;
    private javax.swing.JTextField jTxfId;
    private javax.swing.JTextField jTxfNombre;
    // End of variables declaration//GEN-END:variables
}