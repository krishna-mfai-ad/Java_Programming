package practices;

import java.util.*;

public class LettersToNumbers {
//	public static int lettersToNumber(String s) {
////		int result = 0;
////		for (int i = 0; i < s.length(); i++) {
////			result = result * 26 + (s.charAt(i) - 'A' + 1);
////		}
////		return result;
//	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Letters:");
		String input = s.next();
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			result = result * 26 + (input.charAt(i) - 'A' + 1);
		}
		System.out.println(result);
		s.close();
	}
}
