import java.util.Arrays;

public class P {
    public static void main(String[] args) {
        P programa = new P();
        programa.inicio();

    }

    private void inicio() {
        char[] n2;
        char[] n1 = crearArray(10);

        rellenarArray(n1);
        imprimirArray(n1);
        n2 = copiarOf(n1,6);
        imprimirPantalla("\n");
        imprimirPantalla(Arrays.toString(n2));

    }

    private char[] copiarOf(char[] original, int longitud) {
        char [] h = crearArray(longitud);
        if (original.length==h.length){
            for (int i=0;i<=original.length;i++){
                h[i] = original[i];
            }
        } else if (original.length>h.length) {
            for (int i=0;i<h.length;i++){
                h[i] = original[i];
            }
        }else {
            for (int i=0;i<original.length;){
                h[i] = original[i];
            }
            for (int i=original.length;i<h.length;i++){
                h[i]=169;
            }
        }
        return h;
    }

    private void imprimirArray(char[] n) {
        for (int i=0;i<n.length;i++){
            imprimirPantalla(n[i]+" ");
        }
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private void rellenarArray(char[] n) {
        for (int i=0;i<n.length;i++){
            n[i] = getCaracterAleatorio('a','z');
        }
    }

    private char getCaracterAleatorio(char min, char max) {
        return (char)(int) ((Math.random()*(max-min+1))+min);
    }

    private char[] crearArray(int longitud) {
        return new char[longitud];

    }
}
