package practices;

import java.util.*;

public class sumofArrayEle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int sum = 0;
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of Array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println("Sum of Element in Array:" + sum);
		sc.close();
	}
}
