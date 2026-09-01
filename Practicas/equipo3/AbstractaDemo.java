// 3. CLASES Y MÉTODOS ABSTRACTOS

// Clase abstracta: sirve de plantilla y no se puede instanciar directamente
abstract class Personaje {
    String nombre;

    Personaje(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: define qué debe hacer el personaje, pero no cómo.
    // Obliga a las subclases a darle una implementación.
    abstract void atacar();

    // Método concreto: comportamiento común heredado directamente por todos
    void curar() {
        System.out.println(nombre + " usa una poción y recupera vida.");
    }
}

// Subclase Guerrero: implementa obligatoriamente el método atacar()
class Guerrero extends Personaje {
    Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    void atacar() {
        System.out.println(nombre + " ataca blandiendo su espada de acero: ¡Zas!");
    }
}

// Subclase Mago: implementa obligatoriamente el método atacar()
class Mago extends Personaje {
    Mago(String nombre) {
        super(nombre);
    }

    @Override
    void atacar() {
        System.out.println(nombre + " lanza una bola de fuego mágico: ¡Fuego!");
    }
}

public class AbstractaDemo {
    public static void main(String[] args) {
        System.out.println("=== 3. Pilar: Clases y Métodos Abstractos ===");

        // Si intentamos instanciar la clase abstracta directamente, dará error de compilación:
        // Personaje p = new Personaje("Héroe Genérico"); // ERROR: Personaje es abstracta

        // Creamos instancias de las clases hijas concretas
        Personaje guerrero = new Guerrero("Ragnar");
        Personaje mago = new Mago("Gandalf");

        guerrero.atacar();
        mago.atacar();

        // Ambos usan el método concreto heredado directamente
        guerrero.curar();
        mago.curar();
    }
}
