import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            if(num<=1){
                System.out.println("Introduce un número mayor que 1.");
            }
        }while(num<=1);

        for (int cont=1;cont<=num;cont++){
            if ((cont%3)==0){
                System.out.print(cont);
                if ((cont%2)==0){
                    System.out.println("-> PAR.");
                }else{
                    System.out.println("-> IMPAR.");
                }
            }
        }
    }
}
