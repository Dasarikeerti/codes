package pkg;

import java.util.Scanner;

// To check whether a number is prime or not
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int temp = 0;
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}

		}
		if (temp == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
