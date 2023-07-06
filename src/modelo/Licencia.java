
package modelo;

import java.util.Date;

public class Licencia {
    private Date fechaSolicitud;
    private boolean estado;
    private Date fechaInicio;
    private Date fechaFin;

    public Licencia(Date fechaSolicitud, boolean estado, Date fechaInicio, Date fechaFin) {
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void cambiarEstado(boolean estado) {
        this.estado = estado;
    }

    public void revisarLicencia() {
        // Lógica de revisión de la licencia
    }

    public void aceptarLicencia() {
        // Lógica de aceptar la licencia
    }

    public void denegarLicencia() {
        // Lógica de denegar la licencia
    }

    // Getters y setters

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public boolean getEstado() {
        return estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    // Otros métodos y lógica adicional según sea necesario
}

