
package modelo;

public class EmpleadoRegular extends Empleado {
    private String departamento;

    public EmpleadoRegular(String nombre, String dni, String usuario, String clave, String departamento) {
        super(nombre, dni, usuario, clave);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void solicitarLicencia(String motivo, String tipo) {
        // Implementación del método
    }

    public void mostrarActividad(String nombre, String departamento) {
        // Implementación del método
    }
}
