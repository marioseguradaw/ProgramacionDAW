import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        P1 programa = new P1();
        programa.inicio();
    }

    private void inicio() {
        int num, num2;
        num = getNumero();
        num2 = getNumero();
        if(isIgual(num,num2)) {
            imprimirPantalla("Los dos números son iguales.\n");
        }else {
            imprimirPantalla("Los dos números no son iguales.\n");
        }
    }

    private boolean isIgual(int num, int num2) {
        return num==num2;
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
