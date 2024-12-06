import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer el valor desde el teclado
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        int suma = 0;
        int i = 0;

        // Calcular la secuencia hasta que la suma se aproxime sin pasar el valor
        while (suma + i < num) {
            suma += i;
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\nSuma de los números: " + suma);
    }
}