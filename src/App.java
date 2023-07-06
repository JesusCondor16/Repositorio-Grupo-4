
//import controlador.ControladorLogin;
import modelo.Empleado;
import modelo.EmpleadoArreglo;
//import vista.frmIngreso;
public class App {

    public static void main(String[] args) {
        
        //frmIngreso fIngreso = new frmIngreso();
        configuracion.Datos.usuarios.agregar(new Empleado("Juan Perez", "0000001", "jperez", "abc123"));
        configuracion.Datos.usuarios.agregar(new Empleado("Jose Diaz", "0000002", "jdiaz", "abc123"));
        configuracion.Datos.usuarios.agregar(new Empleado("Carlos Ramos", "0000003", "cramos", "abc123"));
        
        /*ControladorLogin controlador = new ControladorLogin(configuracion.Datos.usuarios, fIngreso);
        controlador.iniciar();*/
        
    }
    
}
