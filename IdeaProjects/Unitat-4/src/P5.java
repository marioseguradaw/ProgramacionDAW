/*Escribe un programa que calcule el área de un rectángulo.*/

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        P5 programa = new P5();
        programa.inicio();
    }

    private void inicio() {
        double base,altura;

        imprimirPantalla("Introduce la base del rectangulo: ");
        base = getBase();
        imprimirPantalla("Introduce la altura del rectángulo: ");
        altura = getAltura();

        getAreaRectangulo(base,altura);
    }

    private void getAreaRectangulo(double base, double altura) {
        double areaRectangulo;

        areaRectangulo = base * altura;
        imprimirPantalla("El area del rectángulo es = "+areaRectangulo+" m^2");
    }

    private double getAltura() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private double getBase() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
