
package modelo;

public class LicenciaTipo {
    private String tipo;
    private String motivo;

    public LicenciaTipo(String tipo, String motivo) {
        this.tipo = tipo;
        this.motivo = motivo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMotivo() {
        return motivo;
    }

}