
import controlador.ControladorLogin;
import modelo.Empleado;
import modelo.EmpleadoRegular;
import modelo.EmpleadoRRHH;
import modelo.EmpleadoArreglo;
import vista.frmLogin;

public class App {

   public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Creamos empleado
            EmpleadoRegular modelo = new EmpleadoRegular("Nombre del Empleado", "12345678", "usuario", "clave", "Empleado Regular", "Departamento");
            
        }
    });
}
    
}
