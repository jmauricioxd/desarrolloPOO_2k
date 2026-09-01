package equipo4;

public class Estudiante {

    private int id;
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(int id, String nombre, int edad, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Nombre: " + nombre +
               " | Edad: " + edad +
               " | Carrera: " + carrera;
    }
}
//Este archivo contiene la clase Estudiante.
//  Aquí se definen los datos que tendrá cada estudiante
// : ID, nombre, edad y carrera. También tiene el constructor
//  para crear estudiantes y el método toString()
//  para mostrar sus datos.
