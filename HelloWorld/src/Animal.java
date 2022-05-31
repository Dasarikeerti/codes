

//to create object and calling methods
public class Animal {
	void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		// creating object using new operator
		Animal buzo = new Animal();// ClassName ref_name=new ClassName();
		Bird1 sparrow=new Bird1();
		// to call any method 1st we need to create object of class
		buzo.run();
		buzo.jump();
		sparrow.eat();
		
	}

	void jump() {
		System.out.println("jump");
	}

	// Animal and bird are 2 different clases so we need to create object
	// of Bird class to call the eat method in main method

	
	
}
class Bird1{
	void eat() {
		System.out.println("eating");
	}
}
