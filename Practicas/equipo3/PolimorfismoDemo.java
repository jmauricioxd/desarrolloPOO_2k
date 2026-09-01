// 2. POLIMORFISMO Y SOBRESCRITURA
// Clase base
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}

// Subclase Perro que sobrescribe el método
class Perro extends Animal {
    // Redefinición de métodos usando la anotación @Override
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

// Subclase Gato que sobrescribe el método
class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau miau!");
    }
}

public class PolimorfismoDemo {
    public static void main(String[] args) {
        System.out.println("=== 2. Pilar: Polimorfismo y Sobrescritura ===");
        
        // Polimorfismo: mismo tipo de referencia (Animal), comportamientos distintos en tiempo de ejecución
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miPerro.hacerSonido();
        miGato.hacerSonido();
    }
}
