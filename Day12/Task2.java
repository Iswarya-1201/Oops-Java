package Day12;
import java.util.*;
import java.util.HashMap;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Employee> list = new ArrayList<>();
		 HashMap<Integer, String> departments = new HashMap<>();
		 departments.put(101,"java development");
	     departments.put(102,"python development");
	     departments.put(103,"testing");
	        list.add(new Employee(1,"arun",101,30000));
	        list.add(new Employee(2,"bala",102,25000));
	        list.add(new Employee(3,"charan",101, 40000));
	        list.add(new Employee(4,"divya",103,35000));
	        list.add(new Employee(5,"eswar",102,50000));
	        
	        System.out.println("all emp details");
	        Iterator<Employee> it=list.iterator();
	        while (it.hasNext()) {
	            Employee e=it.next();
	            e.display(departments);
	        }
	        int searchId=3;
	        boolean found=false;

	        System.out.println("\nsearch emp");

	        for(Employee e:list){
	            if (e.empid==searchId){
	                e.display(departments);
	                found=true;
	                break;
	            }
	        }

	        if(!found){
	            System.out.println("emp not found");
	        }
	        
	        
	        int removeId=2;
	        boolean removed=false;

	        Iterator<Employee> itr=list.iterator();

	        while(itr.hasNext()){
	            Employee e=itr.next();

	            if (e.empid==removeId){
	                System.out.println("\ndeleted emp");
	                e.display(departments);

	                itr.remove();
	                removed=true;
	                break;
	            }
	        }
	        if(!removed){
	            System.out.println("emp not found");
	        }
	        
	        System.out.println("\ndept-wise emp");

	        for(Integer id:departments.keySet()){
	        	System.out.println("\ndepartment: "+departments.get(id));

	            for (Employee e:list){
	                if (e.deptid==id){
	                    System.out.println(e.empname);
	                }
	            }
	        }
	        
	        Collections.sort(list,new Comparator<Employee>(){
	        	public int compare(Employee e1, Employee e2){
	                return Double.compare(e1.salary, e2.salary);
	            }
	        });

	        System.out.println("\nemp sorted by salary");
	        for(Employee e:list){
	            e.display(departments);
	        }
	        Employee highest=list.get(0);

	        for(Employee e:list){
	            if(e.salary>highest.salary){
	                highest=e;
	            }
	        }

	        System.out.println("\nhighest paid emp");
	        highest.display(departments);
		
	}

}
class Employee{
	int empid;
	String empname;
	int deptid;
	double salary;
	
	Employee(int empid,
	String empname,
	int deptid,
	double salary){
		this.empid=empid;
		this.empname=empname;
		this.deptid=deptid;
		this.salary=salary;
		
	}
	void display(HashMap<Integer,String>departments){
		System.out.println("id "+empid);
		System.out.println("Name "+empname);
		System.out.println("department "+departments.get(deptid));
		System.out.println("salary "+salary);
		
	}
}
