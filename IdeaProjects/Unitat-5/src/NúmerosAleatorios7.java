public class NúmerosAleatorios7 {
    public static void main(String[] args) {

        int max=3,min=1;

        for (int cont=1;cont<=14;cont++){
            System.out.print("Partido "+cont+": ");
            System.out.println((int)(Math.random()*(3-1+1)+1));
        }
    }
}
