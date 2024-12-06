import java.util.Scanner;

public class Ejemplo1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.print("Introduzca una hora cualquiera: ");
        hora = sc.nextInt();

        if ((hora>=7) && (hora<=11)){
            System.out.println("¡Buenos días!");
        } else if ((hora>=12) && (hora<=19)) {
            System.out.println("¡Buenas tardes!");
        } else if ((hora>=20) || (hora<=6)) {
            System.out.println("¡Buenas noches!");
        }else {
            System.out.println("Hora no válida.");
        }
    }
}
