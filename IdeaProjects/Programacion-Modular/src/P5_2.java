/*Haz un programa que lea un carácter por la entrada estándar y me diga si es una
vocal o no.*/

import java.util.Scanner;

public class P5_2 {
    public static void main(String[] args) {
        P5_2 programa = new P5_2();
        programa.inicio();
    }

    private void inicio() {
        char caracter;

        caracter = getCaracter();
        if (isVocal(caracter)){
            imprimirPantalla("El carácter "+caracter+" es una vocal.\n");
        }else {
            imprimirPantalla("El carácter "+caracter+" no es una vocal.\n");
        }
    }

    private boolean isVocal(char caracter) {
        return caracter=='a' || caracter=='e' || caracter=='i' ||
                caracter=='o' || caracter=='u';
    }

    private char getCaracter() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Introduce un carácter cualquiera: ");
        return sc.next().charAt(0);
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
