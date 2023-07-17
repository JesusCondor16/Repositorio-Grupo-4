
import controlador.ControladorLogin;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.EmpleadoArreglo;
import modelo.EmpleadoRegular;
import vista.frmLogin;

public class App {
    public static void main(String[] args) {

        frmLogin fIngreso = new frmLogin();
        configuracion.Datos.usuarios.agregar(new EmpleadoRegular("Juan Perez", "0000001", "jperez", "abc123", "Empleado Regular","seguridad"));
        configuracion.Datos.usuarios.agregar(new EmpleadoRegular("Jose Diaz", "0000002", "jdiaz", "abc123", "Empleado Regular","contabilidad"));
        configuracion.Datos.usuarios.agregar(new EmpleadoRegular("Carlos Ramos", "0000003", "cramos", "abc123", "Empleado RRHH","RRHH"));
    /*    try {
            librerias.SerializadoraGen.serializar("trabajadores", configuracion.Datos.usuarios);
        } catch (Exception e) {
            
        }*/
        ControladorLogin controlador = new ControladorLogin(configuracion.Datos.usuarios, fIngreso);
        controlador.iniciar();
        
    }  
}