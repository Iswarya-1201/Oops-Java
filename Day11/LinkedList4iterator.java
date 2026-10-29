package Day11;
import java.util.*;
public class LinkedList4iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("Ravi");  
	    ll.add("Vijay");  
	    ll.add("Ajay");  
	    Iterator i=ll.descendingIterator();  
	    while(i.hasNext())  
	    {  
	    	System.out.println(i.next());  
	           }  
		


	}

}
