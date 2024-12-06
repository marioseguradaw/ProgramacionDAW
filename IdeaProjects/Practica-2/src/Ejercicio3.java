import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int eChico,eChica;

        System.out.print("Introduce la edad del chico: ");
        eChico = sc.nextInt();
        System.out.print("Introduce la edad de la chica: ");
        eChica = sc.nextInt();

        if((eChica>=18) && (eChico>=18)){
            System.out.println("Podéis venir a la hora que queráis.");
        } else if ((eChica>=18) && (eChico<18)) {
            System.out.println("Tendréis que volver antes de las 2 am.");
        } else if ((eChico>=18) && (eChica<18)) {
            System.out.println("Tendréis que volver a las 12 am.");
        } else if ((eChica<18) && (eChico<18)) {
            System.out.println("No podréis salir.");
        }
    }
}
