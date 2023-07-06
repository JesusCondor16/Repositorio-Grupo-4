
package modelo;

public class Empleado {
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    private Login login;

    public Empleado(String nombre, String apellido, String usuario, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.login = new Login(usuario, clave);
    }
    
    public boolean validar(){
        return this.login.validar(usuario, clave);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", clave=" + clave + ", login=" + login + '}';
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

    public Login getLogin() {
        return login;
    }
     
}
