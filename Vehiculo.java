public class Vehiculo {
    String placa;
    String propietario;
    int cilindraje;
    String modelo;

    public Vehiculo(String placa, String propietario, int cilindraje, String modelo) {
        this.placa = placa;
        this.propietario = propietario;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
    }
    public void mostrarInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Propietario: " + propietario);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Modelo: " + modelo);
    }

}