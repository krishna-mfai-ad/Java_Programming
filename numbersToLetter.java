package practices;

import java.util.*;

public class numbersToLetter {

    public static String numberToLetters(int n) {
        String result = "";
        while (n > 0) {
            n--;
            result = (char) (n % 26 + 'A') + result;
            n /= 26;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int input =s.nextInt();
        System.out.println(numberToLetters(input));
        s.close();
}
}
