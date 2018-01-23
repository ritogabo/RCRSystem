package rcrsystem.presentation.view;

import Modelo.TotalMaterialVendido;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rcrsystem.presentation.controller.Editar_Precio_Unidad_Factura_Controlador;
import rcrsystem.presentation.model.Facturar_Modelo;

public class VentanaPrecioUnidFacturacion extends javax.swing.JDialog implements java.util.Observer {

    /**
     * Creates new form VentanaEdicionInventario
     */
    public VentanaPrecioUnidFacturacion(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/logoRCR.png")).getImage());
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

        nombre_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre_JTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Importe_JTextField = new javax.swing.JTextField();
        aceptar_JButton = new javax.swing.JButton();
        cancelar_JButton = new javax.swing.JButton();
        precio_JTextField = new javax.swing.JTextField();
        lbMoneda1 = new javax.swing.JLabel();
        lbMoneda2 = new javax.swing.JLabel();

        setTitle("Editar");

        nombre_label.setText("Nombre:");

        jLabel1.setText("Precio Unid:");

        nombre_JTextField.setEditable(false);
        nombre_JTextField.setEnabled(false);
        nombre_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_JTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Importe:");

        Importe_JTextField.setEditable(false);
        Importe_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Importe_JTextFieldActionPerformed(evt);
            }
        });
        Importe_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Importe_JTextFieldKeyTyped(evt);
            }
        });

        aceptar_JButton.setText("Aceptar");
        aceptar_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar_JButtonActionPerformed(evt);
            }
        });

        cancelar_JButton.setText("Cancelar");
        cancelar_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_JButtonActionPerformed(evt);
            }
        });

        precio_JTextField.setText("0.0");
        precio_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_JTextFieldActionPerformed(evt);
            }
        });
        precio_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precio_JTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precio_JTextFieldKeyTyped(evt);
            }
        });

        lbMoneda1.setText("$");

        lbMoneda2.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbMoneda1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(aceptar_JButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelar_JButton))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(nombre_label)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Importe_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbMoneda2))
                            .addComponent(nombre_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_label)
                    .addComponent(nombre_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(precio_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMoneda1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Importe_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMoneda2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar_JButton)
                    .addComponent(cancelar_JButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Importe_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Importe_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe_JTextFieldActionPerformed

    private void aceptar_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar_JButtonActionPerformed
        this.aceptar_JButton.setEnabled(false);
        controller.modificar();
        this.aceptar_JButton.setEnabled(true);
    }//GEN-LAST:event_aceptar_JButtonActionPerformed

    private void cancelar_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_JButtonActionPerformed

        controller.cerrar();// TODO add your handling code here:
    }//GEN-LAST:event_cancelar_JButtonActionPerformed

    private void Importe_JTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe_JTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe_JTextFieldKeyTyped

    private void nombre_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_JTextFieldActionPerformed

    private void precio_JTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_JTextFieldKeyTyped
        if (this.precio_JTextField.getText().length() > 50) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }        // TODO add your handling code here        // TODO add your handling code here:
    }//GEN-LAST:event_precio_JTextFieldKeyTyped

    private void precio_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_JTextFieldActionPerformed

    private void precio_JTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_JTextFieldKeyPressed
        char car = (char) evt.getKeyCode();
        if (car == evt.VK_ENTER) {
            this.aceptar_JButton.setEnabled(false);
            controller.modificar();
            this.aceptar_JButton.setEnabled(true);
        }
    }//GEN-LAST:event_precio_JTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaPrecioUnidFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrecioUnidFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrecioUnidFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrecioUnidFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Importe_JTextField;
    public javax.swing.JButton aceptar_JButton;
    public javax.swing.JButton cancelar_JButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lbMoneda1;
    public javax.swing.JLabel lbMoneda2;
    public javax.swing.JTextField nombre_JTextField;
    public javax.swing.JLabel nombre_label;
    public javax.swing.JTextField precio_JTextField;
    // End of variables declaration//GEN-END:variables
 Editar_Precio_Unidad_Factura_Controlador controller;
    Facturar_Modelo modelo;

    public void setController(Editar_Precio_Unidad_Factura_Controlador controller) {
        this.controller = controller;
    }

    public void setModel(Facturar_Modelo modelo) {
        this.modelo = modelo;
        modelo.addObserver(this);
    }

    @Override
    public void update(java.util.Observable updatedModel, Object parametros) {
        if (parametros != Facturar_Modelo.ae_total_lista_material_vendido_lista_empaque_actual) {
            return;
        }
        TotalMaterialVendido totalV = modelo.obtener_total_material_vendido_lista_empaque_actual();
        this.nombre_JTextField.setText(totalV.obtener_material_vendido().obtener_nombre());
        this.precio_JTextField.setText(String.valueOf(totalV.obtener_precio_unid()));
        if (modelo.obtener_errores().get("cantidad") != null) {
            this.Importe_JTextField.setBorder(rcrsystem.Aplicacion.ae_borde_error);
            Importe_JTextField.setToolTipText(modelo.obtener_errores().get("Precio"));
        } else {
            Importe_JTextField.setBorder(null);
            Importe_JTextField.setToolTipText("");
            this.Importe_JTextField.setText(String.valueOf(totalV.obtener_importe()));
        }
        this.validate();
        if (!modelo.obtener_mensaje().equals("")) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, modelo.obtener_mensaje(), "", JOptionPane.INFORMATION_MESSAGE);
            modelo.colocar_mensaje("");
        }
    }
}