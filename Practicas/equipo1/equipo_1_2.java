public class equipo_1_2 {
    public static void main(String[] args) {
        double[][] calificaciones = {
            {8.0, 9.0, 7.0}, // Estudiante 1
            {6.0, 7.0, 8.0}, // Estudiante 2
            {9.0, 10.0, 8.0} // Estudiante 3
        };

        int numEstudiante = 1;

        for (double[] estudiante : calificaciones) { // Recorre cada fila (estudiante)
            double suma = 0;

            for (double nota : estudiante) { // Recorre cada nota del estudiante
                suma += nota;
            }

            double promedio = suma / estudiante.length;

            System.out.println("Estudiante " + numEstudiante + " - Promedio: " + promedio);
            numEstudiante++;
        }
    }
}
