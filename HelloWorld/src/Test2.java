
public class Test2 {
	//parameterized constructor
	int id;
	String name;
	Test2(int id,String name){
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
      Test2 t=new Test2(10,"keerthi");
      Test2 t1=new Test2(20,"Tyson");
      System.out.println(t.id+" "+t.name);
      System.out.println(t1.id+" "+t1.name);
	}

}
