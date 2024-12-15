/*Realiza un programa que nos diga si un número es primo o no.*/

import java.util.Scanner;

public class P31 {
    public static void main(String[] args) {
        P31 programa = new P31();
        programa.inicio();
    }

    private void inicio() {
        int num;

        imprimirPorPantalla("Introduce un número cualquiera: ");
        num = getNumero();

        if (isPrimo(num)){
            imprimirPorPantalla("El número "+num+" es primo.\n");
        }else {
            imprimirPorPantalla("El número "+num+" no es primo.\n");
        }
    }

    private boolean isPrimo(int num) {
        return ((num%2)!=0);
    }

    private void imprimirPorPantalla(String cadena) {
        System.out.print(cadena);
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
