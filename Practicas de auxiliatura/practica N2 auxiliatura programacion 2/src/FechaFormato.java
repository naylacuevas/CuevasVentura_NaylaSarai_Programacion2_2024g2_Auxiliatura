import java.util.Scanner;

public class FechaFormato {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una fecha (dd de mes, aaaa): ");
            String fechaTexto = scanner.nextLine();
            String[] partesFecha = fechaTexto.split(" de ");

            if (partesFecha.length != 3) {
                System.out.println("Formato de fecha inválido. Ingrese la fecha como dd de mes, aaaa.");
                return;
            }

            String dia = partesFecha[0];
            String mes = partesFecha[1];
            String anio = partesFecha[2];

            int diaInt = Integer.parseInt(dia);
            int anioInt = Integer.parseInt(anio);

            int mesInt = obtenerMes(mes);
            if (mesInt == -1) {
                System.out.println("Mes inválido. Ingrese un mes válido.");
                return;
            }

            if (!esFechaValida(diaInt, mesInt, anioInt)) {
                System.out.println("Fecha inválida. Ingrese una fecha válida.");
                return;
            }

            System.out.println("Fecha en formato numérico: " + diaInt + "/" + mesInt + "/" + anioInt);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static int obtenerMes(String mes) {
        switch (mes) {
            case "enero":
                return 1;
            case "febrero":
                return 2;
            case "marzo":
                return 3;
            case "abril":
                return 4;
            case "mayo":
                return 5;
            case "junio":
                return 6;
            case "julio":
                return 7;
            case "agosto":
                return 8;
            case "septiembre":
                return 9;
            case "octubre":
                return 10;
            case "noviembre":
                return 11;
            case "diciembre":
                return 12;
            default:
                return -1;
        }
    }

    private static boolean esFechaValida(int dia, int mes, int anio) {
        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (mes == 2) {
            if (esBisiesto(anio) && dia > 29) {
                return false;
            } else if (!esBisiesto(anio) && dia > 28) {
                return false;
            }
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }

        return true;
    }

    private static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
    }
}