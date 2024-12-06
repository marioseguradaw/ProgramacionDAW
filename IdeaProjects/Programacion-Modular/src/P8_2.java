import java.util.Scanner;

public class P8_2 {
    public static void main(String[] args) {
        P8_2 programa = new P8_2();
        programa.inicio();
    }

    private void inicio() {
        int num1,num2;

        num1 = getNumeroEntero();
        num2 = getNumeroEntero();

        if (isPositivo(num1,num2)){
            imprimirPorPantalla("El signo del producto será positivo "+" +\n");
        }else {
            imprimirPorPantalla("El signo del producto será negativo "+" -\n");
        }
    }

    private boolean isPositivo(int num1, int num2) {
        return ((num1>0) && (num2>0) || (num1<0) && (num2<0));
    }

    private int getNumeroEntero() {
        Scanner sc = new Scanner(System.in);

        imprimirPorPantalla("Introduce un número entero: ");
        return sc.nextInt();
    }

    private void imprimirPorPantalla(String cadena) {
        System.out.print(cadena);
    }
}
