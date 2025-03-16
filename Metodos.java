public class Metodos {
    Vehiculo[][] parqueadero = new Vehiculo[4][4];

    public void llenarMatriz(int fila, int columna, Vehiculo vehiculo) {
        if (parqueadero[fila][columna] == null) {
            parqueadero[fila][columna] = vehiculo;
            System.out.println("Vehículo estacionado en la celda [" + fila + "][" + columna + "]");
        } else {
            System.out.println("La celda [" + fila + "][" + columna + "] ya está ocupada.");
        }
    }

    
    public void retirarVehiculo(int fila, int columna) {
        if (parqueadero[fila][columna] != null) {
            parqueadero[fila][columna] = null;
            System.out.println("La celda [" + fila + "][" + columna + "] ahora está disponible.");
        } else {
            System.out.println("La celda [" + fila + "][" + columna + "] ya está vacía.");
        }
    }

    
    public void mostrarDisponibilidad() {
        System.out.println("\nDisponibilidad de celdas:");
        for (int i = 0; i < parqueadero.length; i++) {
            for (int j = 0; j < parqueadero[i].length; j++) {
                if (parqueadero[i][j] == null) {
                    System.out.print("[" + i + "][" + j + "] Vacía | ");
                } else {
                    System.out.print("[" + i + "][" + j + "] Ocupada | ");
                }
            }
            System.out.println();
        }
    }
}
