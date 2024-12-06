import java.util.Scanner;

public class ImprimirGráficosBarra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num=0,num1=0,num2=0,num3=0,num4=0,num5=0;
        boolean grafico=true;

        for (int i=1;i<=5;i++){
            while (grafico==true){
                System.out.print("Introduce el número "+i+": ");
                num = sc.nextInt();
                if ((num<1) || (num>30)){
                    System.out.println("Por favor, número entre 1 y 30.");
                }else {
                    grafico=false;
                }
            }
            grafico=true;

            switch (i){

                case 1:
                    num1=num;
                    break;
                case 2:
                    num2=num;
                    break;
                case 3:
                    num3=num;
                    break;
                case 4:
                    num4=num;
                    break;
                case 5:
                    num5=num;
                    break;
                default:
                    break;
            }
        }
        System.out.println("\n");
        for (int i=0;i<=num1;i++){
            System.out.print("*");
        }
        System.out.println("\n");
        for (int i=0;i<=num2;i++){
            System.out.print("*");
        }
        System.out.println("\n");
        for (int i=0;i<=num3;i++){
            System.out.print("*");
        }
        System.out.println("\n");
        for (int i=0;i<=num4;i++){
            System.out.print("*");
        }
        System.out.println("\n");
        for (int i=0;i<=num5;i++){
            System.out.print("*");
        }
    }
}