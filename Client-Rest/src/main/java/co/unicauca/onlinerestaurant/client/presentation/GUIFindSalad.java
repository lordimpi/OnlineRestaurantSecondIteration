package co.unicauca.onlinerestaurant.client.presentation;

import co.unicauca.common.domain.entity.Salad;
import co.unicauca.onlinerestaurant.client.access.Factory;
import co.unicauca.onlinerestaurant.client.access.ISaladAccess;
import co.unicauca.onlinerestaurant.client.domain.services.SaladService;
import static co.unicauca.onlinerestaurant.client.infra.Messages.successMessage;
import co.unicauca.onlinerestaurant.client.infra.Messages;

/**
 * Crea un formulario para buscar una ensalada en la base de datos
 *
 * @author Ximena Gallego
 */
public class GUIFindSalad extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIFindSalad
     */
    public GUIFindSalad() {
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
        jLbIdSalad = new javax.swing.JLabel();
        jTxfId = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jPnSur = new javax.swing.JPanel();
        jBtnCerrar = new javax.swing.JButton();
        jPnCentro = new javax.swing.JPanel();
        jLbNombre = new javax.swing.JLabel();
        jTxfNombre = new javax.swing.JTextField();
        jLbPrecio = new javax.swing.JLabel();
        jTxfPrecio = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Ensalada");
        setToolTipText("");

        jPnNorte.setBackground(new java.awt.Color(54, 33, 88));
        jPnNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnNorte.setPreferredSize(new java.awt.Dimension(450, 50));

        jLbIdSalad.setBackground(new java.awt.Color(255, 255, 255));
        jLbIdSalad.setForeground(new java.awt.Color(255, 255, 255));
        jLbIdSalad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbIdSalad.setText("Id:");
        jPnNorte.add(jLbIdSalad);

        jTxfId.setPreferredSize(new java.awt.Dimension(150, 24));
        jPnNorte.add(jTxfId);

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.setFocusPainted(false);
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });
        jPnNorte.add(jBtnBuscar);

        getContentPane().add(jPnNorte, java.awt.BorderLayout.PAGE_START);

        jPnSur.setBackground(new java.awt.Color(54, 33, 88));
        jPnSur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnSur.setPreferredSize(new java.awt.Dimension(450, 50));

        jBtnCerrar.setText("Cerrar");
        jBtnCerrar.setFocusPainted(false);
        jBtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarActionPerformed(evt);
            }
        });
        jPnSur.add(jBtnCerrar);

        getContentPane().add(jPnSur, java.awt.BorderLayout.PAGE_END);

        jPnCentro.setLayout(new java.awt.GridLayout(2, 2));

        jLbNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbNombre.setText("Nombre:");
        jPnCentro.add(jLbNombre);

        jTxfNombre.setEditable(false);
        jTxfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jPnCentro.add(jTxfNombre);

        jLbPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jLbPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbPrecio.setText("Precio:");
        jPnCentro.add(jLbPrecio);

        jTxfPrecio.setEditable(false);
        jTxfPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jPnCentro.add(jTxfPrecio);

        getContentPane().add(jPnCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton para cerrar el formulario buscar ensaladas
     *
     * @param evt Evento del boton
     */
    private void jBtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarActionPerformed

        this.doDefaultCloseAction();
    }//GEN-LAST:event_jBtnCerrarActionPerformed

    /**
     * Boton encargado de buscar una ensalada por id en la base de datos
     *
     * @param evt Evento del boton
     */
    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed

        String id = jTxfId.getText().trim();

        ISaladAccess service = Factory.getInstance().getSaladService();
        // Inyecta la dependencia
        SaladService saladService = new SaladService(service);
        if (id.equals("")) {
            jTxfId.requestFocus();
            Messages.warningMessage("ERROR: El campo Id esta vacio.", "Warning");
            return;
        }

        Salad dish;
        try {
            dish = saladService.findSalad(id);
            if (dish == null) {
                jTxfId.requestFocus();
                clearControls();
                Messages.warningMessage("ERROR: No se encontro la ensalada.", "Warning");
                return;
            }
        } catch (Exception ex) {
            clearControls();
            successMessage(ex.getMessage(), "Atención");
            return;
        }
        clearControls();
        showData(dish);

    }//GEN-LAST:event_jBtnBuscarActionPerformed

    /**
     * Metodo encargado de mostrar los datos de la enssalada principal en el
     * formulario
     *
     * @param salada Objeto ensalada principal para mostrar datos
     */
    private void showData(Salad salada) {
        jTxfNombre.setText(salada.getNameSalad());
        jTxfPrecio.setText(Double.toString(salada.getCostSalad()));

    }

    /**
     * Metodo encargado de limpiar los controles del formulario
     */
    public void clearControls() {

        jTxfId.setText("");
        jTxfNombre.setText("");
        jTxfPrecio.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnCerrar;
    private javax.swing.JLabel jLbIdSalad;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JLabel jLbPrecio;
    private javax.swing.JPanel jPnCentro;
    private javax.swing.JPanel jPnNorte;
    private javax.swing.JPanel jPnSur;
    private javax.swing.JTextField jTxfId;
    private javax.swing.JTextField jTxfNombre;
    private javax.swing.JTextField jTxfPrecio;
    // End of variables declaration//GEN-END:variables
}
