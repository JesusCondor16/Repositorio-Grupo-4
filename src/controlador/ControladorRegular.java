package controlador;

import modelo.EmpleadoRegular;
import vista.frmRegular;
import vista.frmLogin;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Licencia;

public class ControladorRegular {
    private EmpleadoRegular modelo;
    private frmRegular vista;

    public ControladorRegular(EmpleadoRegular modelo, frmRegular vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.lblsubtitulo.setText("Empleado: " + modelo.getNombre());
        this.vista.btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmLogin flogin = new frmLogin();
                ControladorLogin controlador =
                        new ControladorLogin(configuracion.Datos.usuarios, flogin);
                controlador.iniciar();

                vista.dispose();
            }
        });

        this.vista.btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String motivo = vista.txtJust.getText();
                String tipo = vista.txtTipoL.getSelectedItem().toString();
                
                if (motivo.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Por favor, ingresa un motivo de licencia.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    modelo.solicitarLicencia(motivo, tipo);
                    actualizarTablaSolicitudes();
                }
            }
        });
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        actualizarTablaSolicitudes(); // Agregado para actualizar la tabla al iniciar el formulario
    }

    private void actualizarTablaSolicitudes() {
        List<Licencia> solicitudes = modelo.getSolicitudesLicencia();
        DefaultTableModel model = (DefaultTableModel) vista.tblRegistroU.getModel();

        for (Licencia solicitud : solicitudes) {
            Object[] fila = {
                solicitud.getTipo(),
                solicitud.getFechaInicio(),
                solicitud.getFechaFin(),
                solicitud.getEstado(),
                solicitud.getRazon()
            };
            model.addRow(fila);
        }
    }
    
    public void enviarSolicitudLicencia(String motivo, String tipo) {
        modelo.solicitarLicencia(motivo, tipo);
    }
}
