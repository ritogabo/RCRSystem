package rcrsystem.presentation.view;

import Modelo.Usuario;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import rcrsystem.presentation.controller.Bultos_C_Controlador;
import rcrsystem.presentation.controller.Consulta_Proveedor_Controlador;
import rcrsystem.presentation.controller.Usuario_Controlador;
import rcrsystem.presentation.model.Consulta_Proveedor_Modelo;
import rcrsystem.presentation.model.Modelo_B_C;

public class VentConsultaMatInv extends javax.swing.JFrame implements java.util.Observer {

    Bultos_C_Controlador controller;
    Modelo_B_C model;

    public Bultos_C_Controlador getController() {
        return controller;
    }

    public void setController(Bultos_C_Controlador controller) {
        this.controller = controller;
    }

    public Modelo_B_C getModel() {
        return model;
    }

    public void setModel(Modelo_B_C model) {
        this.model = model;
        model.addObserver(this);
    }

    public VentConsultaMatInv() {
//        setController(controller);
//        setModel(model);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/logoRCR.png")).getImage());
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMaterialCon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBultosMatInv = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        letrero_jLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_cerrar_sesion = new javax.swing.JMenuItem();
        btn_salir = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        btn_calculadora = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Detalle");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(27, 82, 156));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaBultosMatInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código Bulto", "Tipo", "Peso (Kg)", "Cod. material", "Material"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBultosMatInv.setDragEnabled(true);
        tablaBultosMatInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBultosMatInvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBultosMatInv);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        letrero_jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        letrero_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        letrero_jLabel.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(letrero_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(letrero_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/folder.png"))); // NOI18N
        jMenu1.setText("Archivo");

        btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/disconnect.png"))); // NOI18N
        btn_cerrar_sesion.setText("Cerrar Sesión");
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu1.add(btn_cerrar_sesion);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/door_out.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jMenu1.add(btn_salir);

        jMenuBar1.add(jMenu1);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/cog.png"))); // NOI18N
        jMenu6.setText("Herramientas");

        btn_calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/calculator.png"))); // NOI18N
        btn_calculadora.setText("Calculadora");
        btn_calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculadoraActionPerformed(evt);
            }
        });
        jMenu6.add(btn_calculadora);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(labelMaterialCon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMaterialCon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        Toolkit.getDefaultToolkit().beep();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            rcrsystem.Aplicacion.ae_usuario = new Usuario();
            rcrsystem.Aplicacion.ae_vista_principal = new VentanaInicio();
            rcrsystem.Aplicacion.ae_vista_principal.setController(new Usuario_Controlador());
            rcrsystem.Aplicacion.ae_vista_principal.setVisible(true);
        }
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        Toolkit.getDefaultToolkit().beep();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar el programa?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_calculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculadoraActionPerformed
        Process runtimeProcess;
        try {

            System.out.println(System.getProperty("os.name"));
            String comandoCalculadora = System.getProperty("os.name").startsWith("Windows") ? "calc" : "gcalctool";
            runtimeProcess = Runtime.getRuntime().exec(comandoCalculadora);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_calculadoraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.cerrar_ventana();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controller.cerrar_ventana();
    }//GEN-LAST:event_formWindowClosing

    private void tablaBultosMatInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBultosMatInvMouseClicked
        if (evt.getClickCount() == 2) {
            Consulta_Proveedor_Modelo modelo = new Consulta_Proveedor_Modelo();

            if ("Saca".equals((String) this.tablaBultosMatInv.getValueAt(this.tablaBultosMatInv.getSelectedRow(), 1))) {
                VentanaConsultaProveedor vistaC = new VentanaConsultaProveedor(this, controller, true, (String) this.tablaBultosMatInv.getValueAt(this.tablaBultosMatInv.getSelectedRow(), 0),this.tablaBultosMatInv.getSelectedRow());
                VentConsultaMatInv vista = new VentConsultaMatInv();
                Consulta_Proveedor_Controlador control = new Consulta_Proveedor_Controlador(vistaC, modelo, (String) this.tablaBultosMatInv.getValueAt(this.tablaBultosMatInv.getSelectedRow(), 0));
                vistaC.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "¡Sólo se permite transformar sacas!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_tablaBultosMatInvMouseClicked

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
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentConsultaMatInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentConsultaMatInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentConsultaMatInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentConsultaMatInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentConsultaMatInv().setVisible(true);
            }
        });
    }

    public void update(java.util.Observable updatedModel, Object parametros) {
        if (parametros != Modelo_B_C.ae_bultos_modelo_c) {
            return;
        }
        this.tablaBultosMatInv.setModel(model.obtener_bultos_C_Modelo());
        this.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_calculadora;
    private javax.swing.JMenuItem btn_cerrar_sesion;
    private javax.swing.JMenuItem btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMaterialCon;
    public javax.swing.JLabel letrero_jLabel;
    private javax.swing.JTable tablaBultosMatInv;
    // End of variables declaration//GEN-END:variables
}