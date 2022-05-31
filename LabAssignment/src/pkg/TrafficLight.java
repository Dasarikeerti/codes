package pkg;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter colour");
		String s1 = sc.next();

		switch (s1) {
		case "red": {
			System.out.println("stop");
			break;
		}
		case "green": {
			System.out.println("go");
			break;
		}
		case "yellow": {
			System.out.println("ready");
			break;
		}
		default: {
			System.out.println("No message displayed");
		}
		}
	}
}
