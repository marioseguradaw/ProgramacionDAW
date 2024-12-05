import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        P25 programa = new P25();
        programa.inicio();
    }

    private void inicio() {
        double euros;

        euros = getEuros();
        imprimirPantalla(getBilletesMoneda1Moneda2(euros));
        imprimirPantalla(getMonedas(euros));
    }

    private String getMonedas(double euros) {
        String resultado="";
        int parteDecimal;

        parteDecimal = getParteDecimal(euros);
        if (parteDecimal>=50){//Comprobar monedas de 50 céntimos
            resultado += parteDecimal/50+" monedas de 0.50 céntimos\n";
            parteDecimal = parteDecimal%50;
        }
        if (parteDecimal>=20){//Comprobar monedas de 20 céntimos
            resultado += parteDecimal/20+" monedas de 0.20 céntimos\n";
            parteDecimal = parteDecimal%20;
        }
        if (parteDecimal>=10){//Comprobar monedas de 10 céntimos
            resultado += parteDecimal/10+" monedas de 0.10 céntimos\n";
            parteDecimal = parteDecimal%10;
        }
        if (parteDecimal>=5){//Comprobar monedas de 5 céntimos
            resultado += parteDecimal/5+" monedas 0.5 céntimos\n";
            parteDecimal = parteDecimal%5;
        }
        if (parteDecimal>=2){//Comprobar monedas de 2 céntimos
            resultado += parteDecimal/2+" monedas de 0.2 céntimos\n";
            parteDecimal = parteDecimal%2;
        }
        if (parteDecimal>=1){//Comprobar monedas de 1 céntimos
            resultado += parteDecimal/1+" monedas de 0.1 céntimos\n";
        }
        return resultado;
    }

    private int getParteDecimal(double euros) {
        return (int)((euros - getParteEntera(euros)))*100;
    }

    private String getBilletesMoneda1Moneda2(double euros) {
        int parteEntera;
        String resultado="";

        parteEntera = getParteEntera(euros);

        if (parteEntera>=100){//Comprobar billetes de 100 euros
            resultado += (parteEntera/100)+" billetes de 100€\n";
            parteEntera = parteEntera%100;
        }
        if (parteEntera>=50){//Comprobar billetes de 50 euros
            resultado += (parteEntera/50)+" billetes de 50€\n";
            parteEntera = parteEntera%50;
        }
        if (parteEntera>=20){//Comprobar billetes de 20 euros
            resultado += (parteEntera/20)+" billetes de 20€\n";
            parteEntera = parteEntera%20;
        }
        if (parteEntera>=10){//Comprobar billetes de 10 euros
            resultado += (parteEntera/10)+" billetes de 10€\n";
            parteEntera = parteEntera%10;
        }
        if(parteEntera>=5){//Comprobar billetes de 5 euros
            resultado += (parteEntera/5)+" billetes de 5€\n";
        }
        if (parteEntera>=2){//Comprobar monedas de 2 euros
            resultado += (parteEntera/2)+" monedas de 2€\n";
            parteEntera += parteEntera%2;
        }
        if (parteEntera>=1){//Comprobar monedas de 1 euro
            resultado += (parteEntera/1)+" monedas de 1€\n";
        }
        return resultado;
    }

    private int getParteEntera(double euros) {
        return (int)(euros);
    }

    private void imprimirPantalla(String cadena){
        System.out.print(cadena);
    }
    private double getEuros() {
        Scanner sc = new Scanner(System.in);
        double euros;
        do {
            imprimirPantalla("Introduce los euros: ");
            return sc.nextDouble();
        }while (euros<=0);
    }
}

