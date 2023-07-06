
import controlador.ControladorLogin;
import modelo.Usuario;
import modelo.UsuarioArreglo;
import vista.frmIngreso;

public class App {

    public static void main(String[] args) {
        
        frmIngreso fIngreso = new frmIngreso();
        configuracion.Datos.usuarios.agregar(new Usuario("Juan Perez", "0000001", "jperez", "abc123"));
        configuracion.Datos.usuarios.agregar(new Usuario("Jose Diaz", "0000002", "jdiaz", "abc123"));
        configuracion.Datos.usuarios.agregar(new Usuario("Carlos Ramos", "0000003", "cramos", "abc123"));
        
        ControladorLogin controlador = new ControladorLogin(configuracion.Datos.usuarios, fIngreso);
        controlador.iniciar();
        
    }
    
}
