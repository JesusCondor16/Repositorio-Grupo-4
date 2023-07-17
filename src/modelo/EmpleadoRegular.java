package modelo;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRegular extends Empleado {
    private String departamento;
    private List<Licencia> solicitudesLicencia;

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
        Licencia solicitud = new Licencia(departamento, null, null, this, "", motivo, tipo);
        solicitudesLicencia.add(solicitud);
    }

    public List<Licencia> getSolicitudesLicencia() {
        return solicitudesLicencia;
    }

    public void actualizarSolicitud(Licencia licencia) {
        // Aquí debes implementar la lógica para actualizar la solicitud de licencia en tu modelo de datos
        // Por ejemplo, buscar la solicitud en la lista y reemplazarla con la licencia modificada
        int index = solicitudesLicencia.indexOf(licencia);
        if (index != -1) {
            solicitudesLicencia.set(index, licencia);
        }
    }
}
