package backend;

public class PuntoFabrica extends PuntoDeVenta {
    private String administrador;
    private int numeroEmpleados;
    
    public PuntoFabrica(String codigo, String direccion, String telefono, double area, String administrador, int numeroEmpleados) {
        super(codigo, direccion, telefono, area);
        this.administrador = administrador;
        this.numeroEmpleados = numeroEmpleados;
    }
    
    @Override
    public void consultar() {
        super.consultar();
        System.out.println("Administrador: " + administrador);
        System.out.println("Número de empleados: " + numeroEmpleados);
    }
}
