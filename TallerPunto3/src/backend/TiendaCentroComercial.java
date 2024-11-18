package backend;

public class TiendaCentroComercial extends PuntoDeVenta {
    private String administrador;
    private int numeroEmpleados;
    private String lineaRopaMasVendida;
    
    public TiendaCentroComercial(String codigo, String direccion, String telefono, double area, String administrador, int numeroEmpleados, String lineaRopaMasVendida) {
        super(codigo, direccion, telefono, area);
        this.administrador = administrador;
        this.numeroEmpleados = numeroEmpleados;
        this.lineaRopaMasVendida = lineaRopaMasVendida;
    }
    
    @Override
    public void consultar() {
        super.consultar();
        System.out.println("Administrador: " + administrador);
        System.out.println("Número de empleados: " + numeroEmpleados);
        System.out.println("Línea de ropa más vendida: " + lineaRopaMasVendida);
    }
}
