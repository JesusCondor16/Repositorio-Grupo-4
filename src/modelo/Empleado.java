
package modelo;

import java.io.Serializable;

public class Empleado  implements Serializable{
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    private String tipoEmpleado;

    public Empleado(String nombre, String apellido, String usuario, String clave, String tipoEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.tipoEmpleado = tipoEmpleado;
    }
    
    public boolean ingresarSistema(String usuario, String clave, String tipoEmpleado){
        boolean resultado = false;
        if(this.usuario.equalsIgnoreCase(usuario) &&
                this.clave.equals(clave)){
            resultado = true;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", clave=" + clave + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
     
}
