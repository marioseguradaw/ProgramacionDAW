/*Realiza un programa que lea el tipo de un vehículo del 1 al 3 (1: Turismo →
impuesto = 500 €, 2: Autobús→ impuesto = 3000 €; 3: Motocicleta → impuesto =
300 €) y que visualice el tipo de vehículo que es y el impuesto que tiene que
pagar en el ayuntamiento*/

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        P10 programa = new P10();
        programa.inicio();
    }

    private void inicio() {
        int opcion=0,menu;

        imprimirPantalla("1.- Turismo\n2.- Autobús\n3.- Motocicleta\n");
        menu = getMenu(opcion);

        imprimirPantalla("Elija una opción [1-3]: ");
        opcion = getOpcion();
        obtenerImpuesto(opcion);
    }

    private void obtenerImpuesto(int opcion) {
        if (opcion==1){
            imprimirPantalla("El impuesto a pagar será de 500€.\n");
        } else if (opcion==2) {
            imprimirPantalla("El impuesto a pagar será de 3000€.\n");
        } else if (opcion==3) {
            imprimirPantalla("El impuesto a pagar será de 300€.\n");
        }else {
            imprimirPantalla("Opción no existente. Por favor, escoja una del 1 al 3.\n");
        }
    }

    private int getMenu(int opcion) {
        return opcion;
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private int getOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
