/*Escribe un programa que introduzca 20 números enteros aleatorios múltiplos de
2 en un array de 4 filas por 5 columnas. El programa mostrará las sumas
parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
suma total debe aparecer en la esquina inferior derecha*/

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        P2 programa = new P2();
        programa.inicio();
    }

    private void inicio() {
        int[][] arrayBidimensional;

        arrayBidimensional = getLongitud(4,5);
        rellenarArray(arrayBidimensional);
        imprimirArray(arrayBidimensional);
    }

    private void imprimirArray(int[][] arrayBidimensional) {
        for (int i=0;i<arrayBidimensional.length;i++){
            for (int j=0;j<arrayBidimensional[i].length;j++){
                imprimirPorPantalla(arrayBidimensional[i][j]+" ");
            }
            imprimirPorPantalla("\n");
        }
    }

    private void imprimirPorPantalla(String cadena) {
        System.out.print(cadena);
    }

    private void rellenarArray(int[][] arrayBidimensional) {
        for (int i=0;i<arrayBidimensional.length;i++){
            for (int j=0;j<arrayBidimensional[i].length;j++){
                arrayBidimensional[i][j] = asignarNumeroAleatorio();
            }
        }
    }

    private int asignarNumeroAleatorio() {
        return (int)(Math.random()*(100));
    }

    private int[][] getLongitud(int fila, int columna) {
        return new int[fila][columna];

    }
}
