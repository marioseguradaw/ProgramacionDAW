public class numerosAleatoriosEntre0y10 {
    public static void main(String[] args) {

        System.out.println("5 números aleatorios entre 0 y 10");
        System.out.println("sin llegar a 10 (con decimales):");
        for (int i=1;i<=5;i++){
            System.out.println(Math.random()*10 + " ");
        }
    }
}
