// Uso de clases y objetos - Ejemplo básico de Programación Orientada a Objetos
public class Persona {

    // ===== ATRIBUTOS (Propiedades de la persona) =====
    String nombre;  // Almacena el nombre de la persona
    int edad;       // Almacena la edad en años

    // ===== MÉTODO PRINCIPAL: Punto de entrada del programa =====
    public static void main(String[] args) {

        // --- CREAR UN OBJETO ---
        // Instancia (crea) un nuevo objeto de tipo Persona
        Persona persona1 = new Persona();

        // --- ASIGNAR VALORES A LOS ATRIBUTOS ---
        // Asigna el nombre "Carlos" al atributo nombre del objeto persona1
        persona1.nombre = "Carlos";
        
        // Asigna la edad 17 al atributo edad del objeto persona1
        persona1.edad = 17;

        // --- MOSTRAR LA INFORMACIÓN ---
        // Imprime el nombre de la persona usando el operador de concatenación +
        System.out.println("Nombre: " + persona1.nombre);
        
        // Imprime la edad de la persona
        System.out.println("Edad: " + persona1.edad);
    }
}