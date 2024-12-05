public class NumerosAleatorios15 {
    public static void main(String[] args) {
        NumerosAleatorios15 programa = new NumerosAleatorios15();
        programa.inicio();
    }

    private void inicio() {
        int cantidadNotas;
        String primeraNota;
        cantidadNotas = getMelodia();
        primeraNota = getNota();
        imprimirPantalla();
        for (int i=2;i<=cantidadNotas;i++){
            
        }
    }

    private void imprimirPantalla() {
    }

    private String getNota() {
        int num;
        String nota;
        num = getNumeroAleatorio(1,7)*4;
        nota = transformarNota(num);
        return nota;
    }

    private String transformarNota(int num) {
        String nota="";
        switch (num){
            case 1: nota="do";
                break;
            case 2: nota="re";
                break;
            case 3: nota="mi";
                break;
            case 4: nota="fa";
                break;
            case 5: nota="sol";
                break;
            case 6: nota="la";
                break;
            case 7: nota="si";
        }
        return nota;
    }

    private int getMelodia() {
        return getNumeroAleatorio(1,7)*4;
    }

    private int getNumeroAleatorio(int min, int max) {
        return (int)(Math.random()*(max-min+1)+min);
    }
}
