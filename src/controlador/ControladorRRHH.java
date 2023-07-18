package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.EmpleadoRRHH;
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
        Licencia lice = (Licencia)librerias.SerializadoraGen.deserializar("licencia");
        
        modelo.solicitarLicenciaRRHH(lice.getDepartamento(), lice.getFechaInicio(), lice.getFechaFin(), lice.getEmpleado(), lice.getEstado(),lice.getJustificacion(), lice.getTipo(),lice.getRazon());
        actualizarTablaSolicitudes();
      

        
        this.vista.tblSolicitudes.getSelectionModel().addListSelectionListener(e -> {
            int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
            if (filaSeleccionada != -1) {
                String[] solicitud = modelo.getSolicitudesLicenciaRRHH().get(filaSeleccionada);
                mostrarDatosSolicitud(solicitud);
            }
        });

        this.vista.btnAprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
                if (filaSeleccionada != -1) {
                    lice.setEstado("Aprobado");
                    lice.setRazon(vista.txtRazon.getText());
                    modelo.solicitarLicenciaRRHH(lice.getDepartamento(), lice.getFechaInicio(), lice.getFechaFin(), lice.getEmpleado(),lice.getEstado() ,lice.getJustificacion(), lice.getTipo(),lice.getRazon());

                    actualizarTablaRRHH();
                    librerias.SerializadoraGen.serializar("licencia",lice);
                }
            }
        });

        this.vista.btnRechazar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
                if (filaSeleccionada != -1) {
                    lice.setEstado("Rechazado");
                    lice.setRazon(vista.txtRazon.getText());
                    modelo.solicitarLicenciaRRHH(lice.getDepartamento(), lice.getFechaInicio(), lice.getFechaFin(), lice.getEmpleado(),lice.getEstado() ,lice.getJustificacion(), lice.getTipo(),lice.getRazon());
                    
                    actualizarTablaRRHH();
                    librerias.SerializadoraGen.serializar("licencia",lice);
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
        actualizarTablaSolicitudes(); // Agregado para actualizar la tabla al iniciar el formulario
    }
    
    private void mostrarDatosSolicitud(String[] solicitud) {
            vista.lblJustif.setText(solicitud[4]);
    vista.txtRazon.setText(solicitud[7]);
    vista.txtRazon.setEnabled(true);
    vista.btnAprobar.setEnabled(true);
    vista.btnRechazar.setEnabled(true);
    }
    
    private void aprobarSolicitud(String[] solicitud) {
        String razon = vista.txtRazon.getText();
        
        solicitud[1]=("Aprobada");
        solicitud[7]=razon;
        
        modelo.actualizarSolicitud(solicitud);
        vista.actualizarTablaSolicitudes();
    }
    
    private void rechazarSolicitud(String[] solicitud) {
        String razon = vista.txtRazon.getText();
        
        solicitud[1]=("Rechazada");
        solicitud[7]=(razon);
        
        modelo.actualizarSolicitud(solicitud);
        vista.actualizarTablaSolicitudes();
    }
    
    public void actualizarTablaSolicitudes() {
        //depa,"Pendiente",fechaInicioString,fechaFinalString,motivo,tipo,modelo.getNombre(),"--"

        List<String[]> solicitudes = modelo.getSolicitudesLicenciaRRHH();
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
        DefaultTableModel model = (DefaultTableModel) vista.tblSolicitudes.getModel();
        model.setDataVector(datos, new Object[]{"Departamento","Fecha Inicio" ,"Fecha Fin", "Empleado", "Estado","tipo","Razon"});
        
    }
    public void actualizarTablaRRHH(){
        
        List<String[]> solicitudes = modelo.getSolicitudesLicenciaRRHH();
        Object[][] datos = new Object[solicitudes.size()][8];

        for (int i = 0; i < solicitudes.size(); i++) {
            String[] solicitud = solicitudes.get(i);
            datos[0][0] = solicitud[0]; // Depa
            datos[0][1] = solicitud[2]; // FechaInicio
            datos[0][2] = solicitud[3]; // Fecha Final
            datos[0][3] = solicitud[6]; // Nombre
            datos[0][4] = solicitud[1]; // Estado
            datos[0][5] = solicitud[5]; // tipo
            datos[0][6] = solicitud[7]; // razon
        }
        DefaultTableModel model = (DefaultTableModel) vista.tblSolicitudes.getModel();
        model.setDataVector(datos, new Object[]{"Departamento","Fecha Inicio" ,"Fecha Fin", "Empleado", "Estado","tipo","Razon"});
    }
}
