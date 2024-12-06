import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bVendidas;
        double precPan,desPan,total=0,porcentaje,precPanTotal;

        System.out.print("Número de barras no frescas vendidas: ");
        bVendidas = sc.nextInt();

        precPan = 3.49;
        precPanTotal = (precPan*bVendidas);
        porcentaje = 60;
        desPan = (precPan*porcentaje)/100;
        total = (precPan - desPan)*bVendidas;

        System.out.println("El precio habitual de una barra es de: "+precPan);
        System.out.printf("El precio del pan blando, con descuento es de: %4.2f%n",desPan);
        System.out.printf("Total a pagar: %4.2f%n",total);
    }
}
