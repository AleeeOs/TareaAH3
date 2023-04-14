package ah3;

public class Agregarusuario extends javax.swing.JFrame {
public Agregarusuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ll6 = new javax.swing.JTextField();
        ll1 = new javax.swing.JTextField();
        ll2 = new javax.swing.JTextField();
        ll3 = new javax.swing.JTextField();
        ll4 = new javax.swing.JTextField();
        ll7 = new javax.swing.JPasswordField();
        ll5 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Agregar usuario ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 100, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 80, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Dirección");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 90, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Correo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de nacimiento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 160, 20));
        jPanel1.add(ll6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 330, 20));
        jPanel1.add(ll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 330, 20));
        jPanel1.add(ll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 330, 20));
        jPanel1.add(ll3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 330, 20));
        jPanel1.add(ll4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 330, 20));

        ll7.setText("jPasswordField1");
        jPanel1.add(ll7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 330, 20));
        jPanel1.add(ll5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 330, 20));

        jRadioButton1.setText("Activo");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        jRadioButton2.setText("Inactivo");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jButton1.setText("Cancelar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if (ll1.getText().isEmpty() || ll2.getText().isEmpty() || ll3.getText().isEmpty()
            || ll4.getText().isEmpty() || ll5.getText().isEmpty() || ll6.getText().isEmpty() || ll7.getText().isEmpty()) {
            System.out.println("Esta vacia");
        } else {
            System.out.println("Si esta llena");
         
        administrador_usuario ad = new administrador_usuario();
        ad.setVisible(true);
        dispose();
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Agregarusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregarusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregarusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregarusuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregarusuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField ll1;
    private javax.swing.JTextField ll2;
    private javax.swing.JTextField ll3;
    private javax.swing.JTextField ll4;
    private javax.swing.JTextField ll5;
    private javax.swing.JTextField ll6;
    private javax.swing.JPasswordField ll7;
    // End of variables declaration//GEN-END:variables
}
