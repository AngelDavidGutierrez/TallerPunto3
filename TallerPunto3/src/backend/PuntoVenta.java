package backend;

public abstract class PuntoVenta {
    private String codigo;
    private String direccion;
    private String telefono;
    private double area;
    protected double presupuestoVentas;
    
    public PuntoVenta(String codigo, String direccion, String telefono, double area) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.area = area;
        this.presupuestoVentas = calcularPresupuestoVentas();
    }
    
    private double calcularPresupuestoVentas() {
        return (area < 4) ? 500000 : 8000000;
    }
    
    public void consultar() {
        System.out.println("Informacion del punto de venta:");
        System.out.println("Código: " + codigo);
        System.out.println("Dirección: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Área: " + area + "metros cuadrados");
        System.out.println("Presupuesto de ventas: $" + presupuestoVentas);
    }
}

