/*Escribe un programa que calcule el volumen de un cono según la fórmula
1
 2
V = ⋅Π⋅r ⋅h*/

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        P9 programa = new P9();
        programa.inicio();
    }

    private void inicio() {
        double pi,radio,altura,volumenCono;

        pi = getPI();
        imprimirPantalla("Radio: ");
        radio = getRadio();
        imprimirPantalla("Altura: ");
        altura = getAltura();

        volumenCono = getVolumenCono(pi,radio,altura);
    }

    private double getVolumenCono(double pi, double radio, double altura) {
        double volumenCono;

        volumenCono = (1*pi*(radio*radio)*altura)/3;
        System.out.printf("El volumen del cono es = %5.3f %n",volumenCono);
        return volumenCono;
    }

    private double getAltura() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private double getRadio() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private double getPI() {
        double pi;

        pi = 3.14;
        return pi;
    }
}
