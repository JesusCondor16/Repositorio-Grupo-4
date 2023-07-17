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
                Date fechaInicio = vista.datFinicio.getDate();
                Date fechaFin = vista.datFfin.getDate();
                
                if (motivo.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Por favor, ingresa un motivo de licencia.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    modelo.solicitarLicencia(fechaInicio,fechaFin,modelo,motivo, tipo);
                    actualizarTablaSolicitudes();
                    
                }
            }
        });
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
 //       actualizarTablaSolicitudes(); // Agregado para actualizar la tabla al iniciar el formulario
    }

    public void actualizarTablaSolicitudes() {
        List<String[]> solicitudes = modelo.getSolicitudesLicencia();
        

        /*
        Object[][] datos = new Object[solicitudes.size()][5];
        for (int i = 0; i < solicitudes.size(); i++) {
            String[] solicitud = solicitudes.get(i);
            datos[i][0] = solicitud[0]; // Motivo
            datos[i][1] = solicitud[1]; // Tipo
            datos[i][2] = solicitud[2]; // Fecha inicio
            datos[i][3] = solicitud[3]; // Fecha fin
            datos[i][4] = solicitud[5]; // Estado

        }
        */
        //departamento,"Pendiente",fechaInicioString,fechaFinalString,motivo,tipo
        Object[][] datos = new Object[solicitudes.size()][5];

        for (int i = 0; i < solicitudes.size(); i++) {
            String[] solicitud = solicitudes.get(i);
            datos[i][0] = solicitud[4]; // Motivo
            datos[i][1] = solicitud[5]; // Tipo
            datos[i][2] = solicitud[2]; // Fecha inicio
            datos[i][3] = solicitud[3]; // Fecha fin
            datos[i][4] = solicitud[1]; // Estado

    //        model.addRow(fila);
        }
        DefaultTableModel model = (DefaultTableModel) vista.tblRegistroU.getModel();
        model.setDataVector(datos, new Object[]{"Motivo","Tipo" ,"Fecha inicio", "Fecha fin", "Estado"});
    }
    
   /* public void enviarSolicitudLicencia(Date fechaInicio,Date fechaFin,EmpleadoRegular modelo,String motivo, String tipo) {
        modelo.solicitarLicencia(fechaInicio,fechaFin,modelo,motivo, tipo);
    }*/
}
