
public class Cat {
	//2.initializing objects by using methods
	String colour;
	int age;

	public static void main(String[] args) {
		Cat c=new Cat();
         c.m3("black",0);
         c.display();
	}
	
	void m3(String s,int i) {
		colour=s;
		age=i;
		
	}
	void display() {
		System.out.println(colour+" "+age);
	}
}
