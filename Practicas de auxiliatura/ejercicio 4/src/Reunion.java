import java.util.Scanner;

public class Reunion {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(); // Número de directores
            int k = scanner.nextInt(); // Duración máxima de la reunión

            int duracionMaximaDiscurso = (k - (n - 1)) / n; // Calcula la duración máxima del discurso

            System.out.println(duracionMaximaDiscurso);
        }
    }
}