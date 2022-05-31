package p2;
                             //HashSet
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Set(I)
      HashSet(c)
      LinkedHashSet(c)
      SortedSet(I)
      TreeSet(c)
      */
/*supports heterogeneous elements
 * null values-allowed
 * Insertion oder not preserved
 * duplicates- not allowed(if we generate equals and hashcode method-(it prints values) 
 */
public class SetDemo {

	public static void main(String[] args) {
		Set hs1 = new HashSet(); //if we dont specify datatype
		hs1.add(99);
        hs1.add(100);
		hs1.add("succed");
		System.out.println(hs1);


//if we want to specify datatype..i.e only emp type can be stored
		Set<Emp> hs = new HashSet();
		Emp e1=new Emp(10,"keerthi","manager");
		Emp e2=new Emp(20,"vivek","Trainer");
		Emp e3=new Emp(30,"ks","manager");
		Emp e4=new Emp(40,"Dasari","IT");
		Emp e6=new Emp(0,"Das","IT");
		Emp e7=new Emp(0,"Das","IT");

        Emp e5=e1; //it is not printing e5 coz  hash code is same for e1 and e5.(no duplicates)
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e6);
        hs.add(e5);
        hs.add(e7);
		
		//to iteration we can only use for loop ,for each,iterator
		Iterator ir =hs.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	//to check has code of each object
		System.out.println(e1.hashCode());//same hash code for e1 and e5
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		//note:to compare values and get output generate hash code and equals method in Emp.java
		
//note:to compare values and get output,generate hash code and equals method in Emp.java
       
		 Iterator ir3 =hs.iterator();
		 while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		//to check any element is present or not
   System.out.println(hs1.contains("succed"));
	}
}

