public class NúmerosAleatorios16 {
    public static void main(String[] args) {
        
        NúmerosAleatorios16 programa = new NúmerosAleatorios16();
        programa.inicio();
    }

    private void inicio() {
        int tirada1,tirada2,tirada3;
        String figura1,figura2,figura3,resultado;
        tirada1 = getNumeroAleatorio(1,5);
        figura1 = getFigura(tirada1);
        tirada2 = getNumeroAleatorio(1,5);
        figura2 = getFigura(tirada2);
        tirada3 = getNumeroAleatorio(1,5);
        figura3 = getFigura(tirada3);

        resultado = comprobarJugada(tirada1,tirada2,tirada3);
        imprimirPantalla(figura1+" "+figura2+" "+figura3);
        imprimirPantalla(resultado);
    }

    private void imprimirPantalla(String cadena) {
        System.out.println(cadena);
    }

    private String comprobarJugada(int tirada1, int tirada2, int tirada3) {
        String resultado="";
        if ((tirada1 != tirada2) && (tirada1 != tirada3) && (tirada2 != tirada3)) {
            resultado = "Lo siento, ha perdido";
        } else if ((tirada1 == tirada2) && (tirada1 != tirada3) ||
                (tirada1==tirada3) && (tirada1!=tirada2) ||
                (tirada2==tirada3) && (tirada2!=tirada1)){
            resultado = "Bien, ha recuperado la moneda";
        } else if ((tirada1==tirada2) && (tirada1==tirada3)) {
            resultado = "Enhorabuena, ha ganado 10 monedas";
        }
        return resultado;
    }

    private String getFigura(int tirada) {
        String figura;
        switch (tirada){
            case 1:
                figura = "Corazón";
                break;
            case 2:
                figura = "Diamante";
                break;
            case 3:
                figura = "Herradura";
                break;
            case 4:
                figura = "Campana";
                break;
            default:
                figura = "Limón";
        }
        return figura;
    }

    private int getNumeroAleatorio(int min, int max) {
        return (int)(Math.random()*(max-min+1)+min);
    }
}
