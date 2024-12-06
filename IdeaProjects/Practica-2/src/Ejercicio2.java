import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double tempGrados,tempFar = 0;

        System.out.print("Introduce la temperatura en ºC: ");
        tempGrados = sc.nextDouble();

        tempFar = (tempGrados +32)-1.8;

        System.out.println("La temperatura en Farenheit es = "+tempFar+" ºF");

    }
}
