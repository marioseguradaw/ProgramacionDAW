/*Haz un programa que lea desde el teclado un número entero positivo mayor
que 1 y escriba el divisor positivo más grande diferente de él mismo y de 1. En
caso de no encontrar ninguno, hay que anunciar este hecho con un texto.*/

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        P19 programa = new P19();
        programa.inicio();
    }

    private void inicio() {
        int num;

        do {
            imprimirPantalla("Introduce un número mayor que 1: ");
            num = getNumero();

            if (num <= 1) {
                imprimirPantalla("Error. --> El número debe ser mayor que 1.\n");
            }
        } while (num <= 1);

        calcularDivisorPositivo(num);
    }

    private void calcularDivisorPositivo(int num) {
        // Busca el mayor divisor de num menor que num
        int mayorDivisor = -1;
        for (int i = num - 1; i > 1; i--) { // Comienza desde num-1 hacia 2
            if (num % i == 0) {
                mayorDivisor = i;
                break; // Encuentra el mayor y sale
            }
        }

        // Imprime el resultado o el mensaje correspondiente
        if (mayorDivisor != -1) {
            imprimirPantalla("El mayor divisor positivo distinto de 1 y " + num + " es: " + mayorDivisor + "\n");
        } else {
            imprimirPantalla("No se encontraron divisores distintos de 1 y " + num + ".\n");
        }
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
