import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num;

        System.out.print("Introduce un número: ");
        num = sc.nextDouble();

        if (num<0){
            System.out.println("El número introducido es negativo.");
        } else if (num>=0) {
            System.out.println("El número introducido es positivo.");
        }else{
            System.out.println("Signo no válido.");
        }
    }
}
