public class EjemploExcepcion {

    // main es el método principal.
    // Es el punto donde comienza la ejecución del programa.
    // void significa que este método no devuelve ningún valor.
    // String[] args permite recibir datos desde la línea de comandos.
    public static void main(String[] args) {

        // try contiene el código que podría producir una excepción o error.
        try {

            // Declaramos una variable llamada numero1 y le asignamos el valor 10.
            int numero1 = 10;

            // Declaramos una variable llamada numero2 y le asignamos el valor 0.
            int numero2 = 0;

            // Intentamos dividir numero1 entre numero2.
            // Como no se puede dividir entre cero, se producirá una excepción.
            int resultado = numero1 / numero2;

            // Muestra el resultado en la consola.
            System.out.println("Resultado: " + resultado);

        }

        // catch sirve para capturar y manejar la excepción producida en el try.
        // ArithmeticException es el tipo de excepción que estamos controlando.
        // La variable "e" representa la excepción capturada.
        catch (ArithmeticException e) {

            // Muestra un mensaje de error en la consola.
            System.out.println("Error: no se puede dividir entre cero.");

        }

        // finally se ejecuta al finalizar el proceso,
        // independientemente de si ocurrió una excepción o no.
        finally {

            // Muestra un mensaje en la consola.
            System.out.println("El programa ha terminado.");

        }
    }
}