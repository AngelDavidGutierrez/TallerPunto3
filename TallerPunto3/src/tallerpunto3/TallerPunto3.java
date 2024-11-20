package tallerpunto3;

import backend.PuntoFabrica;
import backend.TiendaCentroComercial;
import backend.EspacioAlmacen;
import backend.PuntoVenta;
import java.util.ArrayList;
import java.util.Scanner;

public class TallerPunto3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PuntoVenta> puntosDeVenta = new ArrayList<>();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ingresar punto de venta");
            System.out.println("2. Consultar punto de venta");
            System.out.println("3. Listar todos los puntos de venta");
            System.out.println("4. Eliminar punto de venta");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de punto de venta:");
                    System.out.println("1. Punto de Fabrica");
                    System.out.println("2. Tienda en Centro Comercial");
                    System.out.println("3. Espacio en Almacen");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Ingrese el codigo:");
                    String codigo = scanner.nextLine();
                    System.out.println("Ingrese la direccion:");
                    String direccion = scanner.nextLine();
                    System.out.println("Ingrese el telefono:");
                    String telefono = scanner.nextLine();
                    System.out.println("Ingrese el area:");
                    double area = scanner.nextDouble();
                    scanner.nextLine();
                    
                    switch (tipo) {
                        case 1: // Ingresar punto de venta
                            System.out.println("Ingrese el administrador:");
                            String administradorF = scanner.nextLine(); // la F es de Fabrica
                            System.out.println("Ingrese el numero de empleados:");
                            int empleadosF = scanner.nextInt();
                            scanner.nextLine();
                            puntosDeVenta.add(new PuntoFabrica(codigo, direccion, telefono, area, administradorF, empleadosF));
                            break;
                        case 2:
                            System.out.println("Ingrese el administrador");
                            String administradorT = scanner.nextLine(); // la T es de Tienda
                            System.out.println("Ingrese el numero de empleados:");
                            int empleadosT = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Ingrese la linea de ropa mas vendida:");
                            String lineaRopa = scanner.nextLine();
                            puntosDeVenta.add(new TiendaCentroComercial(codigo, direccion, telefono, area, administradorT, empleadosT, lineaRopa));
                            break;
                        case 3:
                            puntosDeVenta.add(new EspacioAlmacen(codigo, direccion, telefono, area));
                            break;
                        default:
                            System.out.println("Tipo no valido");
                    }
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("saliendo del bucle");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        }
    }
    
}
