
package vista;

import controlador.ControladorLogin;
import javax.swing.table.DefaultTableModel;
import modelo.Licencia;
import modelo.EmpleadoRegular;
import java.util.List;

public class frmRRHH extends javax.swing.JFrame {

    private EmpleadoRegular empleadoRegular;

    public frmRRHH() {
        initComponents();
//        this.empleadoRegular = empleadoRegular;
    }

    public void actualizarTablaSolicitudes() {
        DefaultTableModel modelo = (DefaultTableModel) tblSolicitudes.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de actualizarla

        List<String[]> solicitudes = empleadoRegular.getSolicitudesLicenciaRRHH();
        Object[][] datos = new Object[solicitudes.size()][8];
        for (int i = 0; i < solicitudes.size(); i++) {
            String[] solicitud = solicitudes.get(i);
            datos[i][0] = solicitud[0]; // Depa
            datos[i][1] = solicitud[2]; // FechaInicio
            datos[i][2] = solicitud[3]; // Fecha Final
            datos[i][3] = solicitud[6]; // Nombre
            datos[i][4] = solicitud[1]; // Estado
            datos[i][5] = solicitud[5]; // tipo
            datos[i][6] = solicitud[7]; // razon
        }
        DefaultTableModel model = (DefaultTableModel) tblSolicitudes.getModel();
        model.setDataVector(datos, new Object[]{"Departamento","Fecha Inicio" ,"Fecha Fin", "Empleado", "Estado","tipo","Razon"});
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lblsubtitulo = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSolicitudes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblJustif = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRazon = new javax.swing.JTextField();
        btnAprobar = new javax.swing.JButton();
        btnRechazar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltitulo.setText("SISTEMA DE CONTROL LICENCIAS");

        lblsubtitulo.setText("Usuario: ");

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(lbltitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(lblsubtitulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalir)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbltitulo)
                        .addGap(18, 18, 18)
                        .addComponent(lblsubtitulo)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tblSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Departamento", "Fecha de inicio", "Fecha de fin", "Empleado", "Estado", "Tipo", "Razón"
            }
        ));
        jScrollPane1.setViewportView(tblSolicitudes);

        jLabel1.setText("Lista de solicitudes:");

        lblJustif.setText("---");

        jLabel3.setText("Razon:");

        txtRazon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonActionPerformed(evt);
            }
        });

        btnAprobar.setText("Aprobar");
        btnAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarActionPerformed(evt);
            }
        });

        btnRechazar.setText("Rechazar");
        btnRechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarActionPerformed(evt);
            }
        });

        jLabel2.setText("Justificación:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblJustif)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(txtRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(btnRechazar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJustif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRechazar)
                    .addComponent(btnAprobar))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
 /*       frmLogin flogin = new frmLogin();
        ControladorLogin controlador = new ControladorLogin(configuracion.Datos.usuarios, flogin);
        controlador.iniciar();

        this.dispose();*/
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtRazonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonActionPerformed
  /*     String razon = txtRazon.getText();
        int filaSeleccionada = tblSolicitudes.getSelectedRow();

        if (filaSeleccionada != -1) {
            Licencia solicitud = empleadoRegular.getSolicitudesLicenciaRRHH().get(filaSeleccionada);

            solicitud.setRazon(razon);
            actualizarTablaSolicitudes();
    }*/
    }//GEN-LAST:event_txtRazonActionPerformed

    private void aprobarSolicitud(Licencia solicitud) {
/*        String justificacion = lblJustif.getText();
        String razon = txtRazon.getText();

        solicitud.setEstado("Aprobada");
        solicitud.setJustificacion(justificacion);
        solicitud.setRazon(razon);

        empleadoRegular.actualizarSolicitud(solicitud);
        actualizarTablaSolicitudes();*/
    }
    
    private void btnAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarActionPerformed
/*        int filaSeleccionada = tblSolicitudes.getSelectedRow();
        if (filaSeleccionada != -1) {
            Licencia solicitud = empleadoRegular.getSolicitudesLicenciaRRHH().get(filaSeleccionada);
            aprobarSolicitud(solicitud);
        }*/
    }//GEN-LAST:event_btnAprobarActionPerformed

    private void btnRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarActionPerformed
 /*       int filaSeleccionada = tblSolicitudes.getSelectedRow();
        if (filaSeleccionada != -1) {
            Licencia solicitud = empleadoRegular.getSolicitudesLicenciaRRHH().get(filaSeleccionada);
            rechazarSolicitud(solicitud);
        }*/
    }//GEN-LAST:event_btnRechazarActionPerformed
    
    private void rechazarSolicitud(Licencia solicitud) {
/*       String justificacion = lblJustif.getText();
        String razon = txtRazon.getText();

        solicitud.setEstado("Rechazada");
        solicitud.setJustificacion(justificacion);
        solicitud.setRazon(razon);

        empleadoRegular.actualizarSolicitud(solicitud);
        actualizarTablaSolicitudes();*/
    }

    
   /* public static void main(String args[]) {
 /*       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRRHH(null).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAprobar;
    public javax.swing.JButton btnRechazar;
    public javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblJustif;
    public javax.swing.JLabel lblsubtitulo;
    private javax.swing.JLabel lbltitulo;
    public javax.swing.JTable tblSolicitudes;
    public javax.swing.JTextField txtRazon;
    // End of variables declaration//GEN-END:variables
}
