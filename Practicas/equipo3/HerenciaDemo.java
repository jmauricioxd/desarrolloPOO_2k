// 1. HERENCIA
// Superclase (Clase Padre)
class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    void presentarse() {
        System.out.println("Hola, mi nombre es: " + nombre);
    }
}

// Subclase (Clase Hija) que hereda de Persona usando 'extends'
class Estudiante extends Persona {
    String carrera;

    Estudiante(String nombre, String carrera) {
        // Uso de 'super' para llamar al constructor de la superclase
        super(nombre);
        this.carrera = carrera;
    }

    void mostrarInfo() {
        // Uso de 'super' para llamar a un método de la superclase
        super.presentarse();
        System.out.println("Estudio la carrera de: " + carrera);
    }
}

public class HerenciaDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Pilar: Herencia ===");
        Estudiante est = new Estudiante("Anderson", "Ingeniería de Software");
        est.mostrarInfo();
    }
}
