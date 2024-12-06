import java.util.Scanner;

/*Realizar un programa que lea 3 números y nos diga cuál es el mayor*/
public class P3 {
    public static void main(String[] args) {
        P3 programa = new P3();
        programa.inicio();
    }

    private void inicio() {
        int num1,num2,num3;
        String resultado;

        num1 = getNumeros();
        num2 = getNumeros();
        num3 = getNumeros();
        resultado = comprobarNumeros(num1,num2,num3);
        imprimirPantalla(resultado);

    }

    private String comprobarNumeros(int num1, int num2, int num3) {
        String resultado;

        if ((num1>=num2) && (num1>num3)){
            resultado = "El número "+num1+" es el mayor.\n";
        } else if ((num1<=num2) && (num1<num3)) {
            resultado = "El número "+num1+" es el menor.\n";
        }else {
            resultado = "Los números " + num1 + ", " + num2 + " y " + num3 + " son iguales.\n";
        }
        return resultado;
    }

    private int getNumeros() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Introduce un número: ");
        return sc.nextInt();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
