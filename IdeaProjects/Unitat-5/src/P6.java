import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double precProd,total1,total2,precDes,precioMax = 0,€=0;
        int desProd1,desProd2;

        System.out.print("Introduce el precio del producto: ");
        precProd = sc.nextDouble();



        if(precioMax>500){
            precioMax = 500;
            System.out.println("Se le aplicará un descuento del 10%");
            precDes = (precProd*10)/100;
            total1 = precProd - precDes;
            System.out.println("El precio final del producto sera de: "+total1+"€");
        } else if (precioMax<500) {
            System.out.println("Se le aplicará un descuento del 5%");
            precDes = (precProd*5)/100;
            total2 = precProd - precDes;
            System.out.println("El precio final del producto será de: "+total2+"€");
        }else{
            System.out.println("No se le aplicará ningún descuento.");
        }
    }
}
