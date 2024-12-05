import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valores, contPositivos = 1, contNegativos = 1,i;

        do {
            System.out.println("Ingrese varios valores, termine con cero: ");
            valores = sc.nextInt();
        } while (valores != 0);

        for (i = 1; valores > i; i++) {
            contPositivos++;
        }
        for (i = 1; valores < i; i++) {
            contNegativos++;
        }
        if (valores<0){
            contNegativos += i;
            for (i=1;i<contNegativos;i++){
                System.out.print("Negativos: \n");
                System.out.print(contNegativos+"*");
            }
        }
        if (valores>0){
            contPositivos += i;
            for (i=1;contPositivos<i;i++){
                System.out.print("Positivos: \n");
                System.out.print(contPositivos+"*");
            }
        }
    }
}
