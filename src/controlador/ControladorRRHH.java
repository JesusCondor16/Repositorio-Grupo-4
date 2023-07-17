package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.EmpleadoRegular;
import modelo.Licencia;
import vista.frmRRHH;
import vista.frmLogin;

public class ControladorRRHH {
    private EmpleadoRegular modelo;
    private frmRRHH vista;

    public ControladorRRHH(EmpleadoRegular modelo, frmRRHH vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.lblsubtitulo.setText("Empleado: " + modelo.getNombre());

        this.vista.tblSolicitudes.getSelectionModel().addListSelectionListener(e -> {
            int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
            if (filaSeleccionada != -1) {
                Licencia solicitud = modelo.getSolicitudesLicencia().get(filaSeleccionada);
                mostrarDatosSolicitud(solicitud);
            }
        });

        this.vista.btnAprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
                if (filaSeleccionada != -1) {
                    Licencia solicitud = modelo.getSolicitudesLicencia().get(filaSeleccionada);
                    aprobarSolicitud(solicitud);
                }
            }
        });

        this.vista.btnRechazar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
                if (filaSeleccionada != -1) {
                    Licencia solicitud = modelo.getSolicitudesLicencia().get(filaSeleccionada);
                    rechazarSolicitud(solicitud);
                }
            }
        });

        this.vista.btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmLogin flogin = new frmLogin();
                ControladorLogin controlador = new ControladorLogin(configuracion.Datos.usuarios, flogin);
                controlador.iniciar();

                vista.dispose();
            }
        });
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        vista.actualizarTablaSolicitudes(); // Agregado para actualizar la tabla al iniciar el formulario
    }
    
    private void mostrarDatosSolicitud(Licencia solicitud) {
        vista.lblJustif.setText(solicitud.getJustificacion());
    }
    
    private void aprobarSolicitud(Licencia solicitud) {
        String razon = vista.txtRazon.getText();
        
        solicitud.setEstado("Aprobada");
        solicitud.setRazon(razon);
        
        modelo.actualizarSolicitud(solicitud);
        vista.actualizarTablaSolicitudes();
    }
    
    private void rechazarSolicitud(Licencia solicitud) {
        String razon = vista.txtRazon.getText();
        
        solicitud.setEstado("Rechazada");
        solicitud.setRazon(razon);
        
        modelo.actualizarSolicitud(solicitud);
        vista.actualizarTablaSolicitudes();
    }
    
    public void actualizarTablaSolicitudes() {
        DefaultTableModel model = (DefaultTableModel) vista.tblSolicitudes.getModel();
        
        for (Licencia solicitud : modelo.getSolicitudesLicencia()) {
            Object[] fila = {
                solicitud.getDepartamento(),
                solicitud.getFechaInicio(),
                solicitud.getFechaFin(),
                solicitud.getEmpleado().getNombre(),
                solicitud.getEstado(),
                solicitud.getTipo(),
                solicitud.getRazon()
            };
            model.addRow(fila);
        }
    }
}
