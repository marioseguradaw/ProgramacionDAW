import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String mes, ano, mesNumerico = String.valueOf(00);
        int dia;
        System.out.print("Introduzca una fecha concreta: ");
        dia = sc.nextInt();
        sc.next();
        mes = sc.next();
        sc.next();
        ano = sc.next();

        if ((dia < 1) || (dia > 31)) {
            System.out.println("Día no existente.");
        } else {
            switch (mes.toLowerCase()) {
                case "Enero":
                    mesNumerico = "01";
                    break;
                case "Febrero":
                    mesNumerico = "02";
                    break;
                case "Marzo":
                    mesNumerico = "03";
                    break;
                case "Abril":
                    mesNumerico = "04";
                    break;
                case "Mayo":
                    mesNumerico = "05";
                    break;
                case "Junio":
                    mesNumerico = "06";
                    break;
                case "Julio":
                    mesNumerico = "07";
                    break;
                case "Agosto":
                    mesNumerico = "08";
                    break;
                case "Septiembre":
                    mesNumerico = "09";
                    break;
                case "Octubre":
                    mesNumerico = "10";
                    break;
                case "Noviembre":
                    mesNumerico = "11";
                    break;
                case "Diciembre":
                    mesNumerico = "12";
                default:
                    System.out.println("Mes no válido");
            }
            if ((dia >= 1) && (dia <= 9)) {
                System.out.println("0" + dia + "/" + mesNumerico + "/" + ano);
            } else {
                System.out.println(dia + "/" + mesNumerico + "/" + ano);
            }
        }
    }
}