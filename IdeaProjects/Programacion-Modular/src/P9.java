/*Programa que lea por la entrada estándar una calificación dada por un carácter
(A: Excelente, B: Notable; C: Suficiente; D: Aprobado; E: Suspendido) y que
visualice por la salida estándar su significado.*/

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        P9 programa = new P9();
        programa.inicio();
    }

    private void inicio() {
        double nota;
        String resultado;

        nota = getNota();
        resultado = codificarNota(nota);
        imprimirPantalla(resultado);
    }

    private String codificarNota(double nota) {
        String resultado="";

        if ((nota>=0) && (nota<5)){
            resultado = "Insuficiente\n";
        } else if ((nota>=5) && (nota<6)) {
            resultado = "Suficiente\n";
        } else if ((nota>=6) && (nota<7)) {
            resultado = "Bien\n";
        } else if ((nota>=7) && (nota<9)) {
            resultado = "Notable\n";
        }else if ((nota>=9) && (nota<=10)){
            resultado= "Sobresaliente\n";
        }else {
            resultado = "Nota no válida.\n";
        }
        return resultado;
    }

    private double getNota() {
        Scanner sc = new Scanner(System.in);

        imprimirPantalla("Introduce tu nota: ");
        return sc.nextDouble();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
