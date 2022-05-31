package p3;

@FunctionalInterface
interface intf1 {
	int num(int n);
}

public class NaturalNumbers {

	public static void main(String[] args) {
		intf1 c = (int n) -> {
			return n = (n + 1) / 2;

		};
		System.out.println(c.num(100));
	}
}
