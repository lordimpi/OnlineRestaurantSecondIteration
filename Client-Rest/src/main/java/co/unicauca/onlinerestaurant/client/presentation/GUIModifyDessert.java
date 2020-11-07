package co.unicauca.onlinerestaurant.client.presentation;

import co.unicauca.common.domain.entity.Dessert;
import co.unicauca.onlinerestaurant.client.infra.Messages;
import static co.unicauca.onlinerestaurant.client.infra.Messages.successMessage;
import co.unicauca.common.domain.entity.Drink;
import co.unicauca.onlinerestaurant.client.access.Factory;
import co.unicauca.onlinerestaurant.client.access.IDessertAccess;
import co.unicauca.onlinerestaurant.client.domain.services.DessertService;

/**
 * Crea un jframe para modificar un postre
 *
 * @author Camilo Otaya
 */
public class GUIModifyDessert extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIModifyDessert
     */
    public GUIModifyDessert() {
        initComponents();
        this.jBtnModificar.setVisible(false);
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
        jLbId = new javax.swing.JLabel();
        jTxfId = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jPnSur = new javax.swing.JPanel();
        jBtnModificar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jPnCentro = new javax.swing.JPanel();
        jLbNombre = new javax.swing.JLabel();
        jTxfNombre = new javax.swing.JTextField();
        jLbPrecio = new javax.swing.JLabel();
        jTxfPrecio = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Postre");
        setToolTipText("");

        jPnNorte.setBackground(new java.awt.Color(54, 33, 88));
        jPnNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnNorte.setPreferredSize(new java.awt.Dimension(450, 50));

        jLbId.setForeground(new java.awt.Color(255, 255, 255));
        jLbId.setText("Id");
        jPnNorte.add(jLbId);

        jTxfId.setBackground(new java.awt.Color(255, 255, 255));
        jTxfId.setForeground(new java.awt.Color(0, 0, 0));
        jTxfId.setPreferredSize(new java.awt.Dimension(100, 24));
        jPnNorte.add(jTxfId);

        jBtnBuscar.setText("Buscar");
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

        jBtnModificar.setText("Modificar");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });
        jPnSur.add(jBtnModificar);

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPnSur.add(jBtnCancelar);

        getContentPane().add(jPnSur, java.awt.BorderLayout.PAGE_END);

        jPnCentro.setLayout(new java.awt.GridLayout(2, 2));

        jLbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbNombre.setText("Nombre:");
        jPnCentro.add(jLbNombre);

        jTxfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTxfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPnCentro.add(jTxfNombre);

        jLbPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbPrecio.setText("Precio:");
        jPnCentro.add(jLbPrecio);

        jTxfPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jTxfPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jPnCentro.add(jTxfPrecio);

        getContentPane().add(jPnCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cierra la ventana del formulario
     *
     * @param evt evento del boton
     */
    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed

        this.doDefaultCloseAction();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    /**
     * Modifica un postre con los atributos que tiene el formulario
     *
     * @param evt evento del boton
     */
    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed

        String nombre = jTxfNombre.getText();
        String precio = jTxfPrecio.getText();
        IDessertAccess service = Factory.getInstance().getDessertService();
        // Inyecta la dependencia
        DessertService dessertService = new DessertService(service);
        boolean dish;
        if (nombre.equals("") || precio.equals("")) {
            jTxfNombre.requestFocus();
            Messages.warningMessage("Campos vacios: Error al modificar", "Warning");
            return;
        }
        try {
            dish = dessertService.updateDessert(
                    this.jTxfId.getText().trim(),
                    this.jTxfNombre.getText(),
                    Double.parseDouble(this.jTxfPrecio.getText()));
            if (dish == false) {
                clearControls();
                this.jTxfId.requestFocus();
                Messages.warningMessage("No se pudo modificar el postre", "Warning");
                this.jBtnModificar.setVisible(false);
                return;
            }
        } catch (Exception ex) {
            clearControls();
            successMessage(ex.getMessage(), "Atención");
            return;
        }
        clearControls();
        this.jTxfId.requestFocus();
        successMessage("Se modifico el postre con exito.", "EXITO");
        this.jBtnModificar.setVisible(false);

    }//GEN-LAST:event_jBtnModificarActionPerformed

    /**
     * Metodo encargado de buscar en la base de datos un identificador de un
     * postre
     *
     * @param evt Accion evento del formulario, en este caso accion buscar
     */
    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed

        String id = jTxfId.getText().trim();

        IDessertAccess service = Factory.getInstance().getDessertService();
        // Inyecta la dependencia
        DessertService dessertService = new DessertService(service);

        if (id.equals("")) {
            jTxfId.requestFocus();
            Messages.warningMessage("ERROR: El campo Id esta vacio.", "Warning");
            return;
        }
        Dessert dish;
        try {
            dish = dessertService.findDessert(id);
            if (dish == null) {
                jTxfId.requestFocus();
                clearControls();
                Messages.warningMessage("ERROR: No se encontro el postre.", "Warning");
                return;
            }
        } catch (Exception ex) {
            clearControls();
            successMessage(ex.getMessage(), "Atención");
            return;
        }
        clearControls();
        showData(dish);
        this.jBtnModificar.setVisible(true);

    }//GEN-LAST:event_jBtnBuscarActionPerformed

    /**
     * Este metodo muestra en el formulario los datos que tiene un objeto
     *
     * @param dessert Objeto postre principal
     */
    private void showData(Dessert dessert) {
        jTxfNombre.setText(dessert.getName_Dish_Dessert());
        jTxfPrecio.setText(Double.toString(dessert.getCost_Dish_Dessert()));

    }

    /**
     * Este metodo limpia todos los controles en el formulario
     */
    public void clearControls() {

        jTxfNombre.setText("");
        jTxfPrecio.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JLabel jLbId;
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