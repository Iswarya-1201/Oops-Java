package Day4;

public class MultipleInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ob=new Manager();
		System.out.println(ob.name);
		System.out.println(ob.department);
		ob.display();

	}

}
class Person{
	String name="Iswarya K";
	int age=20;
	
}
class Employee extends Person{
	int employee_ID =1;
 int salary=10000;
 void display(){
		System.out.println(super.name);
		System.out.println(super.age);
		
		}
	
}
class Manager extends Employee{
	String department ="it";
	String name="Rani";
	void display(){
	System.out.println(super.employee_ID);
	System.out.println(super.salary);
	super.display();
	
	}
	
}
