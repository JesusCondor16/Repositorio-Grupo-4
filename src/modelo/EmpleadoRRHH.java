
package modelo;

public class EmpleadoRRHH extends Empleado {
    private String accesibilidad;

    public EmpleadoRRHH(String nombre, String dni, String usuario, String clave, String tipoEmpleado, String accesibilidad) {
        super(nombre, dni, usuario, clave, tipoEmpleado);
        this.accesibilidad = accesibilidad;
    }


}
