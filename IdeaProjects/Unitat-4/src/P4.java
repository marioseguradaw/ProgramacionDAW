/*Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado. Visualiza también el módulo entre el primer y el
segundo número introducido.*/

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        P4 programa = new P4();
        programa.inicio();
    }

    private void inicio() {
        String resultado;
        double num1,num2;

        imprimirPantalla("Introduce el primer número: ");
        num1 = getNumero();
        imprimirPantalla("Introduce el segundo número: ");
        num2 = getNumero();

        hacerSuma(num1,num2);
        hacerResta(num1,num2);
        hacerMultiplicacion(num1,num2);
        hacerDivision(num1,num2);
        hacerModulo(num1,num2);
    }

    private void hacerModulo(double num1, double num2) {
        double modulo;

        modulo = num1%num2;
        imprimirPantalla("El módulo entre el "+num1+" y el "+num2+" es = "+modulo+"\n");
    }

    private void hacerDivision(double num1, double num2) {
        double division;

        division = num1/num2;
        System.out.printf("El resultado de la división es = %5.3f %n",division);

    }

    private void hacerMultiplicacion(double num1, double num2) {
        double mult;

        mult = num1 * num2;
        imprimirPantalla("El resultado de la multiplicación es = "+mult+"\n");
    }

    private void hacerResta(double num1, double num2) {
        double resta;

        resta = num1 - num2;
        imprimirPantalla("El resultado de la resta es = "+resta+"\n");
    }

    private void hacerSuma(double num1, double num2) {
        double suma;

        suma = num1 + num2;
        imprimirPantalla("El resultado de la suma es = "+suma+"\n");
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private double getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
