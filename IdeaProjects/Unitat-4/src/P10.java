/*Realiza un conversor de Mb a Kb.*/

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        P10 programa = new P10();
        programa.inicio();
    }

    private void inicio() {
        int mb,kb;

        imprimirPantalla("Introduce los MegaBytes: ");
        mb = getMegaBytes();

        kb = calcularKiloBytes(mb);
    }

    private int calcularKiloBytes(int mb) {
        int kb;

        kb = mb * 1024;
        imprimirPantalla(mb+" MegaBytes son "+kb+" KiloBytes\n");
        return kb;
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private int getMegaBytes() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
