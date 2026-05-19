import java.util.Scanner;

public class Ejercicio1Examen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int correctas, incorrectas, vacias, puntaje;

        System.out.println("--- Calculadora de Puntaje de Examen ---");

        System.out.println("Ingrese el número de respuestas correctas:");
        correctas = entrada.nextInt();

        System.out.println("Ingrese el número de respuestas incorrectas:");
        incorrectas = entrada.nextInt();

        System.out.println("Ingrese el número de respuestas vacías:");
        vacias = entrada.nextInt();

        // Calcular el puntaje con los valores indicados
        // Correctas: 5 puntos | Incorrectas: -2 puntos | Vacías: 0 puntos
        puntaje = (correctas * 5) + (incorrectas * -2) + (vacias * 0);

        System.out.println("\n--- Resultado ---");
        System.out.println("El puntaje total obtenido por el estudiante es: " + puntaje);
    }
}
