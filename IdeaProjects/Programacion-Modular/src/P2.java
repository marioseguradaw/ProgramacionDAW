import java.util.Scanner;

/*Calcula el mayor de dos números introducidos por teclado. Si son iguales lo
tendrá que indicar.*/
public class P2 {
    public static void main(String[] args) {
        P2 programa = new P2();
        programa.inicio();

    }

    private void inicio() {
        int num1,num2;
        String resultado;

        num1 = getNumero();
        num2 = getNumero();
        resultado = comprobarNumero(num1,num2);
        imprimirPantalla(resultado);
    }

    private String comprobarNumero(int num1, int num2) {
        String resultado;
        if (num1>num2){
            resultado = "El número "+num1+" es el mayor.\n";
        } else if (num1<num2) {
            resultado = "El número "+num1+" es el menor.\n";
        }else {
            resultado = "Los números "+num1+" y "+num2+" son iguales.\n";
        }
        return resultado;
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