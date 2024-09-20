import java.util.Scanner;

public class Joyero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] joyero = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                joyero[i][j] = scanner.nextInt();
            }
        }

        int rotaciones = 0;
        while (true) {
            boolean original = true;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (joyero[i][j] != (i * N + j + 1)) {
                        original = false;
                        break;
                    }
                }
                if (!original) {
                    break;
                }
            }
            if (original) {
                break;
            }
            rotar(joyero);
            rotaciones++;
        }

        System.out.println(rotaciones);
    }

    private static void rotar(int[][] joyero) {
        int N = joyero.length;
        int[][] nuevoJoyero = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                nuevoJoyero[j][N - 1 - i] = joyero[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                joyero[i][j] = nuevoJoyero[i][j];
            }
        }
    }
}