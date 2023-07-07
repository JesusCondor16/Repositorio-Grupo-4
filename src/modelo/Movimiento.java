
package modelo;

import java.util.Date;

public class Movimiento {
    private Date fecha;
    private EstadoM estado;
    private Licencia licencia;
    private Empleado empleado;

    public Movimiento(Date fecha, EstadoM estado, Licencia licencia, Empleado empleado) {
        this.fecha = fecha;
        this.estado = estado;
        this.licencia = licencia;
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public EstadoM getEstado() {
        return estado;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void mostrarInformacion() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Estado: " + estado.getEstado());
        System.out.println("Licencia: " + licencia);
        System.out.println("Empleado: " + empleado);
    }
}

