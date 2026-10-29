package Day11;
import java.util.*;
import java.util.ArrayList;

public class basiciterato1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>(); 
        list.add("Ravi"); 
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay"); 
        Iterator<String> i= list.iterator ();
    	while(i.hasNext())
    	{
    		System.out.println(i.next());
    	}
        System.out.println("Traversing list through forEach() method:");  
         
            list.forEach(a->{ 
                System.out.println(a);  
              });  
                

            System.out.println("Traversing list through forEachRemaining() method:");  
              Iterator<String> itr=list.iterator();  
              itr.forEachRemaining(a-> 
              {  
            System.out.println(a);  
              });  
  
 



	}

}
