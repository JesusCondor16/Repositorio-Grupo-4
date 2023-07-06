
package modelo;

public class Usuario {
    private String nombre;
    private String dni;
    private Login login;

    public Usuario(String nombre, String dni, String usuario, String clave) {
        this.nombre = nombre;
        this.dni = dni;
        this.login = new Login(usuario, clave);
        
    }
    
    public boolean validar(String usuario, String clave){
        return this.login.validar(usuario, clave);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", login=" + login + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Login getLogin() {
        return login;
    }
    
    
}
