import java.util.Scanner;

public class Ejemplo1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        if((num%2)==0){
            System.out.println("El número "+num+" es par.");
        }else {
            System.out.println("El número "+num+" es impar.");
        }
    }
}
