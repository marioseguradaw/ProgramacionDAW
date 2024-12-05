import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 programa = new Ejercicio2();
        programa.inicio();
    }

    private void inicio() {
        int longitud = getCantidad();
        int numeros[] = crearArray(longitud);
        asignarValoresArray(numeros);
    }

    private void asignarValoresArray(int[] numeros) {
        for (int i=0;i<numeros.length;i++){
            imprimirPantalla("V["+(i+1)+"] = ");
            numeros[i] = getNumero();
        }
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private int[] crearArray(int longitud) {
        return new int[longitud];
    }

    private int getCantidad() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            imprimirPantalla("Cantidad a leer: ");
            num = sc.nextInt();
        }while (num<=0);
        return num;
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
