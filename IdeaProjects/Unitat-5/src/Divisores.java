import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num,divisor=1;

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        for (int cont=1;cont<=(num/2+1);cont++){
            if ((num%cont)==0){
                System.out.println(cont);
            }
        }
        System.out.println(num);
    }
}
