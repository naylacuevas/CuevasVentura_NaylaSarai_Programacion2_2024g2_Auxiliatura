import java.util.Random;
import java.util.Scanner;

public class Botin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean continuar = true;
        while (continuar) {
            // Generar botín
            String tipo = generarTipo(random);
            String rareza = generarRareza(random);
            int atributo1 = generarAtributo(random, tipo);
            int atributo2 = generarAtributo(random, tipo);
            int atributo3 = generarAtributo(random, tipo);

            // Mostrar botín
            System.out.println("Encontraste un " + tipo + " " + rareza + ":");
            System.out.println("Atributo 1: " + atributo1);
            System.out.println("Atributo 2: " + atributo2);
            System.out.println("Atributo 3: " + atributo3);

            // Preguntar si continuar
            System.out.println("¿Quieres seguir buscando botín? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        scanner.close();
        System.out.println("¡Gracias por jugar!");
    }

    // Genera un tipo de botín aleatorio
    private static String generarTipo(Random random) {
        String[] tipos = {"Arma", "Escudo", "Modificador"};
        return tipos[random.nextInt(tipos.length)];
    }

    // Genera una rareza aleatoria
    private static String generarRareza(Random random) {
        String[] rarezas = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
        return rarezas[random.nextInt(rarezas.length)];
    }

    // Genera un atributo aleatorio
    private static int generarAtributo(Random random, String tipo) {
        if (tipo.equals("Arma")) {
            return random.nextInt(100) + 1;
        } else if (tipo.equals("Escudo")) {
            return random.nextInt(50) + 1;
        } else {
            return random.nextInt(20) + 1;
        }
    }
}