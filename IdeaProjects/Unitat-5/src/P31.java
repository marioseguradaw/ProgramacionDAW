import java.util.Scanner;

public class P31 {
    public static void main(String[] args) {

        int num;
        /*Scanner sc = new Scanner(System.in);
        int num,cont = 2;

        System.out.print("Introduce un número: ");
        num = sc.nextInt();*/
        num = getNumero();

        while ((num%cont)!=0){
            cont++;
        }
        if (cont==num){
            System.out.println("El número "+num+" es primo.");
        }else {
            System.out.println("El número "+num+" no es primo.");
        }
    }

    private static Object getNumero() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Número: ")
    }
}
