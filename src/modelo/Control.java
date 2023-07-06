
package modelo;

public class Control {
    private Licencia[] licencias;

    public Control(Licencia[] licencias) {
        this.licencias = licencias;
    }

    public void mostrarLicenciasAceptadas() {
        for (Licencia licencia : licencias) {
            if (licencia != null && licencia.getEstado()) {
                System.out.println(licencia);
            }
        }
    }

    public void mostrarLicenciasDenegadas() {
        for (Licencia licencia : licencias) {
            if (licencia != null && !licencia.getEstado()) {
                System.out.println(licencia);
            }
        }
    }

    public void mostrarLicenciasEmitidas() {
        for (Licencia licencia : licencias) {
            if (licencia != null) {
                System.out.println(licencia);
            }
        }
    }
}

