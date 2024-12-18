/*Escribe un programa que calcule el área de un triángulo.*/

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        P6 programa = new P6();
        programa.inicio();
    }

    private void inicio() {
        double base,altura;

        imprimirPantalla("Introduce la base del triángulo: ");
        base = getBase();
        imprimirPantalla("Introduce la altura del triángulo: ");
        altura = getAltura();

        calcularAreaTriangulo(base,altura);
    }

    private void calcularAreaTriangulo(double base, double altura) {
        double areaTriangulo;

        areaTriangulo = (base * altura)/2;
        System.out.printf("El área del triángulo es = %5.3f %n",areaTriangulo);
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
