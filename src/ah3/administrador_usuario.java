package ah3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class administrador_usuario extends javax.swing.JFrame {

    public administrador_usuario() {
        initComponents();
        MostrarTabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 236, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 600, 160));

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Agregar Usuario");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Salir ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("Modificar usuario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setText("Eliminar usuario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ah3/m1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Agregarusuario ag = new Agregarusuario();
     ag.setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if (Tabla.getSelectedRow()< 0) {
            JOptionPane.showMessageDialog(null, "Seleccionar una fila");
        } else {
            Modificarusuario ac = new Modificarusuario();
            ac.mostrar(Tabla.getSelectedRow());
            ac.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Eliminarusuario ag = new Eliminarusuario();
     ag.setVisible(true);
     dispose();
                     
    }//GEN-LAST:event_jButton4ActionPerformed

public void MostrarTabla(){
String columnas []={"usuario_id","Nombre","Apellido","Telefono","direccion","correo_electronico","fecha_nacimiento","contrasenia"};
        DefaultTableModel tabla = new DefaultTableModel(null,columnas);
        
        for (informacionhoteles sp : informacionhoteles.info){
            Object  filas [] = new Object[7]; 
            filas[0]= sp.getUsuario_id();
            filas[1]= sp.getNombre();
            filas[2]= sp.getApellido();
            filas[3]= sp.gettelefono();
            filas[4]= sp.getDireccion();
            filas[5]= sp.getCorreo_electronico();
            filas[6]= sp.getFecha_nacimiento();
            filas[7]= sp.getContrasenia();
            tabla.addRow(filas);
        }
        Tabla.setModel(tabla);
}



























{
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(administrador_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrador_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
