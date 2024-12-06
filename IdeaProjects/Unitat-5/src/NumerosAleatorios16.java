public class NumerosAleatorios16 {
    public static void main(String[] args) {

        String corazon,diamante,herradura,campana,limon;
        String figura1 = "",figura2="",figura3="";

        for (int i=0;i<=3;i++){
            System.out.println(Math.random()*(2-1+1)+1);
        }
        System.out.println("Resultado de la tirada: ");
        System.out.println(figura1+" | "+figura2+"| "+figura3);
    }
}
