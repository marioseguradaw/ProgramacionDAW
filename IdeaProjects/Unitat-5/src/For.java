import java.util.Scanner;

public class For {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int inicio,fin;

       do{
           System.out.print("Inicio: ");
           inicio = sc.nextInt();
           System.out.print("Final: ");
           fin = sc.nextInt();
       }while(inicio>fin);

       for(int cont=inicio;cont<=fin;cont++ ){
           System.out.println("TABLA: "+cont);
           System.out.println("==============");
           for (int cont1=1;cont1<=10;cont1++)
               System.out.println(cont+" X "+cont1+" = "+(cont*cont1));
       }
    }
}
