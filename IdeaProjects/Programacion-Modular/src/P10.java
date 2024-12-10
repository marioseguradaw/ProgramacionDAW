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
        int impTurismo=0,impAutobus=0,impMoto=0,opcion;
        String resultado="",aux,impFinal;

        opcion = getOpcion();
        opcion = codificarOpcion(impMoto,impTurismo,impAutobus);
        aux = rellenarOpcion(opcion);
        impFinal = getImpuesto(impMoto,impTurismo,impAutobus);

        imprimirPantalla(resultado);
    }

    private String getImpuesto(int impMoto, int impTurismo, int impAutobus) {
        int opcion=0;
        String impFinal;

        impMoto = 300;
        impAutobus = 3000;
        impTurismo = 500;

        if (opcion==1){
            impFinal = "Deberá pagar un impuesto de "+impTurismo+"€\n";
        } else if (opcion==2) {
            impFinal = "Deberá pagar un impuesto de "+impAutobus+"€\n";
        }else {
            impFinal = "Deberá pagar un impuesto de "+impMoto+"€\n";
        }
        return impFinal;
    }

    private String rellenarOpcion(int opcion) {
        Scanner sc = new Scanner(System.in);

        imprimirPantalla("1.- Turismo\n");
        imprimirPantalla("2.- Autobús\n");
        imprimirPantalla("3.- Motocicleta\n");
        return sc.next();
    }

    private int getOpcion() {
        Scanner sc = new Scanner(System.in);

        imprimirPantalla("Eliga una opción [1-3]: ");
        return sc.nextInt();
    }

    private int codificarOpcion(int impMoto, int impTurismo, int impAutobus) {
        int opcion=0;
        String resultado="";

        switch (opcion){
            case 1: resultado = "1: Turismo\n";
                break;
            case 2: resultado = "2: Autobús\n";
                break;
            default: resultado = "3: Motocicleta\n";
        }
        return opcion;
    }


    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
