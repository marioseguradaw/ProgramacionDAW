/*Realiza un conversor de Kb a Mb*/

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        P11 programa = new P11();
        programa.inicio();
    }

    private void inicio() {
        double mb;
        int kb;

        imprimirPantalla("Introduce los KiloBytes: ");
        kb = getKiloBytes();

        mb = calcularMegaBytes(kb);
        System.out.printf("%1d KiloBytes son %2.3f MegaBytes",kb,mb);
    }

    private double calcularMegaBytes(int kb) {
        double mb=0;

        mb = (double)kb/1024;

        return mb;
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private int getKiloBytes() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
