/*Haz un programa que lea desde el teclado dos valores enteros n1 y n2,
compruebe que n1 < n2 (y muestre un error si no es así), y finalmente escriba
todos los números enteros que hay dentro del intervalo [n1, n2] en orden
creciente y en orden decreciente.*/

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        P17 programa = new P17();
        programa.inicio();
    }

    private void inicio() {
        int num1,num2;

        do {
            imprimirPantalla("Introduce el número 1: ");
            num1 = getNumero();
            imprimirPantalla("Introduce el número 2: ");
            num2 = getNumero();

            if (num1>=num2){
                imprimirPantalla("Error. -> num1<num2.\n");
            }
        }while (num1>=num2);

        crearIntervaloCreciente(num1,num2);
        crearIntervaloDecreciente(num1,num2);
    }

    private int crearIntervaloDecreciente(int num1, int num2) {
        //Imprimir el intervalo en orden Decreciente.
        int i;

        for (i=num2;i>=num1;i--){
            imprimirPantalla(i+" "+" ");
        }
        return i;
    }

    private int crearIntervaloCreciente(int num1, int num2) {
        //Imprimir el intervalo en orden "Creciente".
        int i;

        for (i=num1;i<=num2;i++){
            imprimirPantalla(i+" "+" ");
        }
        return i;
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
