package controlador;

import modelo.EmpleadoRegular;
import vista.frmRegular;
import vista.frmLogin;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ControladorRegular {
    EmpleadoRegular modelo;
    frmRegular vista;

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
                modelo.solicitarLicencia(motivo, tipo);
                // Actualizar la tabla de solicitudes en la interfaz
                actualizarTablaSolicitudes();
            }
        });
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }

    private void actualizarTablaSolicitudes() {
        // Obtener la lista de solicitudes de licencia del modelo
        List<String[]> solicitudes = modelo.getSolicitudesLicencia();
        // Crear un arreglo de objetos para almacenar los datos de las solicitudes
        Object[][] datos = new Object[solicitudes.size()][4];
        for (int i = 0; i < solicitudes.size(); i++) {
            String[] solicitud = solicitudes.get(i);
            datos[i][0] = solicitud[0]; // Motivo
            datos[i][1] = solicitud[1]; // Fecha inicio
            datos[i][2] = solicitud[2]; // Fecha fin
            datos[i][3] = solicitud[3]; // Estado

        }
        // Actualizar la tabla en la interfaz con los nuevos datos
        DefaultTableModel model = (DefaultTableModel) vista.tblRegistroU.getModel();
        model.setDataVector(datos, new Object[]{"Motivo", "Fecha inicio", "Fecha fin", "Estado"});
    }
}
