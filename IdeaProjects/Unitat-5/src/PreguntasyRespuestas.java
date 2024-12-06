import java.sql.SQLOutput;
import java.util.Scanner;

public class PreguntasyRespuestas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int puntuacion=1;
        String res1="",res2,res3,res4,res5;

        System.out.println("**BIENVENIDOS AL EXAMEN DE MÚSICA EN JAVA**");
        System.out.println("==============================================");
        System.out.println("**Contestar a lo que se os pide, hay UNA respuesta correcta**");
        System.out.println("==============================================");

        System.out.println("1. La tonalidad de F, ¿cuál es su armadura?\n"+
                " A)1 bemol\n B)2 bemoles\n C)1 sostenido\n D)Todas son incorrectas\n");
        System.out.print("RESPUESTA: "+res1 );
        res1 = sc.next();
        System.out.println("2. ¿Qué signiicado posee el número de abajo en un compás 4/2?\n"+
                " A)La figura en cuestión, la blanca\n B)Caben dos negras\n C)El número de compases que hay en una"+
                " partitura\n D)Todas son incorrectas\n");
        System.out.print("RESPUESTA: ");
        res2 = sc.next();
        System.out.println("3. ¿Cuál es el orden de los sostenidos?\n"+
                " A)Si,Mi,La,Re,Sol,Do,Fa\n B)Mi,La,Si,Re,Fa,Sol,Do\n C)A y B son correctas\n"+
                " D)Fa,Do,Sol,Re,La,Mi,Si\n");
        System.out.print("RESPUESTA: ");
        res3 = sc.next();
        System.out.println("4. ¿Cuál es el orden de los bemoles?\n"+
                " A)Si,La,Mi,Re,Sol,Do,Fa\n B)Si,Mi,La,Re,Sol,Do,Fa\n C)Si,Mi,La,Re,Sol,Do,Fa\n"+
                " D)Si,Mi,La,Re,Sol,Fa,Do\n");
        System.out.print("RESPUESTA: ");
        res4 = sc.next();
        System.out.println("5. El bombo está en la tonalidad de...\n"+
                " A)Do#m\n B)Es de tono indeterminado, borrico\n C)A#\n D)Do#M\n");
        System.out.print("RESPUESTA: ");
        res5 = sc.next();

        if (((res1=="A") || (res1=="a") &&
                (res2=="A") || (res2=="a") &&
                (res3=="D") ||(res3=="d") &&
                (res4=="C") || (res4=="c") &&
                (res5=="B") || (res4=="b"))){
            puntuacion=5;
        } else if (((res1=="A") || (res1=="a") &&
                    (res2=="A") || (res2=="a") &&
                    (res3=="D") ||(res3=="d") &&
                    (res4=="C") || (res4=="c"))){
            puntuacion=4;
        } else if (((res1=="A") || (res1=="a") &&
                    (res2=="A") || (res2=="a") &&
                    (res3=="D") ||(res3=="d"))){
            puntuacion=3;
        } else if (((res1=="A") || (res1=="a") &&
                    (res2=="A") ||(res2=="a"))){
            puntuacion=2;
        } else if ((res1=="A") || (res1=="a")) {
            puntuacion=1;
        }
        System.out.println("**Resultado del examen**\n");

        if ((puntuacion==1) || (puntuacion==2) || (puntuacion==3)){
            System.out.println("ES TIEMPO DE APRENDER MÁS SOBRE LA MÚSICA. ¡ÁNIMO!");
        } else if (puntuacion==4) {
            System.out.println("MUY BIEN");
        } else if (puntuacion==5) {
            System.out.println("EXCELENTE");
        }
    }
}
