public class NúmerosAleatorios1 {
    public static void main(String[] args) {

        int suma=0,tirada;

        System.out.println("LANZAMIENTO DE 3 DADOS: ");

        for (int i=1;i<4;i++){
            tirada = (int)(Math.random()*6-1)+1;
            System.out.println("Dado "+i+": "+tirada);
        }



    }
}


