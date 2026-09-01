// Uso de clases y objetos - Ejemplo básico de un automóvil con múltiples atributos
public class Auto {

    // ===== ATRIBUTOS (Propiedades del automóvil) =====
    String marca;      // Almacena la marca del automóvil (ej: Toyota)
    String color;      // Almacena el color del automóvil (ej: Rojo)
    int velocidad;     // Almacena la velocidad actual en km/h

    // ===== MÉTODO PRINCIPAL: Punto de entrada del programa =====
    public static void main(String[] args) {

        // --- CREAR UN OBJETO ---
        // Instancia (crea) un nuevo objeto de tipo Auto
        Auto auto1 = new Auto();

        // --- ASIGNAR VALORES A LOS ATRIBUTOS ---
        // Asigna la marca "Toyota" al atributo marca del objeto auto1
        auto1.marca = "Toyota";
        
        // Asigna el color "Rojo" al atributo color del objeto auto1
        auto1.color = "Rojo";
        
        // Asigna la velocidad 60 km/h al atributo velocidad del objeto auto1
        auto1.velocidad = 60;

        // --- MOSTRAR LA INFORMACIÓN ---
        // Imprime un encabezado para organizar la salida
        System.out.println("=== DATOS DEL AUTO ===");
        
        // Imprime la marca del automóvil
        System.out.println("Marca: " + auto1.marca);
        
        // Imprime el color del automóvil
        System.out.println("Color: " + auto1.color);
        
        // Imprime la velocidad del automóvil con su unidad de medida
        System.out.println("Velocidad: " + auto1.velocidad + " km/h");
    }
}