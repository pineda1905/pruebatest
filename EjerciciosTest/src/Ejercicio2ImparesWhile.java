import java.util.Scanner;

public class Ejercicio2ImparesWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int i = 1; // Comenzamos a evaluar desde el 1 (el primer número después del 0)

        System.out.println("--- Buscador de Números Impares ---");
        System.out.println("Ingrese un número entero positivo:");
        numero = entrada.nextInt();

        // Verificamos que el número sea positivo
        if (numero > 0) {
            System.out.println("\nLos números impares entre 0 y " + numero + " son:");

            // Estructura repetitiva While
            while (i <= numero) {
                // Si el residuo de la división entre 2 es distinto de 0, es impar
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i++; // Incrementamos el contador para evitar un ciclo infinito
            }
        } else {
            System.out.println("Error: Por favor, ingrese un número mayor a cero.");
        }
    }
}
