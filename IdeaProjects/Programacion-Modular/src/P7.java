import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        P7 programa = new P7();
        programa.inicio();
    }

    private void inicio() {
        int x,y;
        String resultado;

        x = getCoordenadas();
        y = getCoordenadas();
        resultado = comprobarCuadrante(x,y);
        imprimirPantalla(resultado);
    }

    private String comprobarCuadrante(int x, int y) {
        String resultado;
        if ((x>0) && (y>0)){
            resultado = "Las coordenadas pertenecen al 1er cuadrante.\n";
        } else if ((x<0) && (y>0)) {
            resultado = "Las coordenadas pertenecen al 2ndo cuadrante.\n";
        } else if ((x<0) && (y<0)) {
            resultado = "Las coordenadas pertenecen al 3er cuadrante.\n";
        } else if ((x>0) && (y<0)) {
            resultado = "Las coordenadas pertenecen al 4to cuadrante.\n";
        }else {
            resultado = "Cuadrante no válido.\n";
        }
        return resultado;
    }

    private int getCoordenadas() {
        Scanner sc = new Scanner(System.in);
        imprimirPantalla("Introduce el valor de x e y: ");
        return sc.nextInt();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
