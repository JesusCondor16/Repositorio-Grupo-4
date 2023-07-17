package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.EmpleadoArreglo;
import modelo.EmpleadoRegular;
import modelo.EmpleadoRRHH;
import vista.frmLogin;
import vista.frmRegular;
import vista.frmRRHH;

public class ControladorLogin {
    EmpleadoArreglo modelo;
    frmLogin vista;

    public ControladorLogin(EmpleadoArreglo modelo, frmLogin vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = vista.txtUsuario.getText();
                String clave = vista.txtClave.getText();
                String tipoEmpleado = (String) vista.txtTipo.getSelectedItem();

                if (usuario.isEmpty() || clave.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Por favor, ingresa usuario y clave.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (tipoEmpleado == null) {
                    JOptionPane.showMessageDialog(vista, "Por favor, selecciona un tipo de empleado.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    Empleado empleado = modelo.validar(usuario, clave);

                    if (empleado != null) {
                        if (tipoEmpleado.equals("Empleado Regular") && empleado instanceof EmpleadoRegular) {
                            frmRegular vistaR = new frmRegular();
                            ControladorRegular controladorRegular = new ControladorRegular((EmpleadoRegular) empleado, vistaR);
                            controladorRegular.iniciar();
                            vista.dispose();
                        } else if (tipoEmpleado.equals("Empleado RRHH") && empleado instanceof EmpleadoRegular) {
                            frmRRHH vistaH = new frmRRHH((EmpleadoRegular) empleado);
                            ControladorRRHH controladorRRHH = new ControladorRRHH((EmpleadoRegular) empleado, vistaH);
                            controladorRRHH.iniciar();
                            vista.dispose();
                        } else {
                            JOptionPane.showMessageDialog(vista, "Tipo de empleado incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(vista, "Credenciales inválidas", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    limpiarControles();
                }
            }
        });
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        limpiarControles();
        this.vista.setVisible(true);
    }
    
    public void limpiarControles() {
        vista.txtClave.setText("");
        vista.txtUsuario.setText("");   
    }
}
