import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1,num2;

        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();

        if((num1>0) && (num2>0) || (num1<0) && (num2<0)){
            System.out.println("El signo del producto será positivo."+" +");
        } else if ((num1<0) && (num2>0) || (num1>0) && (num2<0)) {
            System.out.println("El signo del producto será negativo."+" -");
        }else{
            System.out.println("Signo no válido.");
        }
    }
}
