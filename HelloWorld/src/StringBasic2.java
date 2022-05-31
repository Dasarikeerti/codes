
public class StringBasic2 {
	//string constructors can be created as:

	public static void main(String[] args) {
		//no args constructor i.e.. public String()
		String s1=new String();
		System.out.println(s1.length());
		
		//public String(StringBuffer sb)
		StringBuffer sb=new StringBuffer("keerthi");
		String s2=new String(sb);//mutable to unmutable i.e sb to string
		System.out.println(s2);
		
		//public String(StringBulider sb)
		StringBuilder sb1=new StringBuilder("Dasari");
		System.out.println(sb1);
		
		//public String(String s)
		String s=new String("family");
		System.out.println(s);
		
		//public String(char[] c)
		char[] c1= new char[]{'a','b','c'};
		System.out.println(c1);
		
		//public String(byte[] b)
		byte[] b= {101,103};
		String s4=new String(b);
		System.out.println(s4);
		
		
		
		

	}

}
