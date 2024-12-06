import java.util.Scanner;

public class P31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num,cont = 2;

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        while ((num%cont)!=0){
            cont++;
        }
        if (cont==num){
            System.out.println("El número "+num+" es primo.");
        }else {
            System.out.println("El número "+num+" no es primo.");
        }
    }
}
