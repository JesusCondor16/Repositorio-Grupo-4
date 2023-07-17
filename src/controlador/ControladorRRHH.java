package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.EmpleadoRegular;
import modelo.Licencia;
import vista.frmRRHH;
import vista.frmRegular;
import vista.frmLogin;

public class ControladorRRHH {
    private EmpleadoRegular modelo;
    private frmRRHH vista;

    public ControladorRRHH(EmpleadoRegular modelo, frmRRHH vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.lblsubtitulo.setText("Empleado: " + modelo.getNombre());

        this.vista.btnAprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
                if (filaSeleccionada != -1) {
                    Licencia solicitud = modelo.getSolicitudLicencia(filaSeleccionada);
                    aprobarSolicitud(solicitud);
                }
            }
        });

        this.vista.btnRechazar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
                if (filaSeleccionada != -1) {
                    Licencia solicitud = modelo.getSolicitudLicencia(filaSeleccionada);
                    rechazarSolicitud(solicitud);
                }
            }
        });

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
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
    private void aprobarSolicitud(Licencia solicitud) {
        String justificacion = "Solicitud aprobada por el departamento de RRHH";
        String razon = "Motivo no especificado";
        
        solicitud.setEstado("Aprobada");
        solicitud.setJustificacion(justificacion);
        solicitud.setRazon(razon);
        
        modelo.actualizarSolicitud(solicitud);
        vista.actualizarTablaSolicitudes();
    }
    
    private void rechazarSolicitud(Licencia solicitud) {
        String justificacion = "Solicitud rechazada por el departamento de RRHH";
        String razon = "Motivo no especificado";
        
        solicitud.setEstado("Rechazada");
        solicitud.setJustificacion(justificacion);
        solicitud.setRazon(razon);
        
        modelo.actualizarSolicitud(solicitud);
        vista.actualizarTablaSolicitudes();
    }
}
