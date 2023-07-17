
package modelo;

public class LicenciaArreglo {
    private Licencia[] licencias;
    private int tamano;

    public LicenciaArreglo(int tamano) {
        this.licencias = new Licencia[tamano];
        this.tamano = 0;
    }

    public void agregar(Licencia licenciaTipo) {
        this.licencias[this.tamano] = licenciaTipo;
        this.tamano++;
    }

    public void eliminar(Licencia licenciaTipo) {
        for (int i = 0; i < this.tamano; i++) {
            if (this.licencias[i] == licenciaTipo) {
                for (int j = i; j < this.tamano - 1; j++) {
                    this.licencias[j] = this.licencias[j + 1];
                }
                this.licencias[this.tamano - 1] = null;
                this.tamano--;
                break;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < this.tamano; i++) {
            System.out.println(this.licencias[i].getTipo());
        }
    }

    public Licencia buscar(String tipo) {
        for (int i = 0; i < this.tamano; i++) {
            if (this.licencias[i].getTipo().equalsIgnoreCase(tipo)) {
                return this.licencias[i];
            }
        }
        return null;
    }
}
