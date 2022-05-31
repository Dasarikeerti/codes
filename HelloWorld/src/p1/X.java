package p1;

// Hierarchial inheritance:K extend X ,M extends X
public class X {
	int h = 0;
}

class K extends X {
	int i = 1;

	void show() {
		System.out.println("K");
	}
}

class M extends X {
	void show1() {
		System.out.println("M");
	}

	public static void main(String[] args) {
		M m = new M();
		System.out.println(m.h);
		// System.out.println(m.i);
		m.show1();

	}
}
