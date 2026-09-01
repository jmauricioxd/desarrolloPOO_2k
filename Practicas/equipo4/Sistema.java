package equipo4;

//Este es el archivo donde está la lógica principal del sistema.
//  Utiliza ArrayList para almacenar estudiantes y HashMap
//  para buscarlos mediante su ID. También contiene el registro,
//  búsqueda y listado de estudiantes, además del manejo de errores
//  con try, catch y throw. Finalmente,
//  contiene los métodos para guardar y leer información del archivo.txt
// , utilizando throws IOException.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sistema {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private HashMap<Integer, Estudiante> mapaEstudiantes = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void registrarEstudiante() {
        try {
            System.out.print("Ingrese el ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            if (mapaEstudiantes.containsKey(id)) {
                throw new IllegalArgumentException("Ese ID ya existe.");
            }

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            if (edad < 1 || edad > 100) {
                throw new IllegalArgumentException("La edad no es válida.");
            }

            System.out.print("Ingrese la carrera: ");
            String carrera = scanner.nextLine();

            Estudiante estudiante =
                    new Estudiante(id, nombre, edad, carrera);

            estudiantes.add(estudiante);
            mapaEstudiantes.put(id, estudiante);

            System.out.println("Estudiante registrado correctamente.");

        } catch (NumberFormatException e) {
            System.out.println("Error: debes ingresar un número válido.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarEstudiantes() {

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\n===== ESTUDIANTES =====");

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public void buscarEstudiante() {

        try {
            System.out.print("Ingrese el ID que desea buscar: ");
            int id = Integer.parseInt(scanner.nextLine());

            Estudiante estudiante = mapaEstudiantes.get(id);

            if (estudiante == null) {
                throw new Exception("No se encontró un estudiante con ese ID.");
            }

            System.out.println("Estudiante encontrado:");
            System.out.println(estudiante);

        } catch (NumberFormatException e) {
            System.out.println("Error: el ID debe ser un número.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void guardarEnArchivo() throws IOException {

        Path carpeta = Path.of("datos");
        Files.createDirectories(carpeta);

        try (BufferedWriter escritor = new BufferedWriter(
                new FileWriter(carpeta.resolve("estudiantes.txt").toFile()))) {

            for (Estudiante estudiante : estudiantes) {
                escritor.write(estudiante.toString());
                escritor.newLine();
            }
        }

        System.out.println("Estudiantes guardados correctamente.");
    }

    public void leerArchivo() throws IOException {

        Path archivo = Path.of("datos", "estudiantes.txt");

        if (!Files.exists(archivo)) {
            System.out.println("No existe el archivo de estudiantes. Guarda al menos un estudiante primero.");
            return;
        }

        try (BufferedReader lector = new BufferedReader(
                new FileReader(archivo.toFile()))) {

            String linea;

            System.out.println("\n===== ARCHIVO DE ESTUDIANTES =====");

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }
}
