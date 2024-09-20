import java.util.Scanner;

public class FraccionesContinuas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calcularNumerador(n));
    }

    public static long calcularNumerador(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularNumerador(n - 1) + calcularNumerador(n - 2);
        }
    }
}