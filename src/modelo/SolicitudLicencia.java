package modelo;

public class SolicitudLicencia {
    private String motivo;
    private String tipo;

    public SolicitudLicencia(String motivo, String tipo) {
        this.motivo = motivo;
        this.tipo = tipo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
