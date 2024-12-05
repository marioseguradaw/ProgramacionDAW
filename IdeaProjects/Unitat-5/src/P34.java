import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = 3;
        boolean fin = false;
        String user,cont,userCorrecto = "tremino",contCorrecta="123";


        do {


            System.out.print("Nombre de usuario: ");
            user = sc.next();
            System.out.print("Contraseña: ");
            cont = sc.next();

            if (cont.equals(contCorrecta) && user.equals(userCorrecto)){
                System.out.println("Bienvenido.");
                fin = true;
            }else{
                op--;
                if(op==0){
                    System.out.println("Superado");
                    fin = true;
                }
            }

        }while(!fin);





    }
}
