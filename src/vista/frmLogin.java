
package vista;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        panControles = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JComboBox<>();
        panBoton = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Titulo.setText("SISTEMA DE CONTROL DE LICENCIAS");

        javax.swing.GroupLayout panTituloLayout = new javax.swing.GroupLayout(panTitulo);
        panTitulo.setLayout(panTituloLayout);
        panTituloLayout.setHorizontalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTituloLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(95, 95, 95))
        );
        panTituloLayout.setVerticalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTituloLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(21, 21, 21))
        );

        getContentPane().add(panTitulo, java.awt.BorderLayout.NORTH);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblClave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblClave.setText("Clave:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipo.setText("Tipo:");

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado Regular", "Empleado RRHH" }));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panControlesLayout = new javax.swing.GroupLayout(panControles);
        panControles.setLayout(panControlesLayout);
        panControlesLayout.setHorizontalGroup(
            panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panControlesLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(lblClave)
                    .addComponent(lblTipo))
                .addGap(18, 18, 18)
                .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        panControlesLayout.setVerticalGroup(
            panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panControlesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClave)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panControles, java.awt.BorderLayout.CENTER);

        btnIngresar.setBackground(new java.awt.Color(102, 102, 102));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setAlignmentX(0.5F);

        javax.swing.GroupLayout panBotonLayout = new javax.swing.GroupLayout(panBoton);
        panBoton.setLayout(panBotonLayout);
        panBotonLayout.setHorizontalGroup(
            panBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotonLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panBotonLayout.setVerticalGroup(
            panBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotonLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnIngresar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(panBoton, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Titulo;
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblClave;
    public javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panBoton;
    private javax.swing.JPanel panControles;
    private javax.swing.JPanel panTitulo;
    public transient javax.swing.JPasswordField txtClave;
    public javax.swing.JComboBox<String> txtTipo;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
