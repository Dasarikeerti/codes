package p3;
//functional programming:it reduces length of code compared to oop.
//functional interface:which has only 1 abstract method interface.it allows default and static methods
//Lambda expression
//abstract method-which does not have any implementation

@FunctionalInterface
interface intf{
	void swap(int a,int b);
	
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		intf s=(int a,int b) -> {
		   int c;
		   c=a;
		   a=b;
		   b=c;
      System.out.println("a= "+a+" "+"b= "+b);
		};
		   s.swap(10,20);

	}

}

