package Day11;
import java.util.*; 
public class ListIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>(); 
        list.add("Ravi"); 
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
         
        System.out.println("Traversing list through List Iterator:");  
        ListIterator<String> list1=list.listIterator(list.size());  

        while(list1.hasPrevious())  
        {  
            String str=list1.previous();  
            System.out.println(str);  
        }  
        System.out.println("Traversing list through for loop:");  
     for(int i=0;i<list.size();i++)  
     {  
      System.out.println(list.get(i));     
     }  


	}

}
