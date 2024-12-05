import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion,impTurismo,impAutobus,impMoto;

        System.out.println("1.- Turismo");
        System.out.println("2.- Autobús");
        System.out.println("3.- Motocicleta");
        System.out.print("Elija una opción [1-3]: ");

        opcion = sc.nextInt();

        impTurismo = 500;
        impAutobus = 3000;
        impMoto = 300;

        switch (opcion) {
            case 1:
                System.out.println("El impuesto será de " + impTurismo + " €. ");
                break;
            case 2:
                System.out.println("El impuesto será de " + impAutobus + " €. ");
                break;
            case 3:
                System.out.println("El impuesto será de " + impMoto + " €. ");
            default:
                System.out.println("Opción no válida.");
        }
    }
}
