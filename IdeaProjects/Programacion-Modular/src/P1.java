import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        P1 programa = new P1();
        programa.inicio();
    }

    private void inicio() {
        int num1,num2;
        num1 = getNumero();
        num2 = getNumero();
        isIgual(num1,num2);
        if (isIgual(num1,num2)){
            imprimirPantalla("Los dos números son iguales.\n");
        }else {
            imprimirPantalla("Los dos números no son iguales.\n");
        }
    }

    private boolean isIgual(int num1, int num2) {
        return num1==num2;
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
