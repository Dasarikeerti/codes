package p1;

//single level inheritance
//by creating object B i.e child we can acquire A(parent) and B(child) both.

public class B extends A {
	void m2() {
		System.out.println("class B");
	}

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.x);
		obj.m1(); // A class
		B obj1 = new B();
		System.out.println(obj1.x); // 10
		obj1.m1(); // A class
		obj1.m2(); // class B

	}

}
