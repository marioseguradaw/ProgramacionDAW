import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1,num2;

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        if(num1==num2){
            System.out.println("Los dos números son iguales.");
        }else{
            System.out.println("Los dos números NO son iguales.");
        }
    }
}
