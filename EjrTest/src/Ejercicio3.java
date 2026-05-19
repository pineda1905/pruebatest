import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int puntos;

        System.out.println(" Sistema de Lealtad de Clientes ");
        System.out.println("Ingrese la cantidad de puntos obtenidos por el cliente:");
        puntos = entrada.nextInt();

        System.out.println("\n Resultado ");
        if (puntos < 1000) {
            System.out.println("El cliente tiene categoría: BRONCE");
        } else if (puntos >= 1000 && puntos <= 3000) {
            System.out.println("El cliente tiene categoría: PLATA");
        } else {
            System.out.println("El cliente tiene categoría: ORO");
        }
    }
}



