
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.EmpleadoArreglo;
import vista.frmLogin;

public class ControladorLogin {
    EmpleadoArreglo modelo;
    frmLogin vista;

    public ControladorLogin(EmpleadoArreglo modelo, 
            frmLogin vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.vista.btnIngresar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Empleado u = modelo.validar(vista.txtUsuario.getText(), 
                            vista.txtClave.getText() );
                if (u != null){
                    //JOptionPane.showMessageDialog( vista, u );
                    JOptionPane.showMessageDialog(vista,u);
                    
                    
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
