import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n----- Menú -----");
            System.out.println("1. Ingresar vehículo");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Mostrar disponibilidad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Ingresar un vehículo
                    System.out.print("Ingrese la placa del vehículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese el nombre del propietario: ");
                    String propietario = scanner.nextLine();
                    System.out.print("Ingrese el cilindraje del vehículo: ");
                    int cilindraje = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer
                    System.out.print("Ingrese el modelo del vehículo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Ingrese la fila (0-3): ");
                    int fila = scanner.nextInt();
                    System.out.print("Ingrese la columna (0-3): ");
                    int columna = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer

                    Vehiculo vehiculo = new Vehiculo(placa, propietario, cilindraje, modelo);
                    metodos.llenarMatriz(fila, columna, vehiculo);

                    break;

                case 2:
                    // Retirar un vehículo
                    System.out.print("Ingrese la fila del vehículo a retirar (0-3): ");
                    fila = scanner.nextInt();
                    System.out.print("Ingrese la columna del vehículo a retirar (0-3): ");
                    columna = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer

                    metodos.retirarVehiculo(fila, columna);
                    break;

                case 3:
                    // Mostrar disponibilidad
                    metodos.mostrarDisponibilidad();
                    break; 

                case 4:
                    // Salir
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }  
        }
        scanner.close();
    }
}
