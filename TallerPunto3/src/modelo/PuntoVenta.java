package modelo;

abstract class PuntoVenta {
    protected String codigo;
    protected String diteccion;
    protected String telefono;
    protected double area;
    protected double presupuestoVentas;

    protected PuntoVenta(String codigo, String diteccion, String telefono, double area, double presupuestoVentas) {
        this.codigo = codigo;
        this.diteccion = diteccion;
        this.telefono = telefono;
        this.area = area;
        this.presupuestoVentas = presupuestoVentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDiteccion() {
        return diteccion;
    }

    public void setDiteccion(String diteccion) {
        this.diteccion = diteccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPresupuestoVentas() {
        return presupuestoVentas;
    }

    public void setPresupuestoVentas(double presupuestoVentas) {
        this.presupuestoVentas = presupuestoVentas;
    }

}
