import java.util.Scanner;

public class Ejemplo2_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nMes;

        System.out.print("Introduce el número del mes: ");
        nMes = sc.nextInt();

        if ((nMes==1) || (nMes==3) || (nMes==5) || (nMes==7) ||
                (nMes==8) || (nMes==10) || (nMes==12)){
            System.out.println("El mes "+nMes+" tiene 31 días.");
        } else if ((nMes==4) || (nMes==6) || (nMes==9) || (nMes==11)) {
            System.out.println("El mes "+nMes+" tiene 30 días.");
        } else if (nMes==2) {
            System.out.println("El mes "+nMes+" tiene 28 días.");
        }else {
            System.out.println("Mes no válido.2");
        }
    }
}
