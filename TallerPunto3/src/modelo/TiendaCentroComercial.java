package modelo;

public class TiendaCentroComercial extends PuntoVenta {
    private String administrador;
    private int numeroEmpleados;
    private String lineaRopa ;
    private int cantidadVendida;

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



    public String getLineaRopa() {
        return lineaRopa;
    }



    public void setLineaRopa(String lineaRopa) {
        this.lineaRopa = lineaRopa;
    }



    public int getCantidadVendida() {
        return cantidadVendida;
    }



    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }



    public TiendaCentroComercial(String codigo, String diteccion, String telefono, double area,
            double presupuestoVentas, String administrador, int numeroEmpleados) {
        super(codigo, diteccion, telefono, area, presupuestoVentas);
        this.administrador = administrador;
        this.numeroEmpleados = numeroEmpleados;
    }

    
}
