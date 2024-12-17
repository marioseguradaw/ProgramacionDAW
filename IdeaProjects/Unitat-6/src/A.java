import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        A programa = new A();
        programa.inicio();
    }

    private void inicio() {
        int fila,columna;

        fila = getDimension("Fila: ");
        columna = getDimension("Columna: ");

        int [][] v = crearArrayBidimensional(fila,columna);
        imprimirArray(v);

        rellenarArray(v);
        imprimirArray(v);

        imprimirArrayAlReves(v);
    }

    private void imprimirArrayAlReves(int[][] v) {

    }

    private void rellenarArray(int[][] v) {
        for (int i=0;i<v.length;i++){
            for (int j=0;j<v[i].length;j++){
                imprimirPantalla("v["+(i+1)+"]["+(j+1)+"] = ");
                v[i][j] = getNumero();
            }
        }
    }

    private void imprimirArray(int[][] v) {
        for (int i=0;i<v.length;i++){//Recorremos las filas.
            for (int j=0;j<v[i].length;j++){//Recorremos las columnas.
                imprimirPantalla(v[i][j]+" ");
            }
            imprimirPantalla("\n");
        }
    }

    private int[][] crearArrayBidimensional(int fila, int columna) {
        return new int[fila][columna];
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private int getDimension(String s) {
        int num;
        do {
            imprimirPantalla(s);
            num = getNumero();
        }while (num<=0);
        return num;
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
