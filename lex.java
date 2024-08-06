import java.util.Scanner;

public class lex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int B = scanner.nextInt();

        // Get the largest lexicographical array
        int[] result = getLargestLexicographicalArray(array, n, B);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }


    private static int[] getLargestLexicographicalArray(int[] array, int n, int B) {
        int[] indexMap = new int[n + 1];
        for (int i = 0; i < n; i++) {
            indexMap[array[i]] = i;
        }

        for (int i = 0; i < n && B > 0; i++) {
            int bestValue = n - i;
            if (array[i] == bestValue) {
                continue;
            }

            int bestValueIndex = indexMap[bestValue];
            indexMap[array[i]] = bestValueIndex;
            indexMap[bestValue] = i;

            // Swap the elements
            int temp = array[i];
            array[i] = array[bestValueIndex];
            array[bestValueIndex] = temp;

            B--;
        }

        return array;
    }
}
