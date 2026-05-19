import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[][] mascotas = new String[4][4];

        System.out.println(" Registro de Mascotas ");
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese el nombre de la mascota [" + f + "][" + c + "]:");
                mascotas[f][c] = entrada.next();
            }
        }

        System.out.println("\n Mascotas en índices impares ");

        for (int f = 0; f < 4; f++) {
            if (f % 2 != 0) {
                for (int c = 0; c < 4; c++) {
                    if (c % 2 != 0) {
                        System.out.print(mascotas[f][c] + "\t");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
