package modelo;

import java.io.Serializable;
import java.util.Date;

public class Licencia implements Serializable{
    private String departamento;
    private Date fechaInicio;
    private Date fechaFin;
    private EmpleadoRegular empleado;
    private String estado;
    private String justificacion;
    private String razon;
    private String tipo;

    public Licencia(String departamento, Date fechaInicio, Date fechaFin, EmpleadoRegular empleado, String estado, String justificacion, String tipo,String razon) {
        this.departamento = departamento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.empleado = empleado;
        this.estado = estado;
        this.justificacion = justificacion;
        this.tipo = tipo;
        this.razon = razon;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public EmpleadoRegular getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoRegular empleado) {
        this.empleado = empleado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
