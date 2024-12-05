import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alAmericanos;
        int alumno=1;
        double nota=0;
        String notaFinal1=1,notaFinal2=1,notaFinal3=1,notaFinal4=1,notaFinal5=1,notaFinal6=1,notaFinal7=1,notaFinal8=1,notaFinal9=1,notaFinal10=1,notaFinal11=1,notaFinal12=1;

        System.out.print("Número de alumnos americanos: ");
        alAmericanos = sc.nextInt();
        System.out.println("=======================================");
        System.out.println("NOTAS ALUMNOS AMERICANOS");
        System.out.println("=======================================");
        System.out.println("            1a   2a   3a");
        System.out.println("           ---------------");

        System.out.println("  Alumno 1: "+notaFinal3);

            if (nota==0.00){
                notaFinal1="F";
            } else if ((nota>=0.67) && (nota<1.00)) {
                notaFinal2="D-";
            }else if ((nota>=1.00) && (nota<1.33)) {
                notaFinal3="D";
            }else if ((nota>=1.33) && (nota<1.67)) {
                notaFinal4="D+";
            }else if ((nota>=1.67) && (nota<2.00)) {
                notaFinal5="C-";
            }else if ((nota>=2.00) && (nota<2.33)) {
                notaFinal6="C";
            }else if ((nota>=2.33) && (nota<2.67)) {
                notaFinal7="C+";
            }else if ((nota>=2.67) && (nota<3.00)) {
                notaFinal8="B-";
            }else if ((nota>=3.00) && (nota<3.33)) {
                notaFinal9="B";
            }else if ((nota>=3.33) && (nota<3.67)) {
                notaFinal10="B+";
            }else if ((nota>=3.67) && (nota<4.00)) {
                notaFinal11="A";
            }else if (nota>=4.00) {
                notaFinal12="A+";
            }else {
                System.out.println("Nota alfabética no válida.");
            }
        }
    }
