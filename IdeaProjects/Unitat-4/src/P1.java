/*Realiza un programa que pida dos números y muestre el resultado de su
multiplicación.*/

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        P1 programa = new P1();
        programa.inicio();
    }

    private void inicio() {
        double num1,num2;

        imprimirPorPantalla("Introduce el primer número: ");
        num1 = getNumero();
        imprimirPorPantalla("Introduce el segundo número: ");
        num2 = getNumero();

        hacerMultiplicacion(num2,num1);
    }

    private void hacerMultiplicacion(double num2, double num1) {
        double mult;

        mult = num1*num2;
        imprimirPorPantalla("El resultado de la multiplicación es = "+mult);
    }

    private void imprimirPorPantalla(String cadena) {
        System.out.print(cadena);
    }

    private double getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
