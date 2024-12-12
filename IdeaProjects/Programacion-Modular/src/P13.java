/*Haz un programa que dado un número mayor que 1, imprima por pantalla todos
los múltiplos de 3 desde 1 hasta ese número dado. Al mismo tiempo, tendrá que
indicar si ese número es par o impar.*/

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        P13 programa = new P13();
        programa.inicio();
    }

    private void inicio() {
        int num;

        do {
            imprimirPantalla("Introduce un número mayor que 1: ");
            num = getNumero();
        } while (num<=1);

        isMultiploDeTres(num);
    }

    private void isMultiploDeTres(int num) {
        for (int i=1;i<=num;i++){
            if ((i%3)==0){
                System.out.print(i+"\n");
                if (isPar(i)){
                    imprimirPantalla("-> PAR.\n");
                }else {
                    imprimirPantalla("-> IMPAR.\n");
                }
            }
        }
    }

    private boolean isPar(int i) {
        return ((i%2==0));
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
