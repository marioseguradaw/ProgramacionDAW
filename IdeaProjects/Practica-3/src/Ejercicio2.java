import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int durTramo=1,horas,suma=1;

        horas=suma+durTramo;

        do {
            System.out.print("Duración tramo: ");
            durTramo = sc.nextInt();
        }while (durTramo!=0);

        if (durTramo==0){
            System.out.println("Tiempo total de viaje: "+horas+" horas.");
        }
    }
}
