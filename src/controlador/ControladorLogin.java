
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.EmpleadoArreglo;
import vista.frmLogin;
import vista.frmRegular;
import vista.frmRRHH;

public class ControladorLogin {
    EmpleadoArreglo modelo;
    frmLogin vista;

    public ControladorLogin(EmpleadoArreglo modelo, 
            frmLogin vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnIngresar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Empleado u = modelo.validar(vista.txtUsuario.getText(), 
                            vista.txtClave.getText() , vista.txtTipo.getItemAt(0));
                String opcionSeleccionada = (String) vista.txtTipo.getSelectedItem();
                if (u != null){
                    if("Empleado Regular".equals(opcionSeleccionada)){
                        frmRegular vistaR = new frmRegular();
                        ControladorRegular controladorRegular = new ControladorRegular(u, vistaR);
                        controladorRegular.iniciar();
                        vista.dispose();
                    } else if("Empleado RRHH".equals(opcionSeleccionada)) {
                        frmRRHH vistaH = new frmRRHH();
                        ControladorRRHH controladorRRHH = new ControladorRRHH(u, vistaH);
                        controladorRRHH.iniciar();
                        vista.dispose();
                    }
                    
                } else {
                    JOptionPane.showMessageDialog( vista, "Credenciales invalidas" );
                }
                limpiarControles();
            }
        });
    }

    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        limpiarControles();
        this.vista.setVisible(true);
    }
    
    public void limpiarControles(){
        vista.txtClave.setText("");
        vista.txtUsuario.setText("");   
    }
}
