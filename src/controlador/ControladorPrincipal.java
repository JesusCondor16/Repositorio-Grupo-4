
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Empleado;
import modelo.EmpleadoArreglo;
/*import vista.frmIngreso;*/

public class ControladorPrincipal {
    Empleado modelo;
    /*frmPrincipal vista;

    public ControladorPrincipal(Empleado modelo, frmPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.lblUsuario.setText("Empleado:"+ modelo.getNombre());
        
        this.vista.btnSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmIngreso fIngreso = new frmIngreso();
                ControladorLogin controlador = 
                        new ControladorLogin(configuracion.Datos.usuarios, fIngreso);
                controlador.iniciar();
                
                vista.dispose();
            }
        });
    }
     
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }*/
}
