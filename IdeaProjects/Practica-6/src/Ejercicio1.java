import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 programa = new Ejercicio1();
        programa.inicio();
    }

    private void inicio() {
        int hora, minutos, segundos;
        String resultado;

        hora = getHora();
        minutos = getMinutos();
        segundos = getSegundos();

        imprimirHoraIntroducida(hora,minutos,segundos);
        getHoraSiguiente(hora,minutos,segundos);
        getMinutoSiguente(minutos,segundos);
        getSegundoSiguiente(segundos);
    }
    private int getSegundoSiguiente(int segundos) {
        if (segundos==59){
            segundos += 1;
        }
        return segundos;
    }

    private int getMinutoSiguente(int minutos, int segundos) {
        if (segundos==0){
            minutos += 1;
        }
        return minutos;
    }

    private int getHoraSiguiente(int hora, int minutos, int segundos) {
        if ((minutos==0) && (segundos==0)){
            hora += 1;
        }
        return hora;
    }

    private void imprimirHoraIntroducida(int hora, int minutos, int segundos) {
        imprimirPantalla("Hora introducida: "+hora+":"+minutos+":"+segundos+"\n");
    }

    private int getSegundos() {
        Scanner sc = new Scanner(System.in);
        int segundos=0;

        imprimirPantalla("Segundos: ");
        return sc.nextInt();
    }

    private int getMinutos() {
        Scanner sc = new Scanner(System.in);
        int minutos=0;

        imprimirPantalla("Minutos: ");
        return sc.nextInt();
    }

    private int getHora() {
        Scanner sc = new Scanner(System.in);
        int hora=0;

        imprimirPantalla("Hora: ");
        return sc.nextInt();
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }
}
