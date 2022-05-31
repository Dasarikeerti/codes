package p1;
//Multilevel inheritance
public class Parent {
	int a = 1;

	void x1() {
		System.out.println("parent");

	}
}

class Child extends Parent {
	int b = 2;

	void x2() {
		System.out.println("child");
	}
}

class GrandChild extends Child {
	int c = 3;

	void x3() {
		System.out.println("grand child");
	}

	public static void main(String[] args) {
		GrandChild g = new GrandChild();
		System.out.println(g.a);
		System.out.println(g.b);
		System.out.println(g.c);
		g.x1();
		g.x2();
		g.x3();

	}
}
