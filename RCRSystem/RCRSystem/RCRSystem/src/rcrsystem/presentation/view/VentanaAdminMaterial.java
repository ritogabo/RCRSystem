package rcrsystem.presentation.view;

import Modelo.Administrar_Material;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import rcrsystem.presentation.controller.Admin_Material_Controlador;
import rcrsystem.presentation.controller.Progreso_Menu_Prin_Controlador;
import rcrsystem.presentation.model.Material_Modelo;

public class VentanaAdminMaterial extends javax.swing.JDialog implements java.util.Observer {

    Admin_Material_Controlador controlador;
    Material_Modelo modelo;
    public static Border BORDER_ERROR = BorderFactory.createLineBorder(Color.red);
    public Border BORDER_NOBORDER;

    public VentanaAdminMaterial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/logoRCR.png")).getImage());
        setLocationRelativeTo(null);
        BORDER_NOBORDER = this.jTextField_codigo.getBorder();
        
    }
    
        WindowListener exitListener = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
        VentanaCarga  a_carga = new VentanaCarga();
        setVisible(false);
        Progreso_Menu_Prin_Controlador v = new Progreso_Menu_Prin_Controlador(a_carga,1);
        v.execute();
        }
    };

    public Admin_Material_Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Admin_Material_Controlador controlador) {
        this.controlador = controlador;
    }

    public Material_Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Material_Modelo modelo) {
        this.modelo = modelo;
        modelo.addObserver(this);
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
        jTextField_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_descripcion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_agregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Código:");

        jTextField_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_codigoKeyTyped(evt);
            }
        });

        jLabel2.setText("Descripción:");

        jTextField_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_descripcionKeyTyped(evt);
            }
        });

        jButton_agregar.setText("Agregar");
        jButton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jTextField_codigo))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton_agregar)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed
        this.jButton_agregar.setEnabled(false);
        controlador.agregar();
        this.jButton_agregar.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_agregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jButton2.setEnabled(false);
        this.setVisible(false);
        this.jButton2.setEnabled(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);

    }//GEN-LAST:event_formWindowClosing

    private void jTextField_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_codigoKeyTyped
        if (this.jTextField_codigo.getText().length() > 20) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codigoKeyTyped

    private void jTextField_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_descripcionKeyTyped
        if (this.jTextField_descripcion.getText().length() > 100) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_descripcionKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaAdminMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdminMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdminMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdminMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTextField_codigo;
    public javax.swing.JTextField jTextField_descripcion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(java.util.Observable updatedModel, Object parametros) {
        if (parametros != Material_Modelo.ae_material_actual) {
            return;
        }
        Administrar_Material material = modelo.obtener_material_actual();

        if (material == null) {
            this.jTextField_codigo.setText("");
            this.jTextField_descripcion.setText("");
        } else {
            this.jTextField_codigo.setText(material.obtener_material().obtener_codigo());
            if (modelo.obtener_errores().get("codigo") != null) {
                this.jTextField_codigo.setBorder(BORDER_ERROR);
                this.jTextField_codigo.setToolTipText(modelo.obtener_errores().get("codigo"));
            } else {
                this.jTextField_codigo.setBorder(BORDER_NOBORDER);
                this.jTextField_codigo.setToolTipText(null);
            }

            this.jTextField_descripcion.setText(material.obtener_material().obtener_nombre());
            if (modelo.obtener_errores().get("descripcion") != null) {
                this.jTextField_codigo.setBorder(BORDER_ERROR);
                this.jTextField_codigo.setToolTipText(modelo.obtener_errores().get("descripcion"));
            } else {
                this.jTextField_codigo.setBorder(BORDER_NOBORDER);
                this.jTextField_codigo.setToolTipText(null);
            }
        }
        this.validate();

        if (modelo.obtener_mensaje() != null) {
            if (!modelo.obtener_mensaje().equals("")) {
                JOptionPane.showMessageDialog(this, modelo.obtener_mensaje(), "", JOptionPane.INFORMATION_MESSAGE);
                modelo.colocar_mensaje("");
            }
        }
    }
}