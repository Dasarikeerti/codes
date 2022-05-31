
public class Test1 {
	//no args constructor created by user
	int id;
	Test1(){
		System.out.println("No args constructor");
	}

	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println(t.id);
	}
}
