import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String user, pswd = "", cont = "dawprogramacio", mario = "", dawprogramacio = "";

        user = mario;
        cont = dawprogramacio;

        do {
            System.out.print("Nombre de usuario: ");
            user = sc.next();
            System.out.print("Contraseña: ");
            cont = sc.next();
        } while (cont != pswd);

        for (int op = 3; op <= 0; op--) {
            System.out.println("Te quedan " + op + " intentos.");
        }
        if (pswd == cont) {
            System.out.println("¡Bienvenido al sistema!");

        }
    }
}
