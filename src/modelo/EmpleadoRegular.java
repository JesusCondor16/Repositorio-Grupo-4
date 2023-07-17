package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpleadoRegular extends Empleado implements Serializable{
    private String departamento;
    private List<String[]> solicitudesLicencia;
    private List<String[]> solicitudesLicenciaRRHH;

    public EmpleadoRegular(String nombre, String dni, String usuario, String clave, String tipoEmpleado, String departamento) {
        super(nombre, dni, usuario, clave, tipoEmpleado);
        this.departamento = departamento;
        this.solicitudesLicencia = new ArrayList<>();
        this.solicitudesLicenciaRRHH = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void solicitarLicencia(Date fechaInicio,Date fechaFin,EmpleadoRegular modelo,String motivo, String tipo) {
        // Crear una nueva solicitud de licencia y agregarla a la lista de solicitudes
        //Licencia(String departamento, Date fechaInicio, Date fechaFin, EmpleadoRegular empleado, String estado, String justificacion, String tipo)
        Licencia solicitud = new Licencia(departamento, fechaInicio, fechaFin, modelo, "Pendiente", motivo, tipo,"--");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicioString = dateFormat.format(solicitud.getFechaInicio());
        String fechaFinalString = dateFormat.format(solicitud.getFechaFin());
 
        solicitudesLicencia.add(new String[]{departamento,"Pendiente",fechaInicioString,fechaFinalString,motivo,tipo});
    }

    public List<String[]> getSolicitudesLicencia() {
        return solicitudesLicencia;
    }
    public List<String[]> getSolicitudesLicenciaRRHH() {
        return solicitudesLicenciaRRHH;
    }
    public void solicitarLicenciaRRHH(String depa, Date fechaInicio,Date fechaFin,EmpleadoRegular modelo,String motivo, String tipo,String razon) {
        Licencia solicitud = new Licencia(depa, fechaInicio, fechaFin, modelo, "Pendiente", motivo, tipo, "--");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicioString = dateFormat.format(solicitud.getFechaInicio());
        String fechaFinalString = dateFormat.format(solicitud.getFechaFin());
 
        solicitudesLicenciaRRHH.add(new String[]{depa,"Pendiente",fechaInicioString,fechaFinalString,motivo,tipo,modelo.getNombre(),"--"});
    }
 /*   public void actualizarSolicitud(Licencia licencia) {
        // Aquí debes implementar la lógica para actualizar la solicitud de licencia en tu modelo de datos
        // Por ejemplo, buscar la solicitud en la lista y reemplazarla con la licencia modificada
        int index = solicitudesLicenciaRRHH.indexOf(licencia);
        if (index != -1) {
           solicitudesLicenciaRRHH.set(index, licencia);
        }
    }*/
}
