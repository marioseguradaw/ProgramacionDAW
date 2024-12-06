import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num,positivos=0,negativos=0;
        System.out.print("Introduce números enteros (0 para terminar): ");

        while (true){
            num = sc.nextInt();
            if (num==0){
                break;
            }
            if (num>0){
                positivos++;
            }else {
                negativos++;
            }
        }
        System.out.println("Cantidad de números positivos: "+positivos);
        System.out.println("Cantidad de números negativos: "+negativos);
    }
}
