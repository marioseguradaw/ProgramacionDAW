import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        boolean repDiv;

        System.out.println("CÁLCULO DE LOS DIVISORES DE UN NÚMERO");

        //Lectura de las variables a través del bucle "do"
        do {
            System.out.print("Introduce un número entero: ");
            num = sc.nextInt();
        } while (num <= 0);

        //Cálculo de los divisores del número introducido por teclado
        System.out.print("Los divisores del número "+num+" son: ");
        for (int i=1;i<=num;i++) {
            if ((num%i)==0) {
                System.out.print(i+" ");
            } else if (num <= 0) {
                System.out.println("Escribe un número entero positivo, por favor.");
            }
        }
        //Comprobación de si desea volver a calcular los divisores
        System.out.println("\n¿Quieres volver a calcular los divisores de un número (s/n)?");
        repDiv = sc.nextBoolean();

        if (true){
            System.out.println("CÁLCULO DE LOS DIVISORES DE UN NÚMERO");
        }else {
            System.out.println("PROGRAMA FINALIZADO POR EL USUARIO");
        }
    }
}
