package lab;
//lab5.
//1
import java.util.Scanner;

class AgeException extends Exception {

	public AgeException(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur age : ");
		int age = s.nextInt();

		try {
			if (age < 16)
				throw new AgeException("Invalid age");
			else
				System.out.println("Valid age");
		} catch (AgeException a) {
			System.out.println(a);
		}
	}
}
