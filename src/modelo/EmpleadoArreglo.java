
package modelo;

public class EmpleadoArreglo {
    private Empleado[] empleados;
    private int indice;

    public EmpleadoArreglo(int tamano) {
        this.empleados = new Empleado[tamano];
        this.indice = 0;
    }

    public void agregar(Empleado empleado) {
        this.empleados[this.indice] = empleado;
        this.indice++;
    }

    public boolean eliminar(Empleado empleado) {
        for (int i = 0; i < this.indice; i++) {
            if (this.empleados[i] == empleado) {
                for (int j = i; j < this.indice - 1; j++) {
                    this.empleados[j] = this.empleados[j + 1];
                }
                this.empleados[this.indice - 1] = null;
                this.indice--;
                return true;
            }
        }
        return false;
    }

    public void mostrar() {
        for (int i = 0; i < this.indice; i++) {
            System.out.println(this.empleados[i].getNombre());
        }
    }

    public Empleado buscar(String nombre) {
        for (int i = 0; i < this.indice; i++) {
            if (this.empleados[i].getNombre().equalsIgnoreCase(nombre)) {
                return this.empleados[i];
            }
        }
        return null;
    }
    public Empleado validar(String usuario, String clave){
        Empleado resultado=null;
        for(Empleado u: this.empleados){
            if(u!=null && u.ingresarSistema(usuario, clave)){
                resultado = u;
                break;
            }
        }
        return resultado;
    }
}
