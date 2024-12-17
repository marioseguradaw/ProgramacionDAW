import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        C programa = new C();
        programa.inicio();
    }

    private void inicio() {
        String cadena,cadenaInvertida;

        imprimirPantalla("Introduce una cadena: ");
        cadena = getCadena();

        cadenaInvertida = getCadenaInvertida(cadena);
        imprimirPantalla("Cadena Invertida: "+cadenaInvertida);
    }

    private String getCadenaInvertida(String cadena) {
        String cadenaInvertida = "";
        
        for (int i=cadena.length()-1;i>=0;i--){
            cadenaInvertida = cadenaInvertida+cadena.charAt(i);
        }
        return cadenaInvertida;
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private String getCadena() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }
}
