/*Escribe un programa que calcule el total de una factura a partir d’un precio y un
IVA del 21%.*/

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        P7 programa = new P7();
        programa.inicio();
    }

    private void inicio() {
        double precioFactura,precioTotal=0;
        int iva;

        imprimirPorPantalla("Precio de la factura: ");
        precioFactura = getPrecioFactura();
        iva = getIva();

        precioTotal = getPrecioIVA(precioFactura,iva);
        imprimirPorPantalla("El precio total es: "+precioTotal+"€"+"\n");

    }

    private double getPrecioIVA(double precioFactura, int iva) {

         return precioFactura + (iva*precioFactura)/100;
    }

    private int getIva() {
        int iva;

        iva = 21;
        imprimirPorPantalla("IVA: "+iva+"%"+"\n");
        return iva;
    }

    private void imprimirPorPantalla(String cadena) {
        System.out.print(cadena);
    }

    private double getPrecioFactura() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
