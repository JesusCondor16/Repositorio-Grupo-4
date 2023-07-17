
package vista;

import controlador.ControladorLogin;
import controlador.ControladorRRHH;
import controlador.ControladorRegular;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Licencia;
import modelo.Empleado;
import modelo.EmpleadoRegular;

import javax.swing.JOptionPane;

public class frmRegular extends javax.swing.JFrame {
    
    private final EmpleadoRegular modelo;
    private final ControladorRegular controladorRegular;

    public frmRegular(EmpleadoRegular modelo) {
        initComponents();
 //       this.modelo = modelo;
 //       this.controladorRegular = new ControladorRegular(modelo, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTitulo = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lblsubtitulo = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        panSolicitud = new javax.swing.JPanel();
        lblSubtitulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTipoL = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtJust = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        datFinicio = new com.toedter.calendar.JDateChooser();
        datFfin = new com.toedter.calendar.JDateChooser();
        panRegistro = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistroU = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltitulo.setText("SISTEMA DE CONTROL LICENCIAS");

        lblsubtitulo.setText("Usuario:");

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTituloLayout = new javax.swing.GroupLayout(panTitulo);
        panTitulo.setLayout(panTituloLayout);
        panTituloLayout.setHorizontalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLayout.createSequentialGroup()
                .addGroup(panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTituloLayout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(lblsubtitulo))
                    .addGroup(panTituloLayout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(lbltitulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        panTituloLayout.setVerticalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panTituloLayout.createSequentialGroup()
                        .addComponent(lbltitulo)
                        .addGap(18, 18, 18)
                        .addComponent(lblsubtitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSubtitulo1.setText("Nueva solicitud:");

        jLabel1.setText("Fecha de inicio de licencia:");

        jLabel2.setText("Fecha de fin de licencia:");

        jLabel3.setText("Tipo de licencia:");

        jLabel4.setText("Justificación de licencia:");

        txtTipoL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faltas", "Permisos", "Vacaciones" }));
        txtTipoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoLActionPerformed(evt);
            }
        });

        txtJust.setColumns(20);
        txtJust.setRows(5);
        jScrollPane1.setViewportView(txtJust);

        btnEnviar.setText("Enviar solictud");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSolicitudLayout = new javax.swing.GroupLayout(panSolicitud);
        panSolicitud.setLayout(panSolicitudLayout);
        panSolicitudLayout.setHorizontalGroup(
            panSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSolicitudLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtitulo1)
                    .addGroup(panSolicitudLayout.createSequentialGroup()
                        .addGroup(panSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(85, 85, 85)
                        .addGroup(panSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipoL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datFfin, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(datFinicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panSolicitudLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSolicitudLayout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addGap(446, 446, 446))
        );
        panSolicitudLayout.setVerticalGroup(
            panSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSolicitudLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblSubtitulo1)
                .addGap(18, 18, 18)
                .addGroup(panSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datFinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSolicitudLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnEnviar))
                    .addComponent(datFfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tblRegistroU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Fecha inicio", "Fecha fin", "Estado", "Mensaje"
            }
        ));
        jScrollPane2.setViewportView(tblRegistroU);

        jLabel5.setText("Registro de solicitudes:");

        javax.swing.GroupLayout panRegistroLayout = new javax.swing.GroupLayout(panRegistro);
        panRegistro.setLayout(panRegistroLayout);
        panRegistroLayout.setHorizontalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        panRegistroLayout.setVerticalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistroLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoLActionPerformed
        String tipo = txtTipoL.getSelectedItem().toString();
    }//GEN-LAST:event_txtTipoLActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
   /*     String motivo = txtJust.getText();
        String tipo = txtTipoL.getSelectedItem().toString();
        Date fechaInicio = datFinicio.getDate();
        Date fechaFin = datFfin.getDate();

        if (motivo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un motivo de licencia.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            controladorRegular.enviarSolicitudLicencia(fechaInicio,fechaFin,modelo,motivo, tipo);
        }*/
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        frmLogin flogin = new frmLogin();
        ControladorLogin controlador = new ControladorLogin(configuracion.Datos.usuarios, flogin);
        controlador.iniciar();

        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

  /*  public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegular().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEnviar;
    public javax.swing.JButton btnsalir;
    public com.toedter.calendar.JDateChooser datFfin;
    public com.toedter.calendar.JDateChooser datFinicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSubtitulo1;
    public javax.swing.JLabel lblsubtitulo;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel panRegistro;
    private javax.swing.JPanel panSolicitud;
    private javax.swing.JPanel panTitulo;
    public javax.swing.JTable tblRegistroU;
    public javax.swing.JTextArea txtJust;
    public javax.swing.JComboBox<String> txtTipoL;
    // End of variables declaration//GEN-END:variables
}
