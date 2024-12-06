/*Haz un programa que a partir del precio de un producto y un precio máximo,
visualice el precio total del producto con el descuento de un 10% si supera ese
precio máximo o un 5% de descuento en caso contrario. El precio del producto y
precio máximo tienen que ser precios correctos.*/

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        P6 programa = new P6();
        programa.inicio();
    }

    private void inicio() {
        double precio,precioTotal;
        String resultado;

        precio = getPrecioProducto();
        resultado = getPrecioTotal(precio);
        imprimirPantalla(resultado);
    }

    private String getPrecioTotal(double precio) {
        double descuentoProducto1,descuentoProducto2,precioTotal1=0,precioTotal2=0;
        String resultado="";

        if (precio>=500){
            resultado = "Se le ha aplicado un descuento del 10%.";
            descuentoProducto1 = (precio*10)/100;
            precioTotal1 = precio - descuentoProducto1;
            imprimirPantalla("El precio total será de "+precioTotal1+"€\n");

        }else {
            resultado = "Se le ha aplicado un descuento del 5%.";
            descuentoProducto2 = (precio*5)/100;
            precioTotal2 = precio - descuentoProducto2;
            imprimirPantalla("El precio total será de "+precioTotal2+"€\n");
        }
        return resultado;
    }

    private double getPrecioProducto() {
        Scanner sc = new Scanner(System.in);
        double precio;

        imprimirPantalla("Introduce el precio del producto: ");
        return sc.nextDouble();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
