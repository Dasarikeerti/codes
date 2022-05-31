package p2;

import java.util.Enumeration;
import java.util.Stack;

//Stack and vector are known as legacy clases..they both provide synchronization process
public class StackDemo {

	public static void main(String[] args) {
		//to add homogenous values:
            Stack s=new Stack();
            s.add('s');
            s.add("vivek ji");
            s.add(null);
            s.add(true);
            
         //to iterate the stack list:1.for loop2.for each3.Iterator4.Enumeration
            for( int i=0;i<s.size();i++) {
            	System.out.println(s.get(i));
            	}
            Enumeration e=s.elements();
            while(e.hasMoreElements()) {
            	System.out.println(e.nextElement());
            }
            //Lifo:to print last inserted element
            System.out.println(s.peek());
            //to push/add any element in the stack
            System.out.println(s.push('e'));
            for(int i=0;i<s.size();i++) {
            	System.out.println(s.get(i));
            }
            //to pop(remove)any element from the stack
            System.out.println(s.pop());
	}
	

}
