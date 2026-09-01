// 4. INTERFACES
// Contrato de software con 'interface'
interface Conectable {
    // Métodos abstractos por defecto (no requieren cuerpo)
    void encender();
    void apagar();
}

// Implementación del contrato con 'implements'
class Televisor implements Conectable {
    @Override
    public void encender() {
        System.out.println("Televisor encendido: Cargando señal hdmi...");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor apagado: Guardando configuración.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== 4. Pilar: Interfaces ===");
        
        Conectable tv = new Televisor();
        tv.encender();
        tv.apagar();
    }
}
