package practices;

import java.util.*;

public class LettersToNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Letters:");
		String input = s.next().toUpperCase();
		System.out.println("Input in UpperCase:"+input);
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			result = result * 26 + (input.charAt(i) - 'A' + 1);
		}
		System.out.println(result);
		s.close();
	}
}
