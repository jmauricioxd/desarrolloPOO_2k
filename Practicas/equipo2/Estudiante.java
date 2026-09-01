// Define una clase que representa un estudiante con sus características y acciones
public class Estudiante {

    // ===== ATRIBUTOS (Propiedades del estudiante) =====
    String nombre;      // Almacena el nombre del estudiante
    int edad;           // Almacena la edad en años
    double nota;        // Almacena la calificación (con decimales)

    // ===== MÉTODO: Acción que puede hacer el estudiante =====
    // Simula que el estudiante está estudiando
    void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    // ===== MÉTODO: Muestra los datos del estudiante =====
    // Imprime toda la información del objeto actual
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
    }

    // ===== MÉTODO PRINCIPAL: Punto de entrada del programa =====
    public static void main(String[] args) {

        // --- CREAR PRIMER OBJETO ---
        // Instancia (crea) el primer estudiante
        Estudiante estudiante1 = new Estudiante();

        // Asigna valores a los atributos del primer estudiante
        estudiante1.nombre = "Carlos";
        estudiante1.edad = 17;
        estudiante1.nota = 9.5;

        // --- CREAR SEGUNDO OBJETO ---
        // Instancia (crea) el segundo estudiante (independiente del primero)
        Estudiante estudiante2 = new Estudiante();

        // Asigna valores a los atributos del segundo estudiante
        estudiante2.nombre = "Ana";
        estudiante2.edad = 16;
        estudiante2.nota = 8.7;

        // ===== EJECUTAR ACCIONES SOBRE EL PRIMER ESTUDIANTE =====
        System.out.println("=== ESTUDIANTE 1 ===");
        estudiante1.mostrarInformacion();  // Muestra datos de Carlos
        estudiante1.estudiar();             // Simula que Carlos estudia

        System.out.println();  // Línea en blanco para separar

        // ===== EJECUTAR ACCIONES SOBRE EL SEGUNDO ESTUDIANTE =====
        System.out.println("=== ESTUDIANTE 2 ===");
        estudiante2.mostrarInformacion();  // Muestra datos de Ana
        estudiante2.estudiar();             // Simula que Ana estudia
    }
}