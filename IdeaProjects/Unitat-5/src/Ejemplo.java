import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nMes;

        System.out.print("Introduce el número del mes: ");
        nMes = sc.nextInt();

        switch (nMes){
            case 1:
                System.out.println("Enero.");
                break;
            case 2:
                System.out.println("Febrero.");
                break;
            case 3:
                System.out.println("Marzo.");
                break;
            case 4:
                System.out.println("Abril.");
                break;
            case 5:
                System.out.println("Mayo.");
                break;
            case 6:
                System.out.println("Junio.");
                break;
            case 7:
                System.out.println("Julio.");
                break;
            case 8:
                System.out.println("Agosto.");
                break;
            case 9:
                System.out.println("Septiembre.");
                break;
            case 10:
                System.out.println("Octubre.");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre.");
                break;
            default:
                System.out.println("Mes no válido.");

        /*if (nMes==1){
            System.out.println("Enero.");
        } else if (nMes==2) {
            System.out.println("Febrero.");
        } else if (nMes==3) {
            System.out.println("Marzo.");
        } else if (nMes==4) {
            System.out.println("Abril.");
        } else if (nMes==5) {
            System.out.println("Mayo.");
        } else if (nMes==6) {
            System.out.println("Junio.");
        } else if (nMes==7) {
            System.out.println("Julio.");
        } else if (nMes==8) {
            System.out.println("Agosto.");
        } else if (nMes==9) {
            System.out.println("Septiembre.");
        } else if (nMes==10) {
            System.out.println("Octubre.");
        } else if (nMes==11) {
            System.out.println("Noviembre.");
        } else if (nMes==12) {
            System.out.println("Diciembre.");
        }else{
            System.out.println("Mes no válido.");
        */}
    }
}
