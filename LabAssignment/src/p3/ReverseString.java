package p3;

@FunctionalInterface
interface Demo {
	String rev(String name);
}

public class ReverseString {

	public static void main(String[] args) {
		Demo a = (String name) -> {

			int len = name.length();
			String rev = "";
			for (int i = len - 1; i >= 0; i--) {
				rev = rev + name.charAt(i);
			}
			return rev;

		};
		System.out.println(a.rev("keerthi"));

	}

}
