
package modelo;

public class UsuarioArreglo {
    private Usuario[] usuarios;
    private int indice;

    public UsuarioArreglo(int tamano) {
        this.usuarios = new Usuario[tamano];
        this.indice = 0;
    }
    
    public void agregar(Usuario usuario){
        this.usuarios[this.indice] = usuario;
        this.indice++;
    }

    public Usuario validar(String usuario, String clave){
        Usuario resultado = null;
         for(Usuario u : this.usuarios){
             if(u != null && u.validar(usuario, clave)){
                 resultado = u;
                 break;
             }
         }
        
        return resultado;
    }
}
