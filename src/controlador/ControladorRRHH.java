package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 /*       Licencia lice = (Licencia)librerias.SerializadoraGen.deserializar("licencia");
        
        modelo.solicitarLicenciaRRHH(lice.getDepartamento(), lice.getFechaInicio(), lice.getFechaFin(), lice.getEmpleado(), lice.getJustificacion(), lice.getTipo(),lice.getRazon());
        actualizarTablaSolicitudes();*/
        try {
    List<Object> objetos = librerias.SerializadoraGen.deserializarTodos("licencia");
    if (!objetos.isEmpty()) {
        for(int i=0;i<objetos.size();i++){
         Object primerObjeto = objetos.get(i);
        if (primerObjeto instanceof Licencia) {
            Licencia licencia = (Licencia) primerObjeto;
            modelo.solicitarLicenciaRRHH(licencia.getDepartamento(), licencia.getFechaInicio(), licencia.getFechaFin(), licencia.getEmpleado(), licencia.getJustificacion(), licencia.getTipo(), licencia.getRazon());
            
        }
        actualizarTablaSolicitudes();
        }
        
    }

} catch (Exception e) {
    e.printStackTrace();
}

        
        this.vista.tblSolicitudes.getSelectionModel().addListSelectionListener(e -> {
            int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
  /*          if (filaSeleccionada != -1) {
                Licencia solicitud = modelo.getSolicitudesLicenciaRRHH().get(filaSeleccionada);
                mostrarDatosSolicitud(solicitud);
            }*/
        });

        this.vista.btnAprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
 /*               int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
                if (filaSeleccionada != -1) {
                    Licencia solicitud = modelo.getSolicitudesLicenciaRRHH().get(filaSeleccionada);
                    aprobarSolicitud(solicitud);
                }*/
            }
        });

        this.vista.btnRechazar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
       /*         int filaSeleccionada = vista.tblSolicitudes.getSelectedRow();
                if (filaSeleccionada != -1) {
                    Licencia solicitud = modelo.getSolicitudesLicenciaRRHH().get(filaSeleccionada);
                    rechazarSolicitud(solicitud);
                }*/
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
    
 /*   private void mostrarDatosSolicitud(Licencia solicitud) {
        vista.lblJustif.setText(solicitud.getJustificacion());
    }*/
    
 /*   private void aprobarSolicitud(Licencia solicitud) {
        String razon = vista.txtRazon.getText();
        
        solicitud.setEstado("Aprobada");
        solicitud.setRazon(razon);
        
        modelo.actualizarSolicitud(solicitud);
        vista.actualizarTablaSolicitudes();
    }*/
    
 /*   private void rechazarSolicitud(Licencia solicitud) {
        String razon = vista.txtRazon.getText();
        
        solicitud.setEstado("Rechazada");
        solicitud.setRazon(razon);
        
        modelo.actualizarSolicitud(solicitud);
        vista.actualizarTablaSolicitudes();
    }*/
    
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
}
