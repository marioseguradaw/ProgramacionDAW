import java.util.Scanner;

/*Haz un programa que nos diga si dos números enteros son divisibles.*/
public class P4 {
    public static void main(String[] args) {
        P4 programa = new P4();
        programa.inicio();
    }

    private void inicio() {
        int num1,num2;
        String resultado;

        num1 = getNumeros();
        num2 = getNumeros();
        resultado = comprobarDivisibilidad(num1,num2);
        imprimirPantalla(resultado);

    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private String comprobarDivisibilidad(int num1, int num2) {
        String resultado;
        if ((num1%num2)==0){
            resultado = "El número "+num1+" y el "+num2+" son divisibles.\n";
        }else {
            resultado = "El número "+num1+" y el "+num2+" no son divisibles.\n";
        }
        return resultado;
    }

    private int getNumeros() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Introduce un número: ");
        return sc.nextInt();
    }
}
