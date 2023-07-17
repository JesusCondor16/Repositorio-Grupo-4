package modelo;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRegular extends Empleado {
    private String departamento;
    private List<String[]> solicitudesLicencia;

    public EmpleadoRegular(String nombre, String dni, String usuario, String clave, String tipoEmpleado, String departamento) {
        super(nombre, dni, usuario, clave, tipoEmpleado);
        this.departamento = departamento;
        this.solicitudesLicencia = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void solicitarLicencia(String motivo, String tipo) {
        // Crear una nueva solicitud de licencia y agregarla a la lista de solicitudes
        String[] solicitud = new String[]{motivo, tipo, "", "Pendiente"}; 
        solicitudesLicencia.add(solicitud);
    }

    public List<String[]> getSolicitudesLicencia() {
        return solicitudesLicencia;
    }
}
