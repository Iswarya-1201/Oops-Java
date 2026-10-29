package Day11;
import java.util.*;  
public class Linkedlistremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();  
        System.out.println(ll);  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        System.out.println(ll); 
         
        ll.add(1, "Gaurav");  
        System.out.println(ll);  
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Sonoo");  
        ll2.add("Hanumat");  
        ll.addAll(ll2);  
        System.out.println(ll);  
        LinkedList<String> ll3=new LinkedList<String>();  
        ll3.add("John");  
        ll3.add("Rahul");  
        ll.addAll(1, ll3);  
        System.out.println(ll);  
        ll.addFirst("Lokesh");  
        System.out.println(ll);  
        ll.addLast("Harsh");  
        System.out.println(ll);  
        
        ll.remove("Vijay");  
        System.out.println("After invoking remove(object) method: "+ll);   
        ll.remove(0);  
        System.out.println("After invoking remove(index) method: "+ll);   
        LinkedList<String> ll4=new LinkedList<String>();  
        ll4.add("Ravi");  
        ll4.add("Hanumat");  
        ll.addAll(ll4);  
        System.out.println("Updated list : "+ll);
        ll.removeAll(ll4);  
        System.out.println("After invoking removeAll() method: "+ll);   
        ll.removeFirst();  
        System.out.println("After invoking removeFirst() method: "+ll);  
        ll.removeLast();  
        System.out.println("After invoking removeLast() method: "+ll);  
        ll.removeFirstOccurrence("Gaurav");  
        System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
    
        ll.removeLastOccurrence("Harsh");  
        System.out.println("After invoking removeLastOccurrence() method: "+ll);  

        ll.clear();  
        System.out.println("After invoking clear() method: "+ll);   





	}

}
