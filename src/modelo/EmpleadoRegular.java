package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpleadoRegular extends Empleado {
    private String departamento;
    private List<String[]> solicitudesLicencia;
    private List<Licencia> solicitudesLicenciaRRHH;

    public EmpleadoRegular(String nombre, String dni, String usuario, String clave, String tipoEmpleado, String departamento) {
        super(nombre, dni, usuario, clave, tipoEmpleado);
        this.departamento = departamento;
        this.solicitudesLicencia = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void solicitarLicencia(Date fechaInicio,Date fechaFin,EmpleadoRegular modelo,String motivo, String tipo) {
        // Crear una nueva solicitud de licencia y agregarla a la lista de solicitudes
        //Licencia(String departamento, Date fechaInicio, Date fechaFin, EmpleadoRegular empleado, String estado, String justificacion, String tipo)
        Licencia solicitud = new Licencia(departamento, fechaInicio, fechaFin, modelo, "Pendiente", motivo, tipo);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicioString = dateFormat.format(solicitud.getFechaInicio());
        String fechaFinalString = dateFormat.format(solicitud.getFechaFin());
 
        solicitudesLicencia.add(new String[]{departamento,"Pendiente",fechaInicioString,fechaFinalString,motivo,tipo});
    }

    public List<String[]> getSolicitudesLicencia() {
        return solicitudesLicencia;
    }
    public List<Licencia> getSolicitudesLicenciaRRHH() {
        return solicitudesLicenciaRRHH;
    }
    public void solicitarLicenciaRRHH(Date fechaInicio,Date fechaFin,EmpleadoRegular modelo,String motivo, String tipo) {
        // Crear una nueva solicitud de licencia y agregarla a la lista de solicitudes
        //Licencia(String departamento, Date fechaInicio, Date fechaFin, EmpleadoRegular empleado, String estado, String justificacion, String tipo)
        Licencia solicitud = new Licencia(departamento, fechaInicio, fechaFin, modelo, "Pendiente", motivo, tipo);
        solicitudesLicenciaRRHH.add(solicitud);
    }
    public void actualizarSolicitud(Licencia licencia) {
        // Aquí debes implementar la lógica para actualizar la solicitud de licencia en tu modelo de datos
        // Por ejemplo, buscar la solicitud en la lista y reemplazarla con la licencia modificada
        int index = solicitudesLicenciaRRHH.indexOf(licencia);
        if (index != -1) {
           solicitudesLicenciaRRHH.set(index, licencia);
        }
    }
}
