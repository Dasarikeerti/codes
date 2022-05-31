package p2;
//for thread safety(synchronized methods) i.e for consistency we use vector..
//for fast performance we use ArrayaList and LinkedList

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// creating vector object using reference as interface and class type:
		// object creation for vector using class type as reference
		Vector v = new Vector();// tight coupling(addElements)
		v.addElement("dasari");
		v.addElement(null);
		v.addElement('v');
		v.addElement(true);
		System.out.println(v);

		// object creation for vector using interface type as reference

		List v1 = new Vector();// loose coupling(add)
		v1.add("tyson");
		v1.add(null);
		v1.add('k');
		v1.add(false);
		System.out.println(v1);

		// to iterate all values in vector:1.for loop 2.iterator 3.ListIterator
		// 4.Enumeration
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		// by using Enumeration:we use it if both reference and object has same type i.e
		// Vector
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}

}
