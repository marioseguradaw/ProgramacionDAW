/*Haz un programa que lea desde el teclado dos número enteros n1 y n2, con
n1<n2, y escriba los números enteros pares que hay dentro del intervalo [n1, n2]
en orden decreciente.*/

import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        P22 programa = new P22();
        programa.inicio();
    }

    private void inicio() {
        int num1,num2;

        do {
            imprimirPantalla("Introduce el primer número: ");
            num1 = getNumero();
            imprimirPantalla("Introduce el segundo número: ");
            num2 = getNumero();

            if (num1>=num2){
                imprimirPantalla("Error. --> num1<num2.\n");
            }
        }while (num1>=num2);

        crearIntervalo(num1,num2);
    }

    private void crearIntervalo(int num1, int num2) {
        int i;

        imprimirPantalla("Los números pares en orden decreciente son: ");
        for (i = num2; i >= num1; i--) {
            if (isPar(i)) {
                imprimirPantalla(i + " ");
            }
        }
        imprimirPantalla("\n");
    }

    private boolean isPar(int num1) {
        int i=0;

        return ((num1%2)==0);
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
