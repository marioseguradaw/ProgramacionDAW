import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num,i=2;
        String respuesta = "";

        do {
            System.out.println("NÚMERO PERFECTE");
            System.out.println("-------------------");

            System.out.print("Número: ");
            num = sc.nextInt();

        } while (num %2!= 0);
            if ((num%2) == 0) {
                System.out.println("El número " + num + " és perfecte");
            } else {
                System.out.println("El número " + num + " no és perfecte");
            }
        System.out.println("Vols continuar (s/n)? " + respuesta);
        respuesta = sc.next();
        }
    }

