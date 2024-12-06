/*Haz un programa que dados dos números enteros, nos diga el signo que tendrá
el producto. No hay que calcular el resultado, tan solo hay que decir el signo.*/

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        P8 programa = new P8();
        programa.inicio();
    }

    private void inicio() {
        int num1,num2;
        String resultado;

        num1= getNumeroEntero();
        num2 = getNumeroEntero();
        resultado = getSignoProducto(num1,num2);
        imprimirPantalla(resultado);
    }

    private String getSignoProducto(int num1, int num2) {
        String resultado="";

        if ((num1>0) && (num2>0) || (num1<0) && (num2<0)){
            resultado = "El signo del producto será positivo "+" +\n";
        }else {
            resultado = "El signo del producto será negativo "+" -\n";
        }
        return resultado;
    }

    private int getNumeroEntero() {
        Scanner sc = new Scanner(System.in);

        imprimirPantalla("Introduce un número entero: ");
        return sc.nextInt();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
