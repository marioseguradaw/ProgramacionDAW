import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1,num2;

        //Lectura de n1<n2.
        do {
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextInt();

            if (num1>=num2){
                System.out.println("Error -> num1<num2.");
            }
        }while (num1>=num2);

        //Imprimir [n1,n2] en orden Creciente.
        for (int cont = num1;cont<=num2;cont++){
            System.out.println(cont+" ");
        }
        //Imprimir [n1,n2] en orden Decreciente.
        for (int cont = num2;cont>=num1;cont--){
            System.out.println(cont+" ");
        }
    }
}
