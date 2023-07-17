
import controlador.ControladorLogin;
import modelo.Empleado;
import modelo.EmpleadoArreglo;
import vista.frmLogin;

public class App {
    public static void main(String[] args) {

        frmLogin fIngreso = new frmLogin();
        configuracion.Datos.usuarios.agregar(new Empleado("Juan Perez", "0000001", "jperez", "abc123", "Empleado Regular"));
        configuracion.Datos.usuarios.agregar(new Empleado("Jose Diaz", "0000002", "jdiaz", "abc123", "Empleado Regular"));
        configuracion.Datos.usuarios.agregar(new Empleado("Carlos Ramos", "0000003", "cramos", "abc123", "Empleado RRHH"));

        ControladorLogin controlador = new ControladorLogin(configuracion.Datos.usuarios, fIngreso);
        controlador.iniciar();
        
    }  
}