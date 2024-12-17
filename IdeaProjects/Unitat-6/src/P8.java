import java.util.Scanner;

public class P8
{
    public static void main(String[] args) {
        P8 programa = new P8();
        programa.inicio();
    }

    private void inicio() {
        double[] temperatura = getTemperaturas();
        imprimirDiagramaBarras(temperatura);
    }

    private void imprimirDiagramaBarras(double[] temperatura) {
        for (int mes=0;mes<temperatura.length;mes++){
            imprimirMes(mes);
            imprimirBarra(temperatura[mes]);
            imprimirPantalla("\n");
        }
    }

    private void imprimirBarra(double tempDeMes) {
        for (int i=0;i<tempDeMes;i++){
            imprimirPantalla("*");
        }
    }

    private double[] getTemperaturas() {
        double[] temperaturas = crearArray(12);
        for (int i=0;i<=11;i++){
            imprimirMes(i);
            temperaturas[i]= getTemperatura();
        }
        return temperaturas;
    }

    private void imprimirMes(int i) {
        switch (i){
            case 0: imprimirPantalla("Enero: ");
                    break;
            case 1: imprimirPantalla("Febrero: ");
                    break;
            case 2: imprimirPantalla("Marzo: ");
                    break;
            case 3: imprimirPantalla("Abril: ");
                    break;
            case 4: imprimirPantalla("Mayo: ");
                    break;
            case 5: imprimirPantalla("Junio: ");
                    break;
            case 6: imprimirPantalla("Julio: ");
                    break;
            case 7: imprimirPantalla("Agosto: ");
                    break;
            case 8: imprimirPantalla("Septiembre: ");
                    break;
            case 9: imprimirPantalla("Octubre: ");
                    break;
            case 10: imprimirPantalla("Noviembre: ");
                    break;
            default: imprimirPantalla("Diciembre: ");
        }
    }

    private void imprimirPantalla(String cadena) {
        System.out.print(cadena);
    }

    private double getTemperatura() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }


    private double[] crearArray(int longitud) {
        return new double[longitud];
    }
}
