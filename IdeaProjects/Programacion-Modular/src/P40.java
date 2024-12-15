/*Escribe un programa que, dado un número entero, diga cuáles son y cuánto
suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
número largos.*/

import java.util.Scanner;

public class P40 {
    public static void main(String[] args) {
        P40 programa = new P40();
        programa.inicio();
    }

    private void inicio() {
        long num;

        do {
            imprimirPorPantalla("Por favor, introduzca un numero entero positivo: ");
            num = getNumero();
            if (num<=0){
                imprimirPorPantalla("Error. Debe ser num>0.\n");
            }
        }while (num<=0);

        obtenerDigitosPares(num);
    }

    private void obtenerDigitosPares(long num) {
        int contPares=0;

        if (isPar(num)) {
            contPares++;
            imprimirPorPantalla("Dígitos pares: ");
        }else {
            contPares--;
        }
    }

    private boolean isPar(long num) {
        return ((num%2)==0);
    }

    private void imprimirPorPantalla(String cadena) {
        System.out.print(cadena);
    }

    private long getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }
}
