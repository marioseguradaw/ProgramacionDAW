import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double precProd,total1,total2,precDes,desProd1,desProd2,precioMax = 0;

        System.out.print("Introduce el precio del producto: ");
        precProd = sc.nextDouble();

        precioMax = 500;

        if(precioMax>500){
            desProd1 = 10;
            System.out.println("Se le aplicará un descuento del "+desProd1);
            precDes = (precProd*100)/desProd1;
            total1 = precProd + precDes;
            System.out.println("El precio final del producto sera de: "+total1);
        } else if (precioMax<500) {
            desProd2 = 5;
            System.out.println("Se le aplicará un descuento del "+desProd2);
            precDes = (precProd*100)/desProd2;
            total2 = precProd + precDes;
            System.out.println("El precio final del producto será de: "+total2 );
        }else{
            System.out.println("No se le aplicará ningún descuento.");
        }
    }
}
