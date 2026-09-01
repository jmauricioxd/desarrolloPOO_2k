// Importamos ArrayList de la librería de Java
// ArrayList nos permite crear listas que pueden cambiar de tamaño
import java.util.ArrayList;

// Creamos nuestra clase principal
public class EjemploArrayList {

    // Método principal: aquí comienza la ejecución del programa
    public static void main(String[] args) {

        // Creamos un ArrayList llamado "estudiantes"
        // <String> indica que solamente almacenaremos textos
        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregamos el primer estudiante a la lista
        estudiantes.add("Katy");

        // Agregamos el segundo estudiante
        estudiantes.add("María");

        // Agregamos el tercer estudiante
        estudiantes.add("Carlos");

        // Mostramos un mensaje en pantalla
        System.out.println("Lista de estudiantes:");

        // Mostramos todos los estudiantes que están dentro de la lista
        System.out.println(estudiantes);

        // get(0) obtiene el estudiante que está en la posición 0
        // En Java, las posiciones comienzan desde 0
        System.out.println("Primer estudiante: " + estudiantes.get(0));

        // remove() elimina un estudiante de la lista
        // En este caso eliminamos a María
        estudiantes.remove("María");

        // Mostramos un mensaje después de eliminar al estudiante
        System.out.println("Después de eliminar a María:");

        // Mostramos nuevamente la lista para comprobar que María fue eliminada
        System.out.println(estudiantes);

        // size() nos indica cuántos elementos tiene actualmente la lista
        System.out.println("Cantidad de estudiantes: " + estudiantes.size());
    }

}