package com.mctExamination;
import java.util.Scanner;
public class primequestion {
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int GreatestPrime(int[] arr) {
        int maxPrime = 0;
        for (int num=0;num<arr.length;num++) {
            if (isPrime(arr[num]) && arr[num] > maxPrime) {
                maxPrime = arr[num];
            }
        }
        return maxPrime;
    }

    public static  int GreatestEven(int[] arr) {
        int maxEven = 0;
        for (int num=0;num<arr.length;num++) {
            if (arr[num] % 2 == 0 && arr[num] > maxEven) {
                maxEven = arr[num];
            }
        }
        return maxEven;
    }
	public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = s.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the array elements :");
	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }

	        int greatestPrime = GreatestPrime(arr);
	        System.out.println("greatestPrime:"+greatestPrime);
	        int greatestEven = GreatestEven(arr);
	        System.out.println("greatestEven:"+greatestEven);

	        int sum = greatestPrime + greatestEven;

	        System.out.println("sum : " + sum);
	    }

	    
}
