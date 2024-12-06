import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y;

        System.out.print("Introduce el valor de x: ");
        x = sc.nextInt();
        System.out.print("Introduzca el valor de y: ");
        y = sc.nextInt();
        System.out.println("Las coordenadas son: "+x+","+y);

        if((x>0) && (y>0)){
            System.out.println("Las coordenadas pertenecen al 1er cuadrante.");
        } else if ((x<0) && (y>0)) {
            System.out.println("Las coordenadas pertenecen al 2do cuadrante.");
        } else if ((x<0) && (y<0)) {
            System.out.println("Las coordenadas pertenecen al 3er cuadrante.");
        } else if ((x>0) && (y<0)) {
            System.out.println("Las coordenadas pertenecen al 4to cuadrante.");
        }else{
            System.out.println("Cuadrante no válido.");
        }
    }
}
