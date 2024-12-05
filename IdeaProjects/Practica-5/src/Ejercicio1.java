import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Ejercicio1 programa = new Ejercicio1();
        programa.inicio();
    }

    private void inicio() {
        int num,numInverso,calculoInverso;

        do {
            num = getNumeroEnteroPositivo();
        }while (isPositivo(num));

        numInverso = getNumeroInverso();
        calculoInverso = getCalculoInverso(numInverso);
    }

    private int getCalculoInverso(int numInverso) {
        int calculoInverso;
        calculoInverso = (numInverso *100)/2;
        return calculoInverso;
    }


    private int getNumeroInverso() {
        int numInverso=0,calculoNumInverso;
        imprimirPantalla("Inverso: \n");
        return numInverso;
    }

    private boolean isPositivo(int num) {
        return(num<=0);

    }

    private int getNumeroEnteroPositivo() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Introduce un número: ");
        return sc.nextInt();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
