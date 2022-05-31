package p2;
                              //LinkedList
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		List l = new LinkedList();
		// to add any values of diff datatype in a list
		l.add(1);
		l.add(true);
		l.add("keerthi");
		System.out.println(l);

		// to replace/update the value in the same position
		l.set(1, false);// var_name.set(index,value to replace);
		System.out.println(l);

		// to print/read the value
		System.out.println(l.get(2));// (var_name.get(index));

		// to remove
		l.remove(2);// var_name.romove(index);
		System.out.println(l);

		// to print/iterate all the values at once 1.using for loop 2.using iterator
		// 3.ListIterator
		// option 1.for loop
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		// option 2.using iterator method
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// option 3.using ListIterator-it supports only in list
		ListIterator itr1 = l.listIterator();
		while (itr1.hasNext()) {//reading elements from beginning to last
			System.out.println(itr1.next());
		}
		while(itr1.hasPrevious()) {//reading elements from last to starting
			System.out.println(itr1.previous());
		}
		
		//to add one list in another list
		List m=new LinkedList();//creating one more array list
		m.add(99);
		m.add("dasari");
		l.addAll(m);//to print one list in another list
		System.out.println(l);
		//to check a list if a value is present or not
		System.out.println(m.contains("dasari"));//it returns boolean as output
		//to clear list
		m.clear();
		System.out.println(m);
		//to find index of any value
		System.out.println(l.indexOf(false));
}

}
