/*Haz un programa que lea desde el teclado dos números enteros positivos n1 y
n2, con n1 < n2, y escriba, empezando desde n1, todos los números enteros
que son múltiples de n1 más pequeños o iguales que n2, en orden creciente y
en orden decreciente.*/

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        P18 programa = new P18();
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

        calcularMultiplosOrdenCreciente(num1,num2);
        calcularMultiplosOrdenDecreciente(num1,num2);
    }

    private void calcularMultiplosOrdenDecreciente(int num1, int num2) {
        //Imprimir los múltiplos en orden Decreciente.

        for (int i=num2;i>=num1;i--){
            if ((i%num1)==0){
                imprimirPantalla(i+" "+" ");
            }
        }
    }

    private void calcularMultiplosOrdenCreciente(int num1, int num2) {
        //Imprimir los múltiplos en orden Creciente

        for (int i=num1;i<=num2;i++){
            if ((i%num1)==0){
                imprimirPantalla(i+" "+" ");
            }
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
