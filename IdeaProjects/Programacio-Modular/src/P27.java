import java.util.Scanner;

public class P27 {
    public static void main(String[] args) {
        P27 programa = new P27();
        programa.inicio();
    }

    private void inicio() {
        int num, mayor, menor;
        boolean fin = false;
        num = getNumero();
        mayor = num;
        menor = num;
        if (isPositivo(num)){
            do {
                num = getNumero();
                if (isPositivo(num)){
                    mayor = getMayor(mayor,num);
                    menor = comprobarMenor(menor,num);
                }else {
                    fin=true;
                }
            }while (!fin);
        }else{
            imprimirPantalla("No has introducido ningún número.\n");
        }
        imprimirPantalla("Mayor: "+mayor);
        imprimirPantalla("Menor: "+menor);
    }

    private int comprobarMenor(int menor, int num) {
        if (menor<num){
            return menor;
        }else {
            return num;
        }
    }

    private int getMayor(int mayor, int num) {
        if (mayor>num){
            return mayor;
        }else {
            return num;
        }
    }


    private boolean isPositivo(int num) {
        if (num>=0){
            return true;
        }else {
            return false;
        }
    }

    private int getNumero() {
        Scanner sc = new Scanner(System.in);

        imprimirPantalla("Introduce un número cualquiera: ");
        return sc.nextInt();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
