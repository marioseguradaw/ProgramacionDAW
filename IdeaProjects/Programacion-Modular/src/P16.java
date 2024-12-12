/* Realiza un programa que lea números por teclado y deje de leerlos cuando se
introduzca un 0. El programa tendrá que mostrar la cantidad de números
positivos y negativos introducidos por el usuario. */

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        P16 programa = new P16();
        programa.inicio();
    }

    private void inicio() {
        Scanner sc = new Scanner(System.in);
        int num;
        int contPositivos = 0;
        int contNegativos = 0;

        do {
            imprimirPorPantalla("Introduce un número (0 para salir): ");
            num = sc.nextInt();

            if (num > 0) {
                contPositivos++;
            } else if (num < 0) {
                contNegativos++;
            }

        } while (num != 0);

        imprimirPorPantalla("Cantidad de números positivos: " + contPositivos+"\n");
        imprimirPorPantalla("Cantidad de números negativos: " + contNegativos+"\n");
    }

    private void imprimirPorPantalla(String s) {
        System.out.print(s);
    }
}
