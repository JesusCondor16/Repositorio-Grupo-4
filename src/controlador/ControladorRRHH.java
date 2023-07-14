
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Empleado;
import modelo.EmpleadoArreglo;
import vista.frmRRHH;
import vista.frmLogin;

public class ControladorRRHH {
    Empleado modelo;
    frmRRHH vista;

    public ControladorRRHH(Empleado modelo, frmRRHH vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.lblsubtitulo.setText("Empleado:"+ modelo.getNombre());
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
     
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}