package tallerpunto3;

import backend.PuntoDeFabrica;
import backend.TiendaCentroComercial;
import backend.EspacioEnAlmacen;
import backend.PuntoDeVenta;
import java.util.ArrayList;
import java.util.Scanner;

public class TallerPunto3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PuntoDeVenta> puntosDeVenta = new ArrayList<>();
        
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
                    //ingresarPuntoDeVenta(); 
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
