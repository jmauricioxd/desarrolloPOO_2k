package equipo4;

// Este es el punto de inicio del programa.
// Crea un objeto de la clase Sistema y muestra el menú de opciones.
// Desde aquí el usuario puede registrar, mostrar, buscar, guardar
// y leer estudiantes. También controla las opciones introducidas por
// el usuario.

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("\n===== SISTEMA DE ESTUDIANTES =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Guardar en archivo");
            System.out.println("5. Leer archivo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {

                    case 1:
                        sistema.registrarEstudiante();
                        break;

                    case 2:
                        sistema.mostrarEstudiantes();
                        break;

                    case 3:
                        sistema.buscarEstudiante();
                        break;

                    case 4:
                        try {
                            sistema.guardarEnArchivo();
                        } catch (IOException e) {
                            System.out.println("Error al guardar el archivo.");
                        }
                        break;

                    case 5:
                        try {
                            sistema.leerArchivo();
                        } catch (IOException e) {
                            System.out.println("Error al leer el archivo.");
                        }
                        break;

                    case 6:
                        System.out.println("Programa finalizado.");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: debes ingresar un número.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
