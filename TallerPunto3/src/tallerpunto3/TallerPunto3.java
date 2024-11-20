package tallerpunto3;

import backend.PuntoFabrica;
import backend.TiendaCentroComercial;
import backend.EspacioAlmacen;
import backend.PuntoDeVenta;
import java.util.Scanner;

public class TallerPunto3 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        registro_punto_de_venta();

    }

    public static void registro_punto_de_venta() {
        
        
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
                    System.out.println("");
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
