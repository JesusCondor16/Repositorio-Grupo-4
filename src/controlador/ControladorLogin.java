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
                Empleado u = modelo.validar(vista.txtUsuario.getText(), vista.txtClave.getText());
                String opcionSeleccionada = (String) vista.txtTipo.getSelectedItem();
                if (u != null) {
                    if ("Empleado Regular".equals(opcionSeleccionada)) {
                        if (u instanceof EmpleadoRegular) {
                            frmRegular vistaR = new frmRegular();
                            ControladorRegular controladorRegular = new ControladorRegular((EmpleadoRegular) u, vistaR);
                            controladorRegular.iniciar();
                            vista.dispose();
                        } else {
                            JOptionPane.showMessageDialog(vista, "Tipo de empleado incorrecto");
                        }
                    } else if ("Empleado RRHH".equals(opcionSeleccionada)) {
                        if (u instanceof EmpleadoRRHH) {
                            frmRRHH vistaH = new frmRRHH();
                            ControladorRRHH controladorRRHH = new ControladorRRHH((EmpleadoRRHH) u, vistaH);
                            controladorRRHH.iniciar();
                            vista.dispose();
                        } else {
                            JOptionPane.showMessageDialog(vista, "Tipo de empleado incorrecto");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Credenciales inválidas");
                }
                limpiarControles();
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
