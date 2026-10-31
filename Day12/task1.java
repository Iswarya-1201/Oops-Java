package Day12;
import java.util.*;
public class task1 {
	static void addstudent(ArrayList<student> list,HashSet<Integer>set,int id,String name,String department,int marks){
		if(set.contains(id)){
			System.out.println("dublicate id not allowed");
			
			
		}else{
			student s=new student();
			s.id=id;
			s.name=name;
			s.department=department;
			s.marks=marks;
			list.add(s);
			set.add(id);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> list=new ArrayList<>();
		HashSet<Integer> set=new HashSet<>();
		addstudent(list,set,101,"a","cse",85);
		addstudent(list,set,102,"b","it",80);
		addstudent(list,set,103,"c","ece",70);
		addstudent(list,set,104,"d","it",75);
		addstudent(list,set,105,"e","cse",85);
		System.out.println("Student details ");
		Iterator<student> it=list.iterator();
		while(it.hasNext()){
			student s=it.next();
			System.out.println(s.id+" "+s.name+" "+s.department+" "+s.marks);
			
		}
		
		System.out.println("serach student");
		int searchid=102;
		boolean found=false;
		for(student s:list){
			if(s.id==searchid){
				System.out.println("student found "+s.name);
				found=true;
				break;
				
			}
			
		}
		if(!found){
			System.out.println("Student not found ");
			
		}
		
		System.out.println("duplicate checking");
		addstudent(list,set,101,"a","ece",80);
		
		System.out.println("remove student ");
		Iterator<student> itr=list.iterator();
		while(itr.hasNext()){
			student s=itr.next();
			if(s.id==103){
				itr.remove();
				set.remove(s.id);
				System.out.println("Deleted "+s.name);
				break;
				
			}
			
		}
		int max=0;
		student top=null;
		for(student s:list){
			if(s.marks>max){
				max=s.marks;
				top=s;
				
			}
			
		}
		System.out.println("top score ");
		System.out.println(top.id+" "+top.name+" "+top.department+" "+top.marks);
		
		
		
		

	}

}
class student{
	int id;
	String name;
	String department;
	int marks;
	
}
