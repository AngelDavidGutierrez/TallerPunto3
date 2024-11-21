package modelo;

public class PuntoFabrica extends PuntoVenta {

    private String administrador;
    private int numeroEmpleados;

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public PuntoFabrica(String codigo, String diteccion, String telefono, double area, double presupuestoVentas,
            String administrador, int numeroEmpleados) {
        super(codigo, diteccion, telefono, area, presupuestoVentas);
        this.administrador = administrador;
        this.numeroEmpleados = numeroEmpleados;
    }

}
