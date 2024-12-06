import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Introduce un valor cualquiera: ");
            valor = sc.nextInt();
        }while (valor<=0);

        for (int i=1;i<=valor;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
