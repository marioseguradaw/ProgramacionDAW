import java.util.Scanner;

/*Realizar un programa que lea dos números y nos diga si son o no iguales.*/
public class P1Modular {
    public static void main(String[] args) {
        
        P1Modular programa = new P1Modular();
        programa.inicio();
    }

    private void inicio() {
        int num1=0,num2=0;
        String resultado="";

         num1 = getNumero();
         num2 = getNumero();
         resultado = comprobarNumero(num1,num2);
        imprimirPantalla(resultado);
    }

    private String comprobarNumero(int num1, int num2) {
        String resultado;
        if (num1==num2){
            resultado = "Los dos números son iguales.\n";
        }else {
            resultado = ("Los dos números NO son iguales.\n");
        }
        return resultado;
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private int getNumero() {
        int num1,num2;
        String resultado="";
        Scanner sc = new Scanner(System.in);

        imprimirPantalla("Introduce un número: ");
        return (sc.nextInt());
    }
}
