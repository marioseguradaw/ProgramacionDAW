/*Realiza un programa que pida un número por teclado e indique si es positivo o
negativo. El número cero lo consideraremos positivo.*/
import java.util.Scanner;
public class P15Modular {
    public static void main(String[] args) {
        P15Modular programa = new P15Modular();
        programa.inicio();
    }

    private void inicio() {
        int num;

        num = getNumero();
        if(isPositivo(num)){
            imprimirPantalla("El número "+num+" es positivo.\n");
        }else {
            imprimirPantalla("El número "+num+" es negativo.\n");
        }
    }

    private boolean isPositivo(int num) {

        return num>=0;
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Introduce un número: ");
        return sc.nextInt();

    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
