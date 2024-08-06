import java.util.Scanner;

public class profi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // Calculate the maximum profit
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        // Print the result
        scanner.close();
        System.out.println(maxProfit);
    }
}
