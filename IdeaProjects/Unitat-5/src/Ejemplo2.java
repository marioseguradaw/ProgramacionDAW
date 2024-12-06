import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double precTele,desTele,total,porcentaje;

        System.out.print("Introduzca el precio del televisor: ");
        precTele = sc.nextDouble();

        porcentaje = 30;
        desTele = (precTele*30)/100;
        total = precTele - desTele;

        if(precTele>999){
            System.out.println("El precio final del televisor con descuento es de "+total);
        }else{
            System.out.println("No se le aplicará ningún descuento y el precio final será de "+precTele);
        }
    }
}
