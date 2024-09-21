import java.util.Scanner;

import java.util.Scanner;

public class BitsSwap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the numbers in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Swap the bits to maximize the lexicographical order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 31; k >= 0; k--) {
                    if (((numbers[i] >> k) & 1) == 0 && ((numbers[j] >> k) & 1) == 1) {
                        numbers[i] = numbers[i] ^ (1 << k);
                        numbers[j] = numbers[j] ^ (1 << k);
                        break;
                    }
                }
            }
        }

        // Print the maximized lexicographical order
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
