/*Haz un programa que lea un carácter por la entrada estándar y me diga si es una
vocal o no.*/

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        P5 programa = new P5();
        programa.inicio();
    }

    private void inicio() {
        char caracter;
        String resultado="";

        caracter = getCaracter();
        resultado = isVocal(caracter);
        imprimirPantalla(resultado);

    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private String isVocal(char caracter) {
        String resultado;

        if ((caracter=='a') || (caracter=='e') || (caracter=='i') ||
                (caracter=='o') ||(caracter=='u')){
            resultado = "El carácter introducido "+caracter+" es vocal.\n";
        }else {
            resultado = "El carácter introducido "+caracter+" no es vocal.\n";
        }
        return resultado;
    }

    private char getCaracter() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Introduce un carácter cualquiera: ");
        return sc.next().charAt(0);

    }
}
