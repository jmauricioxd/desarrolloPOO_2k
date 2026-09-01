// Es una simulación de cómo un auto acelera, frena y mantiene su información actualizada.
public class Vehiculo {
    // Atributos (propiedades del objeto)
    String marca;
    int velocidad;
    
    // Métodos (comportamientos del objeto)
    void acelerar() {
        velocidad = velocidad + 10;

        System.out.println("El vehículo aceleró.");
    }
    void frenar() {
        velocidad = velocidad - 10;

        System.out.println("El vehículo frenó.");
    }
    void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
    
    public static void main(String[] args) {

        Vehiculo auto = new Vehiculo();

        auto.marca = "Honda";
        auto.velocidad = 50;

        System.out.println("=== VELOCIDAD INICIAL ===");
        auto.mostrarInformacion();

        auto.acelerar();

        System.out.println("\n=== DESPUÉS DE ACELERAR ===");
        auto.mostrarInformacion();

        auto.frenar();

        System.out.println("\n=== DESPUÉS DE FRENAR ===");
        auto.mostrarInformacion();
    }
}